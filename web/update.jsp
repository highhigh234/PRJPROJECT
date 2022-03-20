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
        <div class="container px-4 px-lg-5">
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="${roomtypes.rpic}" alt="..."  /></div>
                <div class="col-lg-5" style="display: inline-block">
                    <form action="update" method="POST">
                        <c:if test="${sessionScope.account.isAdmin == true}">
                            <h1 class="font-weight-light">
                                <input name="rid" value="${roomtypes.rid}" hidden><br/></h1>
                                <h2>Room type: <input type="text" name="rtype" value="${roomtypes.rtype}" style="width: 130px; height: 50px; color: black" readonly></h2>
                            <h4>Number of guest allowed : <input type="text" name="maxallowed" value="${roomtypes.maxallowed}" style="width: 130px; height: 50px; color: black; text-align: center; border-color: black" ></h4><br/>
                            <h4>Price Per Night : <input type="text" name="pricepernight" value="${roomtypes.pricepernight}" style="width: 130px; height: 50px; color: black; text-align: center; border-color: black "></h4><br/>
                            <h4>Description : <textarea type="text" name="description" value="" style="font-size: 20px">${roomtypes.description}</textarea></h4>
                            <h4>Facilities : <textarea type="text" name="facilities" value="" style="font-size: 20px">${roomtypes.facilities}</textarea></h4><br/>
                            <h4>Room's pic: <textarea type="text" name="rpic" value="" style="width: 400px; height: 40px">${roomtypes.rpic}</textarea></h4><br/>

                            <button type="submit" style="color: #5d7dc0; font-size: 30px; padding: 10px 20px; border: none; display: inline-block; background-color: #666600; text-align: center ">DONE</button>
                        </c:if>

                    </form>
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

