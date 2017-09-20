<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="insertcustomer">
<s:textfield name="c.userName" label="User Name"/>
<s:password name="c.password" label="Password"/>
<s:password name="c.re_password" label="Confirm Password"/>
<s:textfield name="c.email" label="Email"/>
<s:textfield name="c.address" label="Address"/>
<s:submit value="Insert Customer"/>
</s:form>
</body>
</html>