<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
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



<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to the quiz </title>

    <!-- FontAweome CDN Link for Icons-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <link rel="stylesheet" href="styles/quizcss.css">
</head>

<body>



    <!--<h1 class="text-center"> Welcome to Machine Learning Quiz</h1>-->
    
    <!--Main Navigation-->
    <%@include file = "all_components/navbar.jsp" %>
    
    
    <header>
  <a href="#" class="toggle-menuu fontawesome-reorder"></a>
  
</header>

<aside class="sidebar">
  <h3>Contents</h3>
  <navv>
      <ul class="navv">
            <li>
              <a href="#among-the-following-option-identify-the-one-which-is-not-a-type-of-learning" title="Among the following option identify the one which is not a type of learning.">
                <span class="m-r-5">1.</span>
                <span>What is Machine learning?</span>
              </a>
            </li>
            <li>
              <a href="#identify-the-kind-of-learning-algorithm-for-facial-identities-for-facial-expressions" title="Identify the kind of learning algorithm for  “facial identities for facial expressions”.">
                <span class="m-r-5">2.</span>
                <span>Which of the factors affect the performance of learner system does not include?</span>
              </a>
            </li>
            <li>
              <a href="#identify-the-model-which-is-trained-with-data-in-only-a-single-batch" title="Identify the model which is trained with data in only a single batch.">
                <span class="m-r-5">3.</span>
                <span>Different learning methods does not include?</span>
              </a>
            </li>
            <li>
              <a href="#what-is-the-application-of-machine-learning-methods-to-a-large-database-called" title="What is the application of machine learning methods to a large database called?">
                <span class="m-r-5">4.</span>
                <span>In language understanding, the levels of knowledge that does not include?</span>
              </a>
            </li>
            <li>
              <a href="#identify-the-type-of-learning-in-which-labeled-training-data-is-used" title="Identify the type of learning in which labeled training data is used.">
                <span class="m-r-5">5.</span>
                <span>A model of language consists of the categories which does not include?</span>
              </a>
            </li>
            <li>
              <a href="#identify-whether-true-or-false-in-pca-the-number-of-input-dimensions-is-equal-to-principal-components" title="Identify whether true or false:  In PCA the number of input dimensions is equal to principal components.">
                <span class="m-r-5">6.</span>
                <span>What is a top-down parser?</span>
              </a>
            </li>
            <li>
              <a href="#among-the-following-identify-the-one-in-which-dimensionality-reduction-reduces" title="Among the following identify the one in which dimensionality reduction reduces.">
                <span class="m-r-5">7.</span>
                <span>Among the following which is not a horn clause?</span>
              </a>
            </li>
            <li>
              <a href="#which-of-the-following-machine-learning-algorithm-is-based-upon-the-idea-of-bagging" title="Which of the following machine learning algorithm is based upon the idea of bagging?">
                <span class="m-r-5">8.</span>
                <span>What kind of learning algorithm for “Facial identities or facial expressions”?</span>
              </a>
            </li>
            <li>
              <a href="#choose-a-disadvantage-of-decision-trees-among-the-following" title="Choose a disadvantage of decision trees among the following.">
                <span class="m-r-5">9.</span>
                <span>Which of the following are ML methods?</span>
              </a>
            </li>
            <li>
              <a href="#what-is-the-term-known-as-on-which-the-machine-learning-algorithms-build-a-model-based-on-sample-data" title="What is the term known as on which the machine learning algorithms build a model based on sample data?">
                <span class="m-r-5">10.</span>
                <span>In Model based learning methods, an iterative process takes place on the ML models that are built based on various model parameters, called ?</span>
              </a>
            </li>
            <li>
              <a href="#machine-learning-is-a-subset-of-which-of-the-following" title="Machine learning is a subset of which of the following.">
                <span class="m-r-5">11.</span>
                <span>Machine learning is a subset of which of the following.</span>
              </a>
            </li>
            
    
  </nav>
</aside>



    <!-- start Quiz button -->
    <div class="start_btn"><button>Start Quiz</button></div>

    <!-- Info Box -->
    <div class="info_box">
        <div class="info-title"><span>Some Rules of this Quiz</span></div>
        <div class="info-list">
            
            <div class="info">2. Once you select your answer, it can't be undone.</div>
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