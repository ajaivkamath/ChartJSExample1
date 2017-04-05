package com.charjsexample.bean;

public class ChartDataSets {
	
	private Object[] data;
	private Object[] backgroundColor;
	private Object[] borderColor;
	private Object[] hoverBackgroundColor;	
	private int borderWidth = 1;
	private String label;
	private boolean fill;
	private double lineTension;

	public boolean isFill() {
		return fill;
	}
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	
	/**
	 * @return the backgroundColor
	 */
	public Object[] getBackgroundColor() {
		return backgroundColor;
	}
	public Object[] getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(Object[] borderColor) {
		this.borderColor = borderColor;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
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
	/**
	 * @return the hoverBackgroundColor
	 */
	public Object[] getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}
	/**
	 * @param hoverBackgroundColor the hoverBackgroundColor to set
	 */
	public void setHoverBackgroundColor(Object[] hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}
	public double getLineTension() {
		return lineTension;
	}
	public void setLineTension(double lineTension) {
		this.lineTension = lineTension;
	}

}
