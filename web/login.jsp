<!doctype html>
<html lang="en">
    <head>
        <link rel="shortcut icon" type="image/x-icon" href="Images/LoGo QP W.jpg" />
       
        <%@page contentType="text/html" pageEncoding="UTF-8"%>


        <%@include file = "all_components/allLinks.jsp" %>

        <title>Quiz Point</title>
    </head>
    <body>

        <%@include file = "all_components/navbar.jsp" %>


        <section class="vh-100" style="background-color: #eee;">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col col-xl-10">
                        <div class="card" style="border-radius: 1rem;">
                            <div class="row g-0">
                                <div class="col-md-6 col-lg-5 d-none d-md-block">
                                    <img 
                                        src="Images/login.png"
                                        alt="login form"
                                        class="img-fluid mt-5" style="border-radius: 1rem 0 0 1rem; "
                                        />
                                </div>
                                <div class="col-md-6 col-lg-7 d-flex align-items-center">
                                    <div class="card-body p-4 p-lg-5 text-black">

                                        <form action="loginServelt" method="post">

                                            <div class="d-flex align-items-center mb-3 pb-1">


                                                <span class="h1 fw-bold mb-0">QuizPoint</span>
                                            </div>

                                            <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign into your account</h5>
                                            <%                                                String invalidMsg = (String) session.getAttribute("loginfailed");
                                                if (invalidMsg != null) {
                                            %>

                                            <div class="alert alert-danger" role="alert"><%=invalidMsg%></div>

                                            <%
                                                    session.removeAttribute("loginfailed");
                                                }
                                            %>

                                            <!--                                            code is not complete here -->


                                            <%
                                                String lgMsg = (String) session.getAttribute("logoutMSG");
                                                if (lgMsg != null) {
                                            %>
                                            <div class="alert alert-success" role="alert"><%=lgMsg%></div>
                                            <%
                                                    session.removeAttribute("logoutMSG");
                                                    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                                                    response.setHeader("Pragma", "no-cache");
                                                    response.setHeader("Expires", "0");

                                                }

                                            %>



                                            <div class="form-outline mb-4">
                                                <input type="email" id="form2Example17" name="uemail" class="form-control form-control-lg" required/>
                                                <label class="form-label" for="form2Example17">Email address</label>
                                            </div>

                                            <div class="form-outline mb-4">
                                                <input type="password" id="form2Example27" name="upassword" class="form-control form-control-lg" required />
                                                <label class="form-label" for="form2Example27">Password</label>
                                            </div>

                                            <div class="pt-1 mb-4">
                                                <input type="submit" value="Login" class="btn btn-dark btn-lg btn-block ">
                                            </div>

                                            <p class="mb-5 pb-lg-2" style="color: #393f81;">Don't have an account? <a href="signup.jsp" style="color: #393f81;">Register here</a></p>
                                            <a href="#!" class="small text-muted">Terms of use.</a>
                                            <a href="#!" class="small text-muted">Privacy policy</a>
                                        </form> 

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>








        <%@include file="all_components/footer.jsp" %>

        <%@include file = "all_components/allLinks.jsp" %>






    </body>
</html>