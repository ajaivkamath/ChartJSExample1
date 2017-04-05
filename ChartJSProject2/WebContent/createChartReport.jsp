<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create a new Chart</title>
</head>
<body>

<s:form action="chartData" method="get">

	<s:textfield name="chartBean.chartName" label="Chart Name" requiredLabel="true" maxlength="50"/>
	<s:textfield name="chartBean.title" label="Chart Title" requiredLabel="true" maxlength="50" />
	<s:select name="chartBean.chartType" label="Chart Type" list="chartTypeList" listKey="label"  listValue="value" />
	
	<s:submit/>
</s:form>


</body>
</html>