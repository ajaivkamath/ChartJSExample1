package com.vfamp.dashboard.enums;


public enum ChartType {
    PIE_CHART ("pie","Pie Chart"), 
    BAR_CHART ("bar","Bar Chart"), 
    LINE_CHART ("line","Line Chart"), 
    DOUGHNUT_CHART ("doughnut", "Doughnut Chart"),
    RADAR_CHART ("radar","Radar Chart"), 
    POLAR_AREA_CHART ("polarArea","PolarArea Chart");
	private String value;
	private String name; 
    
    ChartType(String value)
    {
    	this.setValue(value);
    	
    }

    ChartType(String name, String value)
    {
    	this.setName(name);
    	this.setValue(value);
    	
    }
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}