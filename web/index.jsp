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
                <a class="navbar-brand" href="#!">Khách Sạn SUN&SEA Cửa Lò | 128 Nguyễn Sư Hồi | 0936640999</a>
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
            <div class="row gx-4 gx-lg-5 align-items-center my-5">
                <div class="col-lg-7"><img class="img-fluid rounded mb-4 mb-lg-0" src="https://upload.wikimedia.org/wikipedia/commons/6/61/Cualovedem.jpg" alt="..."  /></div>
                <div class="col-lg-5">
                    <h1 class="font-weight-light">Về Thị Xã Cửa Lò</h1>
                    <p>Cửa Lò được Tổ chức Du lịch thế giới đánh giá là một trong những bãi tắm lý tưởng nhất Việt Nam:Với chiều dài trên 10 km, được bao bọc bởi hai con sông ở hai đầu, độ dốc thoải đều, nước biển trong xanh, sóng vừa phải, độ mặn thích hợp là những đặc điểm mà không phải bãi tắm nào cũng có……</p>
                    <a class="btn btn-primary" href="https://cualo.vn/gioi-thieu-ve-cua-lo/">Tới bài viết.</a>
                </div>
            </div>
            <div class="card text-white bg-secondary my-5 py-4 text-center">
                <div class="card-body"><p class="text-white m-0">Giới thiệu về thị xã Cửa Lò</p></div>
            </div>
            <div class="row gx-4 gx-lg-5">
                <div class="col-md-4 mb-5">
                    <div class="card h-100">
                        <div class="card-body">
                            <h2 class="card-title"><img class="img-fluid rounded mb-4 mb-lg-0" src="https://dulichbiencualo.org/view/at_thi-xa-cua-lo-nghe-an_7e7d77a3773f8e28fb07ffa52a847a38.jpg" alt="..."/></h2>
                            <p class="card-text">Thị xã Cửa Lò - Nghệ An</p>
                        </div>
                        <div class="card-footer"><a class="btn btn-primary btn-sm" href="https://dulichbiencualo.org/thi-xa-cua-lo-nghe-an-n.html">Tới bài viết!</a></div>
                    </div>
                </div>
                <div class="col-md-4 mb-5">
                    <div class="card h-100">
                        <div class="card-body">
                            <h2 class="card-title"><img class="img-fluid rounded mb-4 mb-lg-0" src="https://statics.vinpearl.com/du-lich-cua-lo-nghe-an-01_1635689952.jpg" alt="..."/></h2>
                            <p class="card-text">Du lịch Cửa Lò Nghệ An nên đi đâu? Ăn gì? Ở khách sạn nào?...</p>
                        </div>
                        <div class="card-footer"><a class="btn btn-primary btn-sm" href="https://vinpearl.com/vi/du-lich-cua-lo-nghe-an-so-tay-du-lich-tu-a-den-z">Tới bài viết!</a></div>
                    </div>
                </div>
                <div class="col-md-4 mb-5">
                    <div class="card h-100">
                        <div class="card-body">
                            <h2 class="card-title">Tại sao du khách lại chọn Cửa Lò làm nơi nghỉ dưỡng vào mùa hè ?</h2>
                            <p class="card-text">Không chỉ nổi tiếng là danh thắng với vẻ đẹp nên thơ, kỳ vĩ; Cửa Lò còn là đô thị trẻ năng động với những đường </p>
                        </div>
                        <div class="card-footer"><a class="btn btn-primary btn-sm" href="https://www.youtube.com/watch?v=m0eAltxGXUo">Xem video!</a></div>
                    </div>
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

