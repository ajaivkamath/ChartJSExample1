package com.vfdatamart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vfamp.dashboard.ChartJSAPI;

public class ChartDataMartDAO {
	
	private SessionFactory sFactory;
	private Session session;
	
	public ChartDataMartDAO()
	{
		if (sFactory == null)
		{
			sFactory = new Configuration().configure()
			        .buildSessionFactory();
		}		
		session=sFactory.openSession();
	}
	
	public  getChartData(ChartJSAPI charAPI)
	
	

}
