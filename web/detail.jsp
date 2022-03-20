<%-- 
    Document   : detail
    Created on : Mar 7, 2022, 3:14:04 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="index">Trang chủ</a></li>
                        <li class="nav-item"><a class="nav-link" href="room">Hệ Thống Phòng</a></li>
                        <li class="nav-item"><a class="nav-link" href="search.jsp">Tìm Kiếm</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">Liên Hệ</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="https://upload.wikimedia.org/wikipedia/commons/6/61/Cualovedem.jpg" alt="..."  /></div>
                <div class="col-lg-5">
                    <h1 class="font-weight-light">${roomtypess.rtype} Room</h1>
                    <P>Number of guest allowed : ${roomtypess.maxallowed}</P>
                    <P>Price Per Night : ${roomtypess.pricepernight}đ</P>
                    <P>Description : ${roomtypess.description}</P>
                    <P>Facilities : ${roomtypess.facilities}</P>
                    <a class="btn btn-primary" href="customer.jsp">Book now!</a>
                    <c:if test="${sessionScope.account.isAdmin == true}">
                        <a class="btn btn-primary" href="update?rid=${rot.rid}">Update</a>
                    </c:if>
                </div>
            </div>
        </div>
        <footer class="py-5 bg-dark">
            <div class="container px-4 px-lg-5"><p class="m-0 text-center text-white">&copy; SUN&SEA Hotel</p>
                <p class="m-0 text-center text-white">128 Nguyễn Sư Hồi | 0936640999</p>
            </div>
        </footer>
    </body>
</html>

