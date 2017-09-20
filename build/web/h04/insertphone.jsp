<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Phone Selling Data</title>
    </head>
    <body>
        <h3>Insert Phone Type</h3>
        <s:form action="h04_inserttype" theme="simple">
            <h4>Insert Phone Type:
                <s:textfield name="p.phonetype" size="20"/></h4>
                <s:submit value="Save"/>
            </s:form>
    </body>
</html>