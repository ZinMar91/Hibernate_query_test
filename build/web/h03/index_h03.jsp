<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Online Voting System for Election</h3>
<hr/>

		<s:url action="createparty" var="createParty"/>
		<s:a href="%{createParty}">Create New Party</s:a><br>
		
		<s:url action="createpeople" var="createPeople"/>
		<s:a href="%{createPeople}">Create New Voting People</s:a><br>
		
		<s:url action="searchvoting" var="searchVoting"/>
		<s:a href="%{searchVoting}">Search</s:a><br>
	
</body>
</html>