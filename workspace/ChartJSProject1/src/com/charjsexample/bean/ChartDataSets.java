package com.charjsexample.bean;

public class ChartDataSets {
	
	private Object[] data;
	private Object[] backgroundColor;
	private String label;
	/**
	 * @return the backgroundColor
	 */
	public Object[] getBackgroundColor() {
		return backgroundColor;
	}
	/**
	 * @param backgroundColor the backgroundColor to set
	 */
	public void setBackgroundColor(Object[] backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	/**
	 * @return the data
	 */
	public Object[] getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object[] data) {
		this.data = data;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

}
