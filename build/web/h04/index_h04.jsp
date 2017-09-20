<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Phone Selling</title>
    </head>
    <body>
    <body>
        <h3>Phone Selling System</h3>
        <hr/>

        <s:url action="h04_insertphone" var="insertphone"/>
        <h4><s:a href="%{insertphone}">Insert New Phone Type</s:a><br></h4>

        <s:url action="h04_insertcustomer" var="insertcustomer"/>
        <h4><s:a href="%{insertcustomer}">Insert New Customer</s:a><br></h4>

        <s:url action="h04_searchnocity" var="searchnocity"/>
        <h4><s:a href="%{searchnocity}">Search by Address and City</s:a><br></h4>


    </body>
</html>