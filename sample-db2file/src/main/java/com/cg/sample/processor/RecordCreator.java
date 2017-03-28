package com.cg.sample.processor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class RecordCreator implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		List<Map<String, String>> records = new ArrayList<Map<String, String>>();
		Map<String, String> record = new LinkedHashMap<String, String>();
		System.out.println(LinkedHashMap.class.getProtectionDomain().getCodeSource().getLocation());
		record.put("name", "FN1-MN1-LN1");
		record.put("address", "HNo1-Street1-City1");
		records.add(record);
		record = new LinkedHashMap<String, String>();
		record.put("name", "FN2-MN2");
		record.put("address", "HNo2-Street2-City2-State2-Country2");
		records.add(record);

		return records;
	}

}
