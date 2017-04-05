package com.charjsexample.Actions;

import java.util.ArrayList;
import java.util.List;

import com.vfamp.dashboard.ChartJSAPI;
import com.vfamp.dashboard.enums.ChartType;
import com.vfdatamart.bean.CreateChartBean;
import com.vfdatamart.bean.LabelValueBean;
import com.vfdatamart.dao.ChartDataMartDAO;

public class ChartAction {
	

//	ChartData chartData;
//	ChartBaseBean chartBaseBean;
//	ChartDataSets chartDataSets; 
//	ChartOptions chartOptions;
	private CreateChartBean chartBean;
	ChartJSAPI charAPI;
	private ChartDataMartDAO chartDataMartDAO;
	
	private List<LabelValueBean> chartTypeList;

	public List<LabelValueBean> getChartTypeList() {
		return chartTypeList;
	}

	private String listJSON;

	public String getListJSON() {
		return listJSON;
	}

	public ChartAction() {
		charAPI = new ChartJSAPI();
		chartTypeList = new ArrayList<LabelValueBean>();

		for (ChartType dir : ChartType.values())
		{
			chartTypeList.add(new LabelValueBean(dir.getName(), dir.getValue()));
		}
		
		chartDataMartDAO = new ChartDataMartDAO();
		
	}

	public String execute()
	{
		return "SUCCESS";
	}
	
	public String getChartData()
	{
//		charAPI.autoBackgroundColor = tru;
//		charAPI.autoBackgroundColor = false;
//		charAPI.chartType =  ChartType.BAR_CHART.getValue();
		
		
		
		
		charAPI.chartType = chartBean.getChartType();
		charAPI.title = chartBean.getTitle();
		charAPI.data = new Integer[] {30,20,30,40};
		charAPI.legends = new String[] {"Test1","Test2","Test3","Test4"};
		listJSON = charAPI.getChartData();
		
		return "SUCCESS";
		
	}

	public CreateChartBean getChartBean() {
		return chartBean;
	}

	public void setChartBean(CreateChartBean chartBean) {
		this.chartBean = chartBean;
	}

}
