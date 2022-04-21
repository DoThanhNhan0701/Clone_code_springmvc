<%-- 
    Document   : addNhomSanPham
    Created on : Mar 25, 2022, 9:08:36 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:url var="action" value="/admin/nhomSanPham/add"/>
        <form:form action="${action}" modelAttribute="nsp" method="post">
            <form:input path="tenNhomSP" id = "name"/>
            <input type="submit" value='thêm' onclick="check()"/>
        </form:form>
    </body>
    <script>
        function check(){
            var name = document.getElementById("name");
            alert("name: "+ name.value);
            
        }
    </script>
        
</html>
