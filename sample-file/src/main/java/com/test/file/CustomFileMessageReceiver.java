package com.test.file;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.mule.api.construct.FlowConstruct;
import org.mule.api.endpoint.InboundEndpoint;
import org.mule.api.lifecycle.CreateException;
import org.mule.api.transport.Connector;
import org.mule.transport.file.FileConnector;
import org.mule.transport.file.FileMessageReceiver;

public class CustomFileMessageReceiver extends FileMessageReceiver {

	public CustomFileMessageReceiver(Connector connector, FlowConstruct flowConstruct, InboundEndpoint endpoint,
			String readDir, String moveDir, String moveToPattern, long frequency) throws CreateException {
		super(connector, flowConstruct, endpoint, readDir, moveDir, moveToPattern, frequency);
	}

	protected void basicListFiles(File currentDirectory, List<File> discoveredFiles) {
		File[] files = currentDirectory.listFiles(new MyFileNameFilter());

		if (files == null) {
			return;
		}

		for (File file : files) {
			if (!file.isDirectory()) {
				discoveredFiles.add(file);
			} else {
				if (((FileConnector) connector).isRecursive()) {
					this.basicListFiles(file, discoveredFiles);
				}
			}
		}
	}

	public static class MyFileNameFilter implements FilenameFilter {
		
		private String pattern = "^[a-zA-Z]+-" + new SimpleDateFormat("yyyyMMdd").format(new Date()) +  ".txt";

		@Override
		public boolean accept(File dir, String name) {			
			return name.matches(pattern);
		}
	}
}
