package com.charjsexample.Actions;


import java.util.Arrays;
import java.util.Random;

import com.charjsexample.bean.ChartBaseBean;
import com.charjsexample.bean.ChartData;
import com.charjsexample.bean.ChartDataSets;
import com.charjsexample.bean.ChartOptions;
import com.google.gson.Gson;

public class ChartAction {
	

	ChartData chartData;
	ChartBaseBean chartBaseBean;
	ChartDataSets chartDataSets; 
	ChartOptions chartOptions;
	
	
	String listJSON;

	public String getListJSON() {
		return listJSON;
	}

	public ChartAction() {
		Random rand = new Random();

		chartBaseBean = new ChartBaseBean();
		chartDataSets = new ChartDataSets(); 
		chartOptions = new ChartOptions();
		chartData = new ChartData();
		
		chartDataSets.setData(new Integer[]{10,20,30,30,10});
		chartDataSets.setBackgroundColor(new String[] {String.format("#%02x%02x%02x", rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)),String.format("#%02x%02x%02x", rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)),String.format("#%02x%02x%02x", rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)),String.format("#%02x%02x%02x", rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)),String.format("#%02x%02x%02x", rand.nextInt(255), rand.nextInt(255), rand.nextInt(255))});
		chartDataSets.setLabel("Dataset 2");

		chartOptions.setResponsive(true);
		
		chartData.setLabel(new String[]{"ace","boom","crew","dog","eon"});
		chartData.setDatasets(new ChartDataSets[] {chartDataSets});
		chartData.setOptions(chartOptions);
		
		chartBaseBean.setType("pie");
		chartBaseBean.setData(chartData);
		
	}

	public String getChartData()
	{
		Gson gson = new Gson();

		listJSON = gson.toJson(chartBaseBean);
		
		return "SUCCESS";
		
	}
	
	

}
