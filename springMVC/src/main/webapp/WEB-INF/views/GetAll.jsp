<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Your Page</title>
</head>
<body>

    <h1>Your Data</h1>
    <table>
       
        <h1>${dataList.size()}</h1>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Branch</th>
            <th>CGPA</th>
        </tr>
        
       
            <tr th:each="data: ${dataList}">
                <td th:text=>${data.id}</td>
               
                <td th:text=>${data.name}</td>
                <td th:text=>${data.branch}</td>
                <td th:text=>${data.cgpa}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
