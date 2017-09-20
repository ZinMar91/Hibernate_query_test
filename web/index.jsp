<%-- 
    Document   : index
    Created on : Sep 20, 2017, 6:51:06 PM
    Author     : Admin
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hibernate query!</h1>
        01 : <s:a action="h01_index">Hibernate_Query</s:a><br/><br/>
        02 : <s:a action="h02_index">Hibernate_CreateQuery</s:a><br/><br/>
        03 : <s:a action="h03_index">Hibernate_NativeQuery</s:a><br/><br/>
        04 : <s:a action="h04_index">Hibernate_Test</s:a><br/><br/>
    </body>
</html>
