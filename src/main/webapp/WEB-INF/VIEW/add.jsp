<%-- 
    Document   : add
    Created on : Mar 24, 2022, 10:10:19 AM
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
        <c:url var="action" value="/admin/matHang/add"/>
        <form:form action="${action}" method="post" modelAttribute="mathang" enctype="multipart/form-data">
            <table>
                <tr>
                    <th>
                        Tên mặt hàng
                    </th>
                    <td>
                        <form:input path="tenMH"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Hãng
                    </td>
                    <td>
                        <form:input path="hang"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Giá
                    </td>
                    <td>
                        <form:input path="gia"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        số lượng
                    </td>
                    <td>
                        <form:input path="soLuong"/>
                    </td>
                </tr>
                <tr>
                    <td>loại sản phẩm</td>
                    <td>
                        <form:select path="idLoaiSanPham">
                            <c:forEach var="lsp" items="${list}">
                            <form:option value="${lsp.idLoaiSP}" >${lsp.tenLoaiSP}</form:option>
                            </c:forEach>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>
                        chi tiết sản phẩm
                    </td>
                    <td>
                        <form:input path="chiTiet"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        hình ảnh
                    </td>
                    <td>
                        <form:input path="file" type ="file"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="sub"/>
                    </td>
                </tr>
            </table>


        </form:form>
    </body>
</html>
