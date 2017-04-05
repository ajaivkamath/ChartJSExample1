package com.charjsexample.bean;

public class ChartOptions {
	
	private boolean responsive;
	private ChartScales scales;
	private ChartTitle title;

	/**
	 * @return the responsive
	 */
	public boolean isResponsive() {
		return responsive;
	}

	/**
	 * @param responsive the responsive to set
	 */
	public void setResponsive(boolean responsive) {
		this.responsive = responsive;
	}

	/**
	 * @return the scales
	 */
	public ChartScales getScales() {
		return scales;
	}

	/**
	 * @param scales the scales to set
	 */
	public void setScales(ChartScales scales) {
		this.scales = scales;
	}

	/**
	 * @return the title
	 */
	public ChartTitle getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(ChartTitle title) {
		this.title = title;
	}

}
