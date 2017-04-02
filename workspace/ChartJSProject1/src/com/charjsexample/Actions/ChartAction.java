package com.charjsexample.Actions;


import java.util.Arrays;

import com.charjsexample.bean.ChartBean;
import com.google.gson.Gson;

public class ChartAction {
	

	ChartBean chartBean;
	String listJSON;

	public String getListJSON() {
		return listJSON;
	}

	public ChartAction() {
		chartBean = new ChartBean();
		chartBean.setData(Arrays.asList(new int[]{10,20,30,30,10}));
		chartBean.setLabel(Arrays.asList(new String[]{"ace","boom","crew","dog","eon"}));
	}

	public ChartBean getChartBean() {
		return chartBean;
	}
	
	public String getChartData()
	{
		Gson gson = new Gson();

		listJSON = gson.toJson(chartBean);
		
		return "SUCCESS";
		
	}
	
	

}
