<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title> Index Page</title>
</head>
<body> 
<s:form>
<s:url action="insert" var="in"></s:url>
<a href="${in}">Insert Customer Information</a>
<br/>
<s:url action="add" var="add"></s:url>
<a href="${add}" >Search Customer Information by Address</a>
<br>
<s:url action="name" var="name"></s:url>
<a href="${name}" >Search Customer Information by Name</a>
<br>

<s:url action="email" var="mail"></s:url>
<a href="${mail}" >Search Customer Information by Email</a>
<br>

<s:url action="Count" var="count"></s:url>
<a href="${count}" >Search Customer Information by Address</a>
<br>
<s:url action="Count1" var="count1"></s:url>
<a href="${count1}" >Search Customer Information by Address(Iterator)</a>
<br>
</s:form>
</body>
</html>