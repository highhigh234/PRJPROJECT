<%-- 
    Document   : update
    Created on : Mar 13, 2022, 9:00:53 PM
    Author     : admin
--%>
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
        <title>Small Business - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!-- Responsive navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container px-5">
                <a class="navbar-brand" href="index.jsp">Khách Sạn SUN&SEA Cửa Lò | 128 Nguyễn Sư Hồi | 0936640999</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="index.jsp">Trang chủ</a></li>
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
        <!-- Page Content-->
        <div class="container px-4 px-lg-5">
            <!-- Heading Row-->
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="https://upload.wikimedia.org/wikipedia/commons/6/61/Cualovedem.jpg" alt="..."  /></div>
                <div class="col-lg-5" style="display: inline-block">
                    <form action="insert" method="POST">
                        <h1 class="font-weight-light">
                            Room type: <input type="text" name="rtype" value="${roomtypes.rtype}"></h1>
                        <h2>Room id: <input type="text" name="rid" value="${roomtypes.rid}"></h2>
                        <p>Number of guest allowed : <input type="text" name="maxallowed" value="${roomtypes.maxallowed}"></p>
                        <p>Price Per Night : <input type="text" name="pricepernight" value="${roomtypes.pricepernight}"></p>
                        <p>Description : <input type="text" name="description" value="${roomtypes.description}"></p>
                        <p>Facilities : <input type="text" name="facilities" value="${roomtypes.facilities}"></p>
                        <p>Room's pic: <input type="text" name="rpic" value="${roomtypes.rpic}"></p>
                        <input type="submit" value="Done">
                    </form>
                </div>
            </div>
        </div>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container px-4 px-lg-5"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2021</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>

