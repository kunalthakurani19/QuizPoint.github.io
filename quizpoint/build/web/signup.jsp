<!doctype html>
<html lang="en">
    <head>
        <link rel="shortcut icon" type="image/x-icon" href="Images/LoGo QP W.jpg" />
        <link rel="stylesheet" href="styles/style.css">


        <%@include file = "all_components/allLinks.jsp" %>

        <title>Quiz Point</title> 
    </head>
    <body>

        <%@include file = "all_components/navbar.jsp" %>



        <section class="vh-100" style="background-color: #eee;">
            <div class="container h-100">
                
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col col-xl-10">
                        <div class="card text-black" style="border-radius: 25px;">
                            <div class="card-body p-md-5">                                        
                                <div class="row justify-content-center">
                                    <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">                                                                                
                                        <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>
                                        <%
                                                String sucess = (String)session.getAttribute("regsuccess");
                                                if(sucess != null) {
                                            %>
                                            
                                            <div class="alert alert-success" role="alert"><%=sucess%><a href="login.jsp">click here to login</a>
                                                
                                            </div>
                                            <%
                                                    session.removeAttribute("regsuccess");
                                                }
                                            %>
                                            
<!--                                            failed login-->
                                            <%
                                                String failed = (String)session.getAttribute("failedmsg");
                                                if(failed != null) {
                                            %>
                                            
                                            <div class="alert alert-danger" role="alert">
                                                <%=failed%>
                                                
                                            </div>
                                            <%
                                                    session.removeAttribute("failedmsg");
                                                }
                                            %>
                                            
                                        <form class="mx-1 mx-md-4" action="userServlet" method="post">
                                            
                                            
                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="text" id="form3Example1c" class="form-control" name ="fname"/>
                                                    <label class="form-label" for="form3Example1c">Your Name</label>
                                                </div>
                                            </div>

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="email" id="form3Example3c" class="form-control" name ="uemail"/>
                                                    <label class="form-label" for="form3Example3c">Your Email</label>
                                                </div>
                                            </div>
                                            
                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="number" id="form3Example3c" class="form-control" name ="Phone"/>
                                                    <label class="form-label" for="form3Example3c">Phone no.</label>
                                                </div>
                                            </div>
                                            
                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="text" id="form3Example3c" class="form-control" name ="Iname"/>
                                                    <label class="form-label" for="form3Example3c">Institution Name</label>
                                                </div>
                                            </div>

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="password" id="form3Example4c" class="form-control" name ="upassword"/>
                                                    <label class="form-label" for="form3Example4c">Password</label>
                                                </div>
                                            </div>
                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="text" id="form3Example3c" class="form-control" name ="designation"/>
                                                    <label class="form-label" for="form3Example3c">designation</label>
                                                </div>
                                            </div>


                                            

                                            <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                                <button type="submit" class="btn btn-primary btn-lg">Register</button>
                                            </div>

                                        </form>

                                    </div>
                                    <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

                                        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp" class="img-fluid" alt="Sample image">

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