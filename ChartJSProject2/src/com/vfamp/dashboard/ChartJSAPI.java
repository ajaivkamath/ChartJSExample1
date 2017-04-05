package com.vfamp.dashboard;
import java.util.Random;

import com.charjsexample.bean.*;
import com.google.gson.Gson;
import com.vfamp.dashboard.enums.ChartType;


public class ChartJSAPI {
	Random rand = new Random();
	public boolean autoBackgroundColor = true;
	public boolean autoHoverBackgroundColor = true;
	public boolean autoBorderColor = true;
	public String chartType = ChartType.LINE_CHART.getValue();
	public String title = "Sample Title";
	public String[] backgroundColor;
	public double backgroundTransparency; 
	public double hoverBackgroundTransparency;
	public double bordeTransparency;
	public String[] hoverBackgroundColor;
	public String[] borderColor;
	

	public Object[] legends = new String[]{"ace","boom","crew","dog","eon"};
	public Integer[] data = new Integer[]{10,20,30,30,10};
	
	public boolean responsive = true;
	public Boolean fill;
	public double lineTension = 0.1;
	
	ChartData chartData;
	ChartBaseBean chartBaseBean;
	ChartDataSets chartDataSets; 
	ChartOptions chartOptions;
	ChartTicks chartTicks;
	ChartYAxes chartYAxes;
	ChartScales chartScales;
	ChartTitle chartTitle;
	
	public void setConfiguration()
	{
		chartData = new ChartData();
		chartBaseBean = new ChartBaseBean();
		chartDataSets = new ChartDataSets(); 
		chartOptions = new ChartOptions();
		chartTicks = new ChartTicks(); 
		chartYAxes = new ChartYAxes() ;
		chartScales = new ChartScales();
		chartTitle = new ChartTitle();
		
		chartDataSets.setData(data);
		
		backgroundTransparency = 2.0;
		hoverBackgroundTransparency = 0.3;
		bordeTransparency = 2.0;
		
		if (autoBackgroundColor)
		{
			backgroundColor = new String[data.length];
			for (int i = 0;i < data.length;i++)
			{
//				backgroundColor[i] = String.format("#%02x%02x%02x", rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
				backgroundColor[i] = "rgba(" +  rand.nextInt(255) + "," + rand.nextInt(255) + "," + rand.nextInt(255) + "," + backgroundTransparency + ")";
			}
		}
		
		
		if (autoHoverBackgroundColor)
		{
			hoverBackgroundColor = new String[data.length];
			for (int i = 0;i < data.length;i++)
			{
				if (autoBackgroundColor)
					hoverBackgroundColor[i] = backgroundColor[i].replaceAll(Double.toString(backgroundTransparency), Double.toString(hoverBackgroundTransparency));
				else
					hoverBackgroundColor[i] = "rgba(" +  rand.nextInt(255) + "," + rand.nextInt(255) + "," + rand.nextInt(255) + "," + hoverBackgroundTransparency + ")";
					
					
			}
		}
		if (autoBorderColor)
		{
			borderColor = new String[data.length];
			for (int i = 0;i < data.length;i++)
			{
				if (autoBackgroundColor)
					borderColor[i] = backgroundColor[i].replaceAll(Double.toString(backgroundTransparency), Double.toString(bordeTransparency));
				else
					borderColor[i] = "rgba(" +  rand.nextInt(255) + "," + rand.nextInt(255) + "," + rand.nextInt(255) + "," + bordeTransparency + ")";
//				borderColor[i] = String.format("#%02x%02x%02x", rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
			}
		}
		if (fill == null)
		{
			if (chartType.equals(ChartType.LINE_CHART.getValue()))
			{
				fill = false;
			}
			else
			{
				fill = true;				
			}
			
		}
		
		
		chartDataSets.setBackgroundColor(backgroundColor);
		chartDataSets.setHoverBackgroundColor(hoverBackgroundColor);
		chartDataSets.setBorderColor(borderColor);
		chartDataSets.setLabel(title);
		chartDataSets.setFill(fill);
		chartDataSets.setLineTension(lineTension);;

		chartTitle.setDisplay(true);
		chartTitle.setText(title);
		
		chartOptions.setTitle(chartTitle);
		chartOptions.setResponsive(responsive);
		
		if (!chartType.equals(ChartType.DOUGHNUT_CHART.getValue()) && !chartType.equals(ChartType.PIE_CHART.getValue()))
		{
			chartTicks.setBeginAtZero(true);
			chartYAxes.setTicks(chartTicks);
			chartScales.setyAxes(new ChartYAxes[] {chartYAxes});
			chartOptions.setScales(chartScales);
		}

		
		chartData.setLabel(legends);
		chartData.setDatasets(new ChartDataSets[] {chartDataSets});

		chartBaseBean.setOptions(chartOptions);
		chartBaseBean.setType(chartType);
		chartBaseBean.setData(chartData);		
		
	}
	
	String listJSON;

	public String getListJSON() {
		return listJSON;
	}


	public String getChartData()
	{
		Gson gson = new Gson();
		this.setConfiguration();

		return gson.toJson(chartBaseBean);
		
	}	
	

}
