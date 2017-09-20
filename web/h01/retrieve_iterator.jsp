<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:if test="countmap.size()>0">
		<table border="1" align="center">
		<caption >Customer Information Result</caption>
		<tr bgcolor="lightgreen">
		<th>Address</th>
		<th>Count</th>				
		</tr>
		<s:iterator value="countmap">
		<tr>
		 <td><s:property value="key"/> </td>
		 <td><s:property value="value"/></td>
		 
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
</body>
</html>