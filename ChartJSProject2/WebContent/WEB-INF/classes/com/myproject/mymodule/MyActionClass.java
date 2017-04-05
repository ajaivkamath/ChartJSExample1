package com.myproject.mymodule;

import java.util.List;

import com.myproject.mybean.MyLoginBean;
import com.myproject.mydao.LoginDAO;

public class MyActionClass {
	
	MyLoginBean lBean;
	LoginDAO loginDao;
	List<MyLoginBean> lUserList;

	public List<MyLoginBean> getlUserList() {
		return lUserList;
	}


	public MyActionClass() {
		loginDao = new LoginDAO();
	}
	
	
	public MyLoginBean getlBean() {
		return lBean;
	}


	public void setlBean(MyLoginBean lBean) {
		this.lBean = lBean;
	}


	public String registerProcess()
	{
		return  loginDao.registerBean(lBean);
	}
	
	
	public String loginProcess()
	{
		return loginDao.verifylogin(lBean);
	}
	
	public String userListPrint()
	{
		lUserList = loginDao.getUserList();
		return "SUCCESS";
		
	}
	

}
