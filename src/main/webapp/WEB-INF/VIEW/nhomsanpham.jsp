<%-- 
    Document   : adminnhomsanpham
    Created on : Apr 22, 2022, 10:08:42 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Thêm nhom sản phẩm</h1>
            </div>
        </div>
        <div class="container mt-5">
            <div class="card">
                <div class="card-body">
                    <c:url var="action" value="/admin/nhomSanPham/add"/>
                    <form:form action="${action}" modelAttribute="nsp" method="post" enctype="multipart/form-data" role="form" data-toggle="validator">
                        <div class="form-group">
                            <label>Nhom sản phẩm</label>
                            <form:input path="tenNhomSP" id = "name"  class="form-control" data-error="Bạn cần nhập đầy đủ thông tin." type="text"/>
                            <div class="help-block with-errors"></div>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-primary btn-block" type="submit" onclick="check()">Thêm</button>
                        </div>
                    </form:form>
                </div>
            </div>

        </div>
    </div>
    <script>
        function check() {
            var name = document.getElementById("name");
            alert("name: " + name.value);

        }
    </script>