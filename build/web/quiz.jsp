<%-- 
    Document   : quiz
    Created on : 23 Mar, 2022, 5:15:13 PM
    Author     : kunal thakurani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    userDetails user1 = (userDetails) session.getAttribute("userD");
    if (user1 == null) {
        response.sendRedirect("login.jsp");
    }
    session.removeAttribute("logoutMSG");
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");


%>

<%    String lgMsg = (String) session.getAttribute("logoutMSG");
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


<%@include file = "all_components/allLinks.jsp" %>
<%@include file = "all_components/navbar.jsp" %>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to the quiz </title>

    <!-- FontAweome CDN Link for Icons-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <link rel="stylesheet" href="styles/quizcss.css">
</head>

<body>



    <h1 class="text-center"> Welcome to QuizPoint Select Your Subject</h1>


    <div class="card-deck m-5 w-80">

            <div class="card m-5 ">
                <img class="card-img-top " src="Images/mlt.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Machine Learning</h5>
                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    <a href="machineLearningQuiz.jsp" class="stretched-link"></a>
                    <!--<div class="start_btn"><button>Start Quiz</button></div>-->
                </div>


            </div>

            <div class="card m-5 ">
                <img class="card-img-top" src="Images/cn.png" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Computer Networks</h5>
                    <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                    <a href="computerNetworkQuiz.jsp" class="stretched-link"></a>
                </div>

            </div>
            <div class="card m-5">
                <img class="card-img-top" src="Images/cg.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Computer Graphics And Visualization</h5>
                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
                    <a href="#" class="stretched-link"></a>
                </div>

            </div>
        </div>

    <!-- start Quiz button -->
    <!--<div class="start_btn"><button>Start Quiz</button></div>-->

    <!-- Info Box -->
    <div class="info_box">
        <div class="info-title"><span>Some Rules of this Quiz</span></div>
        <div class="info-list">
            <div class="info">1. You will have only <span>15 seconds</span> per each question.</div>
            <div class="info">2. Once you select your answer, it can't be undone.</div>
            <div class="info">3. You can't select any option once time goes off.</div>
            <div class="info">4. You can't exit from the Quiz while you're playing.</div>
            <div class="info">5. You'll get points on the basis of your correct answers.</div>
        </div>
        <div class="buttons">
            <button class="quit">Exit Quiz</button>
            <button class="restart">Continue</button>
        </div>
    </div>
    <!-- Quiz Box -->
    <div class="quiz_box">
        <header>
            <div class="title">Awesome Quiz Application</div>


        </header>
        <section>
            <div class="que_text">
                <!-- Here I've inserted question from JavaScript -->
            </div>
            <div class="option_list">
                <!-- Here I've inserted options from JavaScript -->
            </div>
        </section>

        <!-- footer of Quiz Box -->
        <footer>
            <div class="total_que">
                <!-- Here I've inserted Question Count Number from JavaScript -->
            </div>
            <button class="next_btn">Next Que</button>
        </footer>
    </div>

    <!-- Result Box -->
    <div class="result_box">
        <div class="icon">
            <i class="fas fa-crown"></i>
        </div>
        <div class="complete_text">You've completed the Quiz!</div>
        <div class="score_text">
            <!-- Here I've inserted Score Result from JavaScript -->
        </div>
        <div class="buttons">
            <button class="restart">Replay Quiz</button>
            <button class="quit">Quit Quiz</button>
        </div>
    </div>
    <div>

        <%--<%@include file="all_components/footer.jsp" %>--%>

    </div>

    <!-- Inside this JavaScript file I've inserted Questions and Options only -->
    <script src="js/questions.js"></script>

    <!-- Inside this JavaScript file I've coded all Quiz Codes -->
    <script src="js/script.js"></script>





</body>




</html>