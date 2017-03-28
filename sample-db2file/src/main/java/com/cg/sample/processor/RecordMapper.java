package com.cg.sample.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.cg.sample.output.vo.OutputRecords;

public class RecordMapper implements Callable {

	@SuppressWarnings("unchecked")
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		List<Map<String, String>> dbRecords = (List<Map<String, String>>) eventContext.getMessage()
				.getPayload();
		List<String> columnNames = new ArrayList<String>(dbRecords.get(0).keySet());
		int noOfColumns = columnNames.size();
		Integer[] maxSplitForColumns = new Integer[noOfColumns];
		
		for (Map<String, String> dbRecord : dbRecords) {			
			for (int i = 0; i < noOfColumns; i++) {
				
				if (maxSplitForColumns[i] != null) {
					if (maxSplitForColumns[i] < dbRecord.get(columnNames.get(i)).split("-").length) {
						maxSplitForColumns[i] = dbRecord.get(columnNames.get(i)).split("-").length;
					}
				} else {
					maxSplitForColumns[i] = dbRecord.get(columnNames.get(i)).split("-").length;
				}				
			}
		}

		OutputRecords outputRecords = new OutputRecords();
		// add headers
		StringBuilder headerRecord = new StringBuilder();
		for (int i = 0; i < columnNames.size(); i++) {
			int size = maxSplitForColumns[i].intValue();
			for (int j = 1; j <= size; j++) {
				headerRecord.append(columnNames.get(i) + j + ",");
			}
		}
		String headerData = headerRecord.toString();
		headerData = headerData.substring(0, headerData.length() - 1);
		outputRecords.addRecord(headerData);		

		// add data records
		for (Map<String, String> dbRecord : dbRecords) {
			StringBuilder dataRecord = new StringBuilder();
			for (int i = 0; i < noOfColumns; i++) {
				int splitSize = maxSplitForColumns[i].intValue();
				String[] fields = dbRecord.get(columnNames.get(i)).split("-");
				for (String field : fields) {
					dataRecord.append(field + ",");
				}
				if (fields.length < splitSize) {
					for (int j = fields.length; j < splitSize; j++) {
						dataRecord.append(",");
					}
				}
			}
			String data = dataRecord.toString();
			data = data.substring(0, data.length() - 1);			
			outputRecords.addRecord(data);
		}

		return outputRecords;
	}

}
