
<%@page import="model.RoomType"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%ArrayList<RoomType> roomtypess = (ArrayList<RoomType>) request.getAttribute("roomtypesss");%>
<!doctype html>
<html lang="en">
    <head>
        <title>Booking Form</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="css/login.css" type="text/css">

    </head>
    <body>
        <section class="ftco-section">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-6 text-center mb-5">
                        <h2 class="heading-section">|BOOKING FORM|</h2>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-md-7 col-lg-5">
                        <div class="wrap">
                            <div class="img" style="background-image: url(image/logo.jpg);"></div>
                            <div class="login-wrap p-4 p-md-5">
                                <div class="d-flex">
                                </div>
                                <form action="booking" class="signin-form" method="POST">
                                    <div class="form-group mt-3">First Name:
                                        <input type="text" class="form-control" name="cfirstname" required>
                                        <label class="form-control-placeholder" for="First Name"></label>
                                    </div>
                                    <div class="form-group mt-3">
                                        Last Name: <input type="text" class="form-control" name="clastname" required>
                                        <label class="form-control-placeholder" for="Last Name"></label>
                                    </div>
                                    <div class="form-group mt-3">
                                        Date of birth: <input type="date" class="form-control" name="dob" required>
                                        <label class="form-control-placeholder" for="DOB"></label>
                                    </div>
                                    <div class="form-group mt-3">
                                        Address: <input type="text" class="form-control" name="address" required>
                                        <label class="form-control-placeholder" for="address"></label>
                                    </div>
                                    <div class="form-group mt-3">
                                        Phone number: <input type="text" class="form-control" name="phonenumber" required>
                                        <label class="form-control-placeholder" for="phonenumber"></label>
                                    </div>
                                    <div class="form-group mt-3">
                                        Guestusename: <input type="text" class="form-control" name="guestusename" required>
                                        <label class="form-control-placeholder" for="guestusename"></label>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="form-control btn btn-primary rounded submit px-3">NEXT</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>

