package com.cg.sample.output.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OutputRecords implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2956320660056825835L;
	
	private List<String> records = new ArrayList<String>();

	public List<String> getRecords() {
		return records;
	}

	public void setRecords(List<String> records) {
		this.records = records;
	}
	
	public void addRecord(String record) {
		this.records.add(record);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(String record: this.records){
			result.append(record);
			result.append(System.lineSeparator());
		}
		
		return result.toString();
	}
	
	

}
