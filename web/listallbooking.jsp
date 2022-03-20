<%-- 
    Document   : index
    Created on : Feb 27, 2022, 12:41:20 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />

        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container px-5">
                <a class="navbar-brand" href="index.jsp">Khách Sạn SUN&SEA Cửa Lò | 128 Nguyễn Sư Hồi | 0936640999</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="#!">Trang chủ</a></li>
                        <li class="nav-item"><a class="nav-link" href="room">Hệ Thống Phòng</a></li>
                        <li class="nav-item"><a class="nav-link" href="search.jsp">Tìm Kiếm</a></li>
                        <li class="nav-item">
                            <c:if test="${sessionScope.account.isAdmin == true}">
                                <a class="nav-link" href="listallcustomer" class="btn btn-light" >Tất cả khách</a>
                            </c:if>
                        </li>
                        <li class="nav-item"><a class="nav-link" href="#!">Liên Hệ</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container px-4 px-lg-5">
            <div class="card text-white bg-secondary my-5 py-4 text-center">
                <div class="card-body"><p class="text-white m-0">List All Customer</p></div>
            </div>
            <div class="card text-white bg-secondary my-5 py-4 text-center" >
                <table style="color: white">
                    <thead>
                        <tr>
                            <th>Booking id</th>
                            <th>RoomType</th>
                            <th>Check in Date</th>
                            <th>Check out Date</th>
                            <th>Guestname</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.books}" var="books">
                            <tr>
                                <td>${books.bid}</td>
                                <td>${books.rid.rtype}</td>
                                <td>${books.checkinDate}</td>
                                <td>${books.checkoutDate}</td>
                                <td>${books.guestusename}</td>
                                <td>
                                    <c:if test="${sessionScope.account.isAdmin == true}">
                                        <a href="updatebooking?bid=${books.bid}" class="btn btn-primary" style="padding: 6px 6px">Update booking</a>
                                        <a href="deletebooking?bid=${books.bid}" class="btn btn-primary" style="padding: 6px 6px" >Delete booking</a>
                                    </c:if>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>      
        </div>

        <footer class="py-5 bg-dark">
            <div class="container px-4 px-lg-5"><p class="m-0 text-center text-white">&copy; SUN&SEA Hotel</p>
                <p class="m-0 text-center text-white">128 Nguyễn Sư Hồi | 0936640999</p>
            </div>
        </footer>

    </body>
</html>

