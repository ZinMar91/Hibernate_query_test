<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>ACME Company</title>
</head>
<body>	
	<s:if test="clist.size()>0">
		<table border="1" align="center">
		<caption >Customer Information Result</caption>
		<tr bgcolor="lightgreen">
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>		
		</tr>
		<s:iterator value="clist">
		<tr>
		 <td><s:property value="userName"/> </td>
		 <td><s:property value="email"/></td>
		 <td><s:property value="address"/></td>
		 </tr>
		 </s:iterator>
		</table>		
	</s:if>
	<s:else>
		<h3> No Customer Information Found</h3>
		
	</s:else>
	
	
<s:url action="index" var="index"/>
Click <a href="${index}">Here</a> to Back to Index
</body></html>