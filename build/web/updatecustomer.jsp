

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
                                <form action="updatecustomer" class="signin-form" method="POST">
                                    <div class="form-group mt-3">Customer id:
                                        <input type="text" class="form-control" value="${customer.cid}" name="cid" readonly>
                                        
                                    </div>
                                    <div class="form-group mt-3">First Name:
                                        <input type="text" class="form-control" value="${customer.cfirstname}" name="cfirstname" required>
                                        
                                    </div>
                                    <div class="form-group mt-3">
                                        Last Name: <input type="text" class="form-control" value="${customer.clastname}" name="clastname" required>
                                        
                                    </div>
                                    <div class="form-group mt-3">
                                        Date of birth: <input type="date" class="form-control" value="${customer.dob}" name="dob" required>
                                        
                                    </div>
                                    <div class="form-group mt-3">
                                        Address: <input type="text" class="form-control" value="${customer.address}" name="address" required>
                                        
                                    </div>
                                    <div class="form-group mt-3">
                                        Phone number: <input type="text" class="form-control" value="${customer.phonenumber}" name="phonenumber" required>
                                        
                                    </div>
                                    <div class="form-group mt-3">
                                        Guestusename: <input type="text" class="form-control" value="${customer.guestusename}" name="guestusename" readonly>
                                        
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

        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>

