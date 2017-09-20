
        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Inserting of Party Information is successful.</h3>
	<hr>
	
		<s:if test="partylist.size()>0">
			<s:iterator value="partylist">
			Party Name: <s:property value="partyname"/><br>
			Acronym: <s:property value="acronym"/><br>
			</s:iterator>
		</s:if>
		<a href="views/Home.jsp">Go to home page</a>
	
</body>
</html>