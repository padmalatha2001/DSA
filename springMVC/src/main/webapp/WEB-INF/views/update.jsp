<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form:form method="POST" action="/springMVC/updateStudent" modelAttribute="student">
   
         <span th:text="${header}"/>
    <table>
                        <tr>
        				<td>Id</td>
        				<td><form:input type="text" path="id"></form:input></td>
        			</tr>
                       <tr>
        				<td>Name</td>
        				<td><form:input type="text" path="name"></form:input></td>
        			</tr>
        			<tr>
        				<td>branch</td>
        				<td><form:input type="text" path="branch"></form:input></td>
        			</tr>
        			<tr>
        				<td>cgpa</td>
        				<td><form:input type="text" path="cgpa"></form:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
   
    </table>
    </form:form>
</body>
</html>