package com.charjsexample.bean;

public class ChartBaseBean {
	
	private String type;
	private ChartData data;
	private ChartOptions options;

	/**
	 * @return the options
	 */
	public ChartOptions getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(ChartOptions options) {
		this.options = options;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the data
	 */
	public ChartData getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(ChartData data) {
		this.data = data;
	}
	
}
