 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <title>Update Booking Form</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="css/login.css" type="text/css">

    </head>
    <body style="background-image: url(image/9-1_opt_rbus_leyz.jpeg)">
        <section class="ftco-section">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-6 text-center mb-5">
                        <h2 class="heading-section">UPDATE BOOKING INFO</h2>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-md-7 col-lg-5">
                        <div class="wrap">
                            <div class="img" style="background-image: url(image/logo.jpg);"></div>
                            <div class="login-wrap p-4 p-md-5">
                                <div class="d-flex">
                                </div>
                                <form action="updatebooking" class="signin-form" method="POST">
                                    <div class="form-group mt-3">Booking id:
                                        <input type="text" class="form-control" value="${booking.bid}" name="bid" readonly>
                                    </div>
                                    <div class="form-group mt-3">RoomType:
                                        <select name="rid">
                                            <c:forEach items="${requestScope.roomtypes}" var="d">
                                                <option ${(d.rid == requestScope.booking.rid.rid)?"selected=\"selected\"":""}
                                                    value="${d.rid}">${d.rtype}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group mt-3">
                                        Check in Date: <input type="date" class="form-control" value="${booking.checkinDate}" name="checkinDate" required>
                                    </div>
                                    <div class="form-group mt-3">
                                        Check out Datess <input type="date" class="form-control" value="${booking.checkoutDate}" name="checkoutDate" required>
                                    </div>
                                    <div class="form-group mt-3">
                                        Guestusename: <input type="text" class="form-control" value="${booking.guestusename}" name="guestusename" readonly>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="form-control btn btn-primary rounded submit px-3">Done</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>


    </body>
</html>

