package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.userDetails;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/all_components/allLinks.jsp");
    _jspx_dependants.add("/all_components/navbar.jsp");
    _jspx_dependants.add("/all_components/footer.jsp");
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Images/LoGo QP W.jpg\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- Required meta tags -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Images/LoGo QP W.jpg\" />\n");
      out.write("\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link\n");
      out.write("    href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\n");
      out.write("    rel=\"stylesheet\"\n");
      out.write("    />\n");
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
      out.write("<script\n");
      out.write("    type=\"text/javascript\"\n");
      out.write("    src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.js\"\n");
      out.write("></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\" ></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Quiz Point</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"vh-100\" style=\"background-color: #eee;\">\n");
      out.write("            <div class=\"container py-5 h-100\">\n");
      out.write("                <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                    <div class=\"col col-xl-10\">\n");
      out.write("                        <div class=\"card\" style=\"border-radius: 1rem;\">\n");
      out.write("                            <div class=\"row g-0\">\n");
      out.write("                                <div class=\"col-md-6 col-lg-5 d-none d-md-block\">\n");
      out.write("                                    <img \n");
      out.write("                                        src=\"Images/login.png\"\n");
      out.write("                                        alt=\"login form\"\n");
      out.write("                                        class=\"img-fluid mt-5\" style=\"border-radius: 1rem 0 0 1rem; \"\n");
      out.write("                                        />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-lg-7 d-flex align-items-center\">\n");
      out.write("                                    <div class=\"card-body p-4 p-lg-5 text-black\">\n");
      out.write("\n");
      out.write("                                        <form action=\"loginServelt\" method=\"post\">\n");
      out.write("\n");
      out.write("                                            <div class=\"d-flex align-items-center mb-3 pb-1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <span class=\"h1 fw-bold mb-0\">QuizPoint</span>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <h5 class=\"fw-normal mb-3 pb-3\" style=\"letter-spacing: 1px;\">Sign into your account</h5>\n");
      out.write("                                            ");
                                                String invalidMsg = (String) session.getAttribute("loginfailed");
                                                if (invalidMsg != null) {
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"alert alert-danger\" role=\"alert\">");
      out.print(invalidMsg);
      out.write("</div>\n");
      out.write("\n");
      out.write("                                            ");

                                                    session.removeAttribute("loginfailed");
                                                }
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <!--                                            code is not complete here -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            ");

                                                String lgMsg = (String) session.getAttribute("logoutMSG");
                                                if (lgMsg != null) {
                                            
      out.write("\n");
      out.write("                                            <div class=\"alert alert-success\" role=\"alert\">");
      out.print(lgMsg);
      out.write("</div>\n");
      out.write("                                            ");

                                                    session.removeAttribute("logoutMSG");
                                                    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
                                                    response.setHeader("Pragma", "no-cache");
                                                    response.setHeader("Expires", "0");

                                                }

                                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"form-outline mb-4\">\n");
      out.write("                                                <input type=\"email\" id=\"form2Example17\" name=\"uemail\" class=\"form-control form-control-lg\" required/>\n");
      out.write("                                                <label class=\"form-label\" for=\"form2Example17\">Email address</label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-outline mb-4\">\n");
      out.write("                                                <input type=\"password\" id=\"form2Example27\" name=\"upassword\" class=\"form-control form-control-lg\" required />\n");
      out.write("                                                <label class=\"form-label\" for=\"form2Example27\">Password</label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"pt-1 mb-4\">\n");
      out.write("                                                <input type=\"submit\" value=\"Login\" class=\"btn btn-dark btn-lg btn-block \">\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <a class=\"small text-muted\" href=\"#!\">Forgot password?</a>\n");
      out.write("                                            <p class=\"mb-5 pb-lg-2\" style=\"color: #393f81;\">Don't have an account? <a href=\"signup.jsp\" style=\"color: #393f81;\">Register here</a></p>\n");
      out.write("                                            <a href=\"#!\" class=\"small text-muted\">Terms of use.</a>\n");
      out.write("                                            <a href=\"#!\" class=\"small text-muted\">Privacy policy</a>\n");
      out.write("                                        </form>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- Footer -->\n");
      out.write("        <footer class=\"page-footer font-small mdb-color lighten-3 pt-4 bg-dark\">\n");
      out.write("\n");
      out.write("            <!-- Footer Links -->\n");
      out.write("            <div class=\"container text-center text-md-left\">\n");
      out.write("\n");
      out.write("                <!-- Grid row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 mr-auto my-md-4 my-0 mt-4 mb-1 text-light\">\n");
      out.write("\n");
      out.write("                        <!-- Content -->\n");
      out.write("                        <h5 class=\"font-weight-bold text-uppercase mb-4 text-light\">Footer Content</h5>\n");
      out.write("                        <p>It is managed by the website creater</p>\n");
      out.write("                        <p>This web Application is made by-:</p>\n");
      out.write("                        <h5>&nbsp;&nbsp;&nbsp;\"Kunal Thakurani\"</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <hr class=\"clearfix w-100 d-md-none text-light\">\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 mx-auto my-md-4 my-0 mt-4 mb-1\">\n");
      out.write("\n");
      out.write("                        <!-- Links -->\n");
      out.write("                        <h5 class=\"font-weight-bold text-uppercase mb-4 text-light\">About</h5>\n");
      out.write("\n");
      out.write("                        <ul class=\"list-unstyled text-light\">\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"#!\">PROJECTS</a>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"#!\">ABOUT US</a>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"#!\">BLOG</a>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <a href=\"#!\">AWARDS</a>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <hr class=\"clearfix w-100 d-md-none\">\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 mx-auto my-md-4 my-0 mt-4 mb-1\">\n");
      out.write("\n");
      out.write("                        <!-- Contact details -->\n");
      out.write("                        <h5 class=\"font-weight-bold text-uppercase text-light mb-4\">Address</h5>\n");
      out.write("\n");
      out.write("                        <ul class=\"list-unstyled text-light\">\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <i class=\"fas fa-home \"></i>Sushila devi bansal college of technology</p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <i class=\"fas fa-envelope \"></i> quizpointkp@gmail.com</p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <i class=\"fas fa-phone \"></i> +91 8817622715</p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <p>\n");
      out.write("                                    <i class=\"fas fa-print \"></i> +91 7999910495</p>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("\n");
      out.write("                    <hr class=\"clearfix w-100 d-md-none\">\n");
      out.write("\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 text-center mx-auto my-4\">\n");
      out.write("\n");
      out.write("                        <!-- Social buttons -->\n");
      out.write("                        <h5 class=\"font-weight-bold text-uppercase mb-4 text-light\">Follow Us</h5>\n");
      out.write("\n");
      out.write("                        <!-- Facebook -->\n");
      out.write("                        <a type=\"button\" class=\"btn-floating btn-fb\">\n");
      out.write("                            <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <!-- Twitter -->\n");
      out.write("                        <a type=\"button\" class=\"btn-floating btn-tw\">\n");
      out.write("                            <i class=\"fab fa-twitter\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <!-- Google +-->\n");
      out.write("                        <a type=\"button\" class=\"btn-floating btn-gplus\">\n");
      out.write("                            <i class=\"fab fa-google-plus-g\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <!-- Dribbble -->\n");
      out.write("                        <a type=\"button\" class=\"btn-floating btn-dribbble\">\n");
      out.write("                            <i class=\"fab fa-dribbble\"></i>\n");
      out.write("                        </a>\n");
      out.write("                       \n");
      out.write("                        <div class=\"mt-4\">\n");
      out.write("                        <a class=\"btn btn-outline-success  \" href=\"login.jsp\"> Admin </a>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid column -->\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- Grid row -->\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- Footer Links -->\n");
      out.write("\n");
      out.write("            <!-- Copyright -->\n");
      out.write("<!--            <div class=\"footer-copyright text-center py-3 text-light\">© 2022 Copyright:\n");
      out.write("                <a href=\"https://quizpoint.com\"> quizpoint.com</a>\n");
      out.write("            </div>-->\n");
      out.write("            <!-- Copyright -->\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        <!-- Footer -->");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- Required meta tags -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Images/LoGo QP W.jpg\" />\n");
      out.write("\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" integrity=\"sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link\n");
      out.write("    href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\n");
      out.write("    rel=\"stylesheet\"\n");
      out.write("    />\n");
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
      out.write("<script\n");
      out.write("    type=\"text/javascript\"\n");
      out.write("    src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.js\"\n");
      out.write("></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js\" ></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
