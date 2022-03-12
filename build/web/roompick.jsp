<%-- 
    Document   : roompick
    Created on : Mar 8, 2022, 9:31:38 PM
    Author     : admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <title>LOGIN FORM</title>
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
                        <h2 class="heading-section">|LOGIN PORTAL FOR STAFFS|</h2>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-md-7 col-lg-5">
                        <div class="wrap">
                            <div class="img" style="background-image: url(image/logo.jpg);"></div>
                            <div class="login-wrap p-4 p-md-5">
                                <div class="d-flex">
                                    <div class="w-100">
                                        <h3 class="mb-4 text-center">SIGN IN</h3>
                                    </div>
                                </div>
                                <form action="roompick" class="signin-form" method="POST">
                                    <div class="form-group mt-3">
                                        <select name="rid">
                                            <c:forEach items="${requestScope.rtypes}" var="d">
                                                <option value="${d.rid}">${d.rtype}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group mt-3">
                                        <input type="date" class="form-control" name="checkinDate" required>
                                        <label class="form-control-placeholder" for="checkinDate"></label>
                                    </div>
                                    <div class="form-group">
                                        <input type="date" class="form-control" name="checkoutDate" required>
                                        <label class="form-control-placeholder" for="checkoutDate"></label>
                                    </div>

                                    <div class="form-group mt-3">
                                        Guestusename: <input type="text" class="form-control" name="guestusename" required>
                                        <label class="form-control-placeholder" for="guestusename"></label>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="form-control btn btn-primary rounded submit px-3">DONE</button>
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

