<%@page import="com.User.userDetails"%>
<!--        navbar-->


<nav class="navbar navbar-expand-lg navbar-light bg-dark ">
    <!--            <a class="navbar-brand navbar text-light " href="index.html">QuizPoint</a>-->
    <a href="index.jsp"><img class="navbar-brand navbar text-light" src="Images/LoGo QP.png" width="100" height="60"></a>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link text-light" href="index.jsp"> Home  <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-light" href="quiz.jsp">Quiz</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-light" href="notes.jsp">Tutorial</a>
            </li>
            <li class="nav-item">
                <a class="nav-link text-light" href="#">Interview Questions</a>
            </li>


        </ul>
        <form class="form-inline my-2 my-lg-0">

            <%
                userDetails user = (userDetails) session.getAttribute("userD");

                if (user != null) {
            %>
            <a class="btn btn-outline-warning my-2 my-sm-0 m-2"  href="profile.jsp"><i class="fa fa-user" aria-hidden="true"></i> <span class="ml-1"></span> Welcome <%= user.getName() %>  </a>
            <a class="btn btn-outline-info my-2 my-sm-0" href="logoutServelt" type="submit">  Logout</a> 
            


            <% } else {
            %>
            <a class="btn btn-outline-warning my-2 my-sm-0 m-2" href="login.jsp"> Login </a>
            <a class="btn btn-outline-info my-2 my-sm-0" href="signup.jsp" >Sign up</a>

            <%}

            %>



        </form>
    </div>
</nav>
