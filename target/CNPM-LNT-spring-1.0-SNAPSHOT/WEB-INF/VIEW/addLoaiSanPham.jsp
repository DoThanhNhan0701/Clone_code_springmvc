<%-- 
    Document   : addLoaiSanPham
    Created on : Mar 27, 2022, 2:42:31 PM
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
        <c:url var="action" value="/admin/loaiSanPham/add"/>
        <form:form action="${action}" modelAttribute="lsp" method="post">
            <form:input path="tenLoaiSP"/>
            <form:select path="idNhomsp">
                <c:forEach var="nsp" items="${listNSP}">
                    <form:option value="${nsp.idNhomSP}">${nsp.tenNhomSP}</form:option>
                </c:forEach>
            </form:select>
            <input type="submit" value="submit"/>
        </form:form>
    </body>
</html>
