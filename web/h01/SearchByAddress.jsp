<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
	<title>ACME Company</title>
	<s:head/>
</head>
<body>
	<h2> Search Customer by Address</h2>
	<s:form action="byAddress" method="post">
		<s:textfield name="address" label="Address to Search" size="20" requiredLabel="true"/>
		<s:submit value="Search"/>
	</s:form>
	
	<s:url action="index" var="index"/>
	<a href="${index}">Back</a>
</body>
</html>