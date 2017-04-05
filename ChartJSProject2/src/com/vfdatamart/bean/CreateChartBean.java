package com.vfdatamart.bean;

import java.util.List;

public class CreateChartBean {
	private String chartName;
	private String chartType;
	private String title;
	private List<String> chartTypeKeyList;
	private List<String> chartTypeValueList;
	
	public String getChartName() {
		return chartName;
	}
	public void setChartName(String chartName) {
		this.chartName = chartName;
	}
	public String getChartType() {
		return chartType;
	}
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getChartTypeKeyList() {
		return chartTypeKeyList;
	}
	public void setChartTypeKeyList(List<String> chartTypeKeyList) {
		this.chartTypeKeyList = chartTypeKeyList;
	}
	public List<String> getChartTypeValueList() {
		return chartTypeValueList;
	}
	public void setChartTypeValueList(List<String> chartTypeValueList) {
		this.chartTypeValueList = chartTypeValueList;
	}
	

	
}
