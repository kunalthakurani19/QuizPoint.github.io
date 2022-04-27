package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.userDetails;

public final class machineLearningQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/all_components/allLinks.jsp");
    _jspx_dependants.add("/all_components/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");


    userDetails user1 = (userDetails) session.getAttribute("userD");
    if (user1 == null) {
        response.sendRedirect("login.jsp");
    }
    session.removeAttribute("logoutMSG"); 
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");



      out.write('\n');
      out.write('\n');
    String lgMsg = (String) session.getAttribute("logoutMSG");
    if (lgMsg != null) {

      out.write("\n");
      out.write("<div class=\"alert alert-success\" role=\"alert\">");
      out.print(lgMsg);
      out.write("</div>\n");

        session.removeAttribute("logoutMSG");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");

    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Required meta tags -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Images/LoGo QP W.jpg\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link\n");
      out.write("  href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("/>\n");
      out.write("<!-- Google Fonts -->\n");
      out.write("<link\n");
      out.write("  href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("/>\n");
      out.write("<!-- MDB -->\n");
      out.write("<link\n");
      out.write("  href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.11.0/mdb.min.css\"\n");
      out.write("  rel=\"stylesheet\"\n");
      out.write("/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<!-- Google Fonts -->\n");
      out.write("<link\n");
      out.write("    href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\n");
      out.write("    rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("<!-- MDB -->\n");
      out.write("<link\n");
      out.write("    href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.css\"\n");
      out.write("    rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Optional JavaScript -->\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script>\n");
      out.write("    type=\"text/javascript\"\n");
      out.write("    src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.js\"\n");
      out.write("</script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\" ></script>\n");
      out.write("<!-- MDB -->\n");
      out.write("<script\n");
      out.write("  type=\"text/javascript\"\n");
      out.write("  src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.11.0/mdb.min.js\"\n");
      out.write("></script>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Welcome to the quiz </title>\n");
      out.write("\n");
      out.write("    <!-- FontAweome CDN Link for Icons-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/quizcss.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--<h1 class=\"text-center\"> Welcome to Machine Learning Quiz</h1>-->\n");
      out.write("    \n");
      out.write("    <!--Main Navigation-->\n");
      out.write("    ");
      out.write("\n");
      out.write("<!--        navbar-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-dark \">\n");
      out.write("    <!--            <a class=\"navbar-brand navbar text-light \" href=\"index.html\">QuizPoint</a>-->\n");
      out.write("    <a href=\"index.jsp\"><img class=\"navbar-brand navbar text-light\" src=\"Images/LoGo QP.png\" width=\"100\" height=\"60\"></a>\n");
      out.write("\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link text-light\" href=\"index.jsp\"> Home  <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link text-light\" href=\"quiz.jsp\">Quiz</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link text-light\" href=\"notes.jsp\">Tutorial</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link text-light\" href=\"#\">Interview Questions</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("\n");
      out.write("            ");

                userDetails user = (userDetails) session.getAttribute("userD");

                if (user != null) {
            
      out.write("\n");
      out.write("            <a class=\"btn btn-outline-warning my-2 my-sm-0 m-2\"  href=\"profile.jsp\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i> <span class=\"ml-1\"></span> Welcome ");
      out.print( user.getName() );
      out.write("  </a>\n");
      out.write("            <a class=\"btn btn-outline-info my-2 my-sm-0\" href=\"logoutServelt\" type=\"submit\">  Logout</a> \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
 } else {
            
      out.write("\n");
      out.write("            <a class=\"btn btn-outline-warning my-2 my-sm-0 m-2\" href=\"login.jsp\"> Login </a>\n");
      out.write("            <a class=\"btn btn-outline-info my-2 my-sm-0\" href=\"signup.jsp\" >Sign up</a>\n");
      out.write("\n");
      out.write("            ");
}

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <header>\n");
      out.write("  <a href=\"#\" class=\"toggle-menuu fontawesome-reorder\"></a>\n");
      out.write("  \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<aside class=\"sidebar\">\n");
      out.write("  <h3>Contents</h3>\n");
      out.write("  <navv>\n");
      out.write("      <ul class=\"navv\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#among-the-following-option-identify-the-one-which-is-not-a-type-of-learning\" title=\"Among the following option identify the one which is not a type of learning.\">\n");
      out.write("                <span class=\"m-r-5\">1.</span>\n");
      out.write("                <span>What is Machine learning?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#identify-the-kind-of-learning-algorithm-for-facial-identities-for-facial-expressions\" title=\"Identify the kind of learning algorithm for  “facial identities for facial expressions”.\">\n");
      out.write("                <span class=\"m-r-5\">2.</span>\n");
      out.write("                <span>Which of the factors affect the performance of learner system does not include?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#identify-the-model-which-is-trained-with-data-in-only-a-single-batch\" title=\"Identify the model which is trained with data in only a single batch.\">\n");
      out.write("                <span class=\"m-r-5\">3.</span>\n");
      out.write("                <span>Different learning methods does not include?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#what-is-the-application-of-machine-learning-methods-to-a-large-database-called\" title=\"What is the application of machine learning methods to a large database called?\">\n");
      out.write("                <span class=\"m-r-5\">4.</span>\n");
      out.write("                <span>In language understanding, the levels of knowledge that does not include?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#identify-the-type-of-learning-in-which-labeled-training-data-is-used\" title=\"Identify the type of learning in which labeled training data is used.\">\n");
      out.write("                <span class=\"m-r-5\">5.</span>\n");
      out.write("                <span>A model of language consists of the categories which does not include?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#identify-whether-true-or-false-in-pca-the-number-of-input-dimensions-is-equal-to-principal-components\" title=\"Identify whether true or false:  In PCA the number of input dimensions is equal to principal components.\">\n");
      out.write("                <span class=\"m-r-5\">6.</span>\n");
      out.write("                <span>What is a top-down parser?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#among-the-following-identify-the-one-in-which-dimensionality-reduction-reduces\" title=\"Among the following identify the one in which dimensionality reduction reduces.\">\n");
      out.write("                <span class=\"m-r-5\">7.</span>\n");
      out.write("                <span>Among the following which is not a horn clause?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#which-of-the-following-machine-learning-algorithm-is-based-upon-the-idea-of-bagging\" title=\"Which of the following machine learning algorithm is based upon the idea of bagging?\">\n");
      out.write("                <span class=\"m-r-5\">8.</span>\n");
      out.write("                <span>What kind of learning algorithm for “Facial identities or facial expressions”?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#choose-a-disadvantage-of-decision-trees-among-the-following\" title=\"Choose a disadvantage of decision trees among the following.\">\n");
      out.write("                <span class=\"m-r-5\">9.</span>\n");
      out.write("                <span>Which of the following are ML methods?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#what-is-the-term-known-as-on-which-the-machine-learning-algorithms-build-a-model-based-on-sample-data\" title=\"What is the term known as on which the machine learning algorithms build a model based on sample data?\">\n");
      out.write("                <span class=\"m-r-5\">10.</span>\n");
      out.write("                <span>In Model based learning methods, an iterative process takes place on the ML models that are built based on various model parameters, called ?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#machine-learning-is-a-subset-of-which-of-the-following\" title=\"Machine learning is a subset of which of the following.\">\n");
      out.write("                <span class=\"m-r-5\">11.</span>\n");
      out.write("                <span>Machine learning is a subset of which of the following.</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("  </nav>\n");
      out.write("</aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- start Quiz button -->\n");
      out.write("    <div class=\"start_btn\"><button>Start Quiz</button></div>\n");
      out.write("\n");
      out.write("    <!-- Info Box -->\n");
      out.write("    <div class=\"info_box\">\n");
      out.write("        <div class=\"info-title\"><span>Some Rules of this Quiz</span></div>\n");
      out.write("        <div class=\"info-list\">\n");
      out.write("            \n");
      out.write("            <div class=\"info\">2. Once you select your answer, it can't be undone.</div>\n");
      out.write("            <div class=\"info\">4. You can't exit from the Quiz while you're playing.</div>\n");
      out.write("            <div class=\"info\">5. You'll get points on the basis of your correct answers.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"buttons\">\n");
      out.write("            <button class=\"quit\">Exit Quiz</button>\n");
      out.write("            <button class=\"restart\">Continue</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Quiz Box -->\n");
      out.write("    <div class=\"quiz_box\">\n");
      out.write("        <header>\n");
      out.write("            <div class=\"title\">Awesome Quiz Application</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"que_text\">\n");
      out.write("                <!-- Here I've inserted question from JavaScript -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"option_list\">\n");
      out.write("                <!-- Here I've inserted options from JavaScript -->\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- footer of Quiz Box -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"total_que\">\n");
      out.write("                <!-- Here I've inserted Question Count Number from JavaScript -->\n");
      out.write("            </div>\n");
      out.write("            <button class=\"next_btn\">Next Que</button>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Result Box -->\n");
      out.write("    <div class=\"result_box\">\n");
      out.write("        <div class=\"icon\">\n");
      out.write("            <i class=\"fas fa-crown\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"complete_text\">You've completed the Quiz!</div>\n");
      out.write("        <div class=\"score_text\">\n");
      out.write("            <!-- Here I've inserted Score Result from JavaScript -->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"buttons\">\n");
      out.write("            <button class=\"restart\">Replay Quiz</button>\n");
      out.write("            <button class=\"quit\">Quit Quiz</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("\n");
      out.write("    <!-- Inside this JavaScript file I've inserted Questions and Options only -->\n");
      out.write("    <script src=\"js/questions.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Inside this JavaScript file I've coded all Quiz Codes -->\n");
      out.write("    <script src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
