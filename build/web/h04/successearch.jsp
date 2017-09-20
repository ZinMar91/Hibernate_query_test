<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Search by City and Address</title>
    </head>
    <body>
        <h3>List of Search by City and Address</h3>
        <s:if test="list.size()>=0">
            <table border="1">
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Gender</th>
                    <th>NRC</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>PhNo</th>
                    <th>Phone Type</th>

                </tr>

                <s:iterator value="list">
                    <tr>
                        <td><s:property value="cname"/></td>
                        <td><s:property value="age"/></td>
                        <td><s:property value="gender"/></td>
                        <td><s:property value="nrc"/></td>
                        <td><s:property value="cdetail.email"/></td>
                        <td><s:property value="cdetail.address"/></td>
                        <td><s:property value="cdetail.city"/></td>
                        <td><s:property value="cdetail.phno"/></td>
                        <td><s:property value="p.phonetype"/></td>

                    </tr>


                </s:iterator>
            </table>
        </s:if>
        <s:url action="h04_index1" var="index"/>
        <h4><s:a href="%{index}">Go Back to Search Again Home</s:a><br></h4>
    </body>
</html>