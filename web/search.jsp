<%-- 
    Document   : search
    Created on : Mar 8, 2022, 11:46:10 PM
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
    <body style="background-image: url(image/mot-goc-bien-cua-lo-tu-tren-cao.jpeg)">
        <section class="ftco-section">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-md-6 text-center mb-5">
                        <h2 class="heading-section" style="color: whitesmoke; font-size: 60px; font-style: inherit">SEARCH PORTAL</h2>
                    </div>
                </div>
                <div class="row justify-content-center">
                    <div class="col-md-7 col-lg-5">
                        <div class="wrap">
                            <div class="img" style="background-image: url(image/logo.jpg);"></div>
                            <div class="login-wrap p-4 p-md-5">
                                <div class="d-flex">
                                    <div class="w-100">
                                        <h3 class="mb-4 text-center">SEARCH CUSTOMER'S INFO</h3>
                                    </div>
                                </div>
                                <form action="search" class="signin-form" method="POST">
                                    <div class="form-group mt-3">
                                        <input type="text" class="form-control" name="cfirstname" required>
                                        <label class="form-control-placeholder" for="cfirstname">First Name</label>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="form-control btn btn-primary rounded submit px-3">Search</button>
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

