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
        <h1>Customer Data for Phone Selling</h1>
        <s:form action="h04_customerdata" theme="simple">
            <table>
                <tr>
                    <td>

                        Customer's Name:</td>
                    <td>
                        <s:textfield name="cust.cname" size="20"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Age:</td>
                    <td>
                        <s:textfield name="cust.age" size="20"/></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><s:radio name="cust.gender" list="{'Male','Female'}" value="%{'Male'}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        NRC:</td>
                    <td>
                        <s:textfield name="cust.nrc" size="20"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Email:</td>
                    <td>
                        <s:textfield name="cust.cdetail.email" size="20"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Address:</td>
                    <td>
                        <s:textfield name="cust.cdetail.address" size="20"/></td>
                </tr>
                <tr>
                    <td>
                        City:</td>
                    <td>
                        <s:textfield name="cust.cdetail.city" size="20"/></td>
                </tr>
                <tr>
                    <td>
                        Phone No:</td>
                    <td>
                        <s:textfield name="cust.cdetail.phno" size="20"/></td>
                </tr>
                <tr>
                    <td>
                        Phone id:</td>
                    <td>
                        <s:textfield name="cust.p.id" size="20"/></td>
                <tr>
                    <td></td>
                    <td>
                        <s:submit value="Save Customer"></s:submit></td>
                    </tr>
                </table>
        </s:form>
    </body>
</html>