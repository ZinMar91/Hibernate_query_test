<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Voting List by Nationality</h3>
	<s:if test="list.size()>0">
	<table>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			<th>NRC</th>
			<th>Township</th>
			<th>City</th>
			<th>Phone No</th>
			<th>Religious</th>
			<th>Party Code</th>
			<th>Party Name</th>
			
		</tr>
		
		<s:iterator value="list">
			<tr>
				<td><s:property value="name"/></td>
				<td><s:property value="age"/></td>
				<td><s:property value="gender"/></td>
				<td><s:property value="vdetail.nrc"/></td>
				<td><s:property value="vdetail.township"/></td>
				<td><s:property value="vdetail.city"/></td>
				<td><s:property value="vdetail.phno"/></td>
				<td><s:property value="religion"/></td>
				<td><s:property value="p.pid"/></td>
				<td><s:property value="p.partyname"/></td>
			</tr>
			
			
		</s:iterator>
	</table>
	</s:if>
</body>
</html>