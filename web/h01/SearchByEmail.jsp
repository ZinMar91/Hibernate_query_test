<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
	<title>ACME Company</title>
	<s:head/>
</head>
<body>
	<h2> Search Customer by Email</h2>
	<s:form action="byEmail" method="post">
		<s:textfield name="email" label="Address to Search" size="20" requiredLabel="true"/>
		<s:submit value="Search"/>
	</s:form>
	
	<s:url action="index" var="index"/>
	<a href="${index}">Back</a>
</body>
</html>