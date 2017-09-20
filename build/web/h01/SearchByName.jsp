<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
	<title>ACME Company</title>
	<s:head/>
</head>
<body>
	<h2> Search Customer by Name</h2>
	<s:form action="byName" method="post">
		<s:textfield name="name" label="Customer Name to Search" size="20" requiredLabel="true"/>
		<s:submit value="Search"/>
	</s:form>
	
	<s:url action="index" var="index"/>
	<a href="${index}">Back</a>
</body>
</html>