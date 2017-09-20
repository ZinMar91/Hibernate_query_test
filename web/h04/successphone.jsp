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
        <h3>Successfully Inserted</h3>
        <h4>Phone Type id: <s:property value="id"/></h4>
        <s:url action="h04_index1" var="index"/>
        <h4><s:a href="%{index}">Go to Home</s:a><br></h4>
    </body>
</html>