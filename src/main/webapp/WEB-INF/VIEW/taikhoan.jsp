<%-- 
    Document   : taikhoan
    Created on : Apr 22, 2022, 8:21:39 PM
    Author     : ACER
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Danh sách tài khoản</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Thông tin người dùng
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>Tên</th>
                                        <th>Tên tài khoản</th>
                                        <th>Email</th>
                                        <th>Địa chỉ</th>
                                        <th>Số điện thoại</th>
                                        <th colspan="2"><a href="create.html">Thêm</a></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="odd gradeX">
                                        <td>Luân</td>
                                        <td>NVDLuan2001</td>
                                        <td>NVDLuan2001@gmail.com</td>
                                        <td class="center">Thăng bình - Quảng nam</td>
                                        <td class="center">0966324874</td>
                                        <td><a href="#">Sửa</a></td>
                                        <td><a href="#">Xóa</a></td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td>Tân</td>
                                        <td>Tan2001</td>
                                        <td>Tan2001@gmail.com</td>
                                        <td class="center">Đại lộc - Quảng nam</td>
                                        <td class="center">0967513304</td>
                                        <td><a href="#">Sửa</a></td>
                                        <td><a href="#">Xóa</a></td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td>Nhân</td>
                                        <td>Nhan2001</td>
                                        <td>Nhan2001@gmail.com</td>
                                        <td class="center">Đak lak</td>
                                        <td class="center">097542103</td>
                                        <td><a href="#">Sửa</a></td>
                                        <td><a href="#">Xóa</a></td>
                                    </tr>
                                    <tr class="even gradeC">
                                        <td>Lâm</td>
                                        <td>Lam2001</td>
                                        <td>Lam2001@gmail.com</td>
                                        <td class="center">Núi thành - Quảng nam</td>
                                        <td class="center">09751233412</td>
                                        <td><a href="#">Sửa</a></td>
                                        <td><a href="#">Xóa</a></td>
                                    </tr>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
    </div>
    <!-- /.container-fluid -->
</div>