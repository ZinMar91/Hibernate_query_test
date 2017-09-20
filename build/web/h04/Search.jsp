<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Search By City and Address</title>
    </head>
    <body>
        <h3>Search by Address and City</h3>
        <s:form action="h04_Searchbynocity" theme="simple">
        <tr>
            <td>
                Customer Address:</td>
            <td>
                <s:textfield name="address" size="20"/></td>
        </tr>
        <tr>
            <td>
                City:</td>
            <td>
                <s:textfield name="city" size="20"/></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <s:submit value="Search"/></td>
        </tr>
    </s:form>
</body>
</html>