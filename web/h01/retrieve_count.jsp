<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>ACME Company</title>
</head>
<body>	
	<s:if test="custcount.size()>0">
		<table border="1" align="center">
		<caption >Customer Information Result</caption>
		<tr bgcolor="lightgreen">
		<th>Address</th>
		<th>Count</th>				
		</tr>
		<s:iterator value="custcount">
		<tr>
		 <td><s:property value="address"/> </td>
		 <td><s:property value="count"/></td>
		 
		 </tr>
		 </s:iterator>
		</table>		
	</s:if>	
	<s:else>
			Count Operation Error....
	
	</s:else>
	<br>
<s:url action="index" var="index"/>
Click <a href="${index}">Here</a> to Back to Index
</body></html>