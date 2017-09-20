<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <s:label value="Successful Deleted:"/>
        <s:form>
            <table>
                <tr><th>Name</th>
                    <th>Roll No</th>
                    <th>Course</th>
                <tr><s:if test="stulist.size()>0" >
                        <s:iterator value="stulist">
                            <td><s:property value="sname"/></td>
                            <td><s:property value="sroll"/></td>
                            <td><s:property value="course"/></td>

                        </s:iterator>
                    </s:if>
                </tr>
            </table>
        </s:form>
    </body>
</html>