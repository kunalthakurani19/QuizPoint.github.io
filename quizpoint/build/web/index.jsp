<%@page import="com.DB.DBConnection"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html lang="en">
    <head>
        <link rel="shortcut icon" type="image/x-icon" href="Images/LoGo QP W.jpg" />

        <%@include file = "all_components/allLinks.jsp" %>
        
        

        <title>Quiz Point</title>
    </head> 
    <body>

        <%@include file = "all_components/navbar.jsp" %>
       




        <div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="Images/header1.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="Images/header2.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="Images/header3.png" class="d-block w-100" alt="...">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        <div class="card-group " style="background-color: #eee">
            <div class="card m-5">
                <img src="Images/card1.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Quizes</h5>
                    <p class="card-text">This card has supporting text below as a natural lead-in to additional content</p>

                    <a class="btn btn-outline-dark" href="quiz.jsp" role="button">Explore</a>
                </div>
            </div>
            <div class="card m-5 " >
                <img src="Images/card2.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title" >Technical Interview</h5>
                    <p class="card-text" >This card has supporting text below as a natural lead-in to additional content.</p>

                    <a class="btn btn-outline-dark" href="index.jsp" role="button">Explore</a>
                </div>
            </div>
            <div class="card m-5">
                <img src="Images/card3.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Notes</h5>
                    <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>

                    <a class="btn btn-outline-dark" href="notes.jsp" role="button">Explore</a>


                </div>
            </div>
        </div>

        <%@include file="all_components/footer.jsp" %>







         </body>
</html>