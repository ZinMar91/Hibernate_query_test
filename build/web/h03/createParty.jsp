
    
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Insert Party Information</h3>
	<hr>
	<s:form action="insertparty" theme="simple">
	<table>
		<tr>
			<td>Party Name</td>
			<td>	<s:textfield name="party.partyname" size="20"/></td>
			<td></td>
		</tr>
	
	<tr>
			<td>Acronym</td>
			<td>	<s:textfield name="party.acronym" size="20"/></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="3">
				<s:submit name="submit" value="Insert Party"/>
			</td>
		</tr>
		</table>
	</s:form>
</body>
</html>