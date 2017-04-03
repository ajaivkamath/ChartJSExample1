package com.charjsexample.bean;


public class ChartData {

	private ChartDataSets[] datasets;
	private Object[] labels;
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
	public Object[] getLabels() {
		return labels;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(Object[] labels) {
		this.labels = labels;
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
