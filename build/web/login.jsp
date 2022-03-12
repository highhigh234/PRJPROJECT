<%-- 
    Document   : login
    Created on : Mar 7, 2022, 8:39:02 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                                <form action="login" class="signin-form" method="POST">
                                    <div class="form-group mt-3">
                                        <input type="text" class="form-control" name="username" required>
                                        <label class="form-control-placeholder" for="username">Username</label>
                                    </div>
                                    <div class="form-group">
                                        <input id="password-field" type="password" class="form-control" name="password" required>
                                        <label class="form-control-placeholder" for="password">Password</label>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="form-control btn btn-primary rounded submit px-3">SIGN IN</button>
                                    </div>
                                    ${requestScope.mess}
                                </form>
                                <p class="text-center">For login account and password, please contact head of manager department or owner</p>
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

