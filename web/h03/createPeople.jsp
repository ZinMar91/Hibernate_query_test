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
	<h3>Insert New Voting People</h3>
	<hr>
	<s:form action="insertvote" theme="simple">
		<table>
			<tr>
				<td>Name:</td>
				<td><s:textfield name="v.name" size="20"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Age(yrs):</td>
				<td><s:textfield name="v.age" size="20"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Gender:</td>
				<td><s:radio name="v.gender" list="{'Male','Female'}" value="%{'Male'}"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>NRC:</td>
				<td><s:textfield name="v.vdetail.nrc" size="20"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Township:</td>
				<td><s:textfield name="v.vdetail.township" size="20"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>City:</td>
				<td><s:textfield name="v.vdetail.city" size="20"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>PhoneNo:</td>
				<td><s:textfield name="v.vdetail.phno" size="20"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Religious:</td>
				<td><s:radio name="v.religion" list="{'Buddhist','Christian','Hanu','Muslim'}" value="%{'Buddhist'}"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Nationality:</td>
				<td><s:textfield name="v.nationality" size="20"/></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Party Name:</td>
				<td><s:select name="pname" list="partynamelist" /></td>
				<td></td>
			</tr>
			
			<tr>
				<td colspan="3"><s:submit name="submit" value="Submit"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>