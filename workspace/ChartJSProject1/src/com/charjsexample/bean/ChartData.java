package com.charjsexample.bean;


public class ChartData {

	private ChartDataSets[] datasets;
	private Object[] label;
	private ChartOptions options;
	/**
	 * @return the datasets
	 */
	public ChartDataSets[] getDatasets() {
		return datasets;
	}
	/**
	 * @param datasets the datasets to set
	 */
	public void setDatasets(ChartDataSets[] datasets) {
		this.datasets = datasets;
	}
	/**
	 * @return the label
	 */
	public Object[] getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(Object[] label) {
		this.label = label;
	}
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

}
