package com.charjsexample.bean;


public class ChartData {

	private ChartDataSets[] datasets;
	private Object[] labels;
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
}
