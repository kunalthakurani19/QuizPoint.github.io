package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.userDetails;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADMIN PAGE</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Images/LoGo QP W.jpg\" />\n");
      out.write("\n");
      out.write("        ");
      out.write("<!-- Required meta tags -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Images/LoGo QP W.jpg\" />\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
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
      out.write("       <section style=\"background-color: #eee;\">\n");
      out.write("            <div class=\"container py-5\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                     \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-body text-center\">\n");
      out.write("                                <img src=\"profilepic.png\" alt=\"avatar\" class=\"rounded-circle img-fluid\" style=\"width: 150px;\">\n");
      out.write("                                <!--<img src=\"../../../../Desktop/profile-pic.png\" alt=\"\"/>-->\n");
      out.write("                                <h6 class=\"my-3\">WELCOME ADMIN</h6>\n");
      out.write("                                <h4 class=\"my-3\">Kunal Thakurani</h4>\n");
      out.write("                                <p class=\"text-muted mb-1\">Quizpoint Administrator</p>\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-4 mb-lg-0\">\n");
      out.write("                            <div class=\"card-body p-0\">\n");
      out.write("                                <ul class=\"list-group list-group-flush rounded-3\">\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center p-3\">\n");
      out.write("                                        <i class=\"fa-solid fa-file-circle-plus\" style=\"font-size:30px;color: #333333;\"></i>                                        \n");
      out.write("                                        <a class=\"btn btn-outline-success btn-block\" href=\"admin jsp/addquestions.jsp\">Add Questions</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center p-3\">\n");
      out.write("                                        <i class=\"fa fa-solid fa-file-pen\" style=\"font-size:30px;color: #333333;\"></i>\n");
      out.write("                                        <a class=\"btn btn-outline-warning btn-block\" href=\"admin jsp/updatequestions.jsp\" >Update Questions</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center p-3\">\n");
      out.write("                                        <i class=\"fa-solid fa-file-circle-minus\" style=\"font-size:30px;color: #333333;\"></i>\n");
      out.write("                                        <a class=\"btn btn-outline-danger btn-block\"href=\"admin jsp/deletequestions.jsp\">Delete Question</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </ul> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\"> Full Name</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">bharat</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Email</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\"><kunal></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Phone</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">(097) 234-5678</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>   \n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Mobile</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">(098) 765-4321</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <p class=\"mb-0\">Address</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <p class=\"text-muted mb-0\">Bay Area, San Francisco, CA</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card mb-4 mb-md-0\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <p class=\"mb-4\"><span class=\"text-primary font-italic me-1\">assigment</span> Project Status</p>\n");
      out.write("                                        <p class=\"mb-1\" style=\"font-size: .77rem;\">Web Design</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 80%\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">Website Markup</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 72%\" aria-valuenow=\"72\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">One Page</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 89%\" aria-valuenow=\"89\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">Mobile Template</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 55%\" aria-valuenow=\"55\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">Backend API</p>\n");
      out.write("                                        <div class=\"progress rounded mb-2\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 66%\" aria-valuenow=\"66\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card mb-4 mb-md-0\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <p class=\"mb-4\"><span class=\"text-primary font-italic me-1\">assigment</span> Project Status</p>\n");
      out.write("                                        <p class=\"mb-1\" style=\"font-size: .77rem;\">Web Design</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 80%\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">Website Markup</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 72%\" aria-valuenow=\"72\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">One Page</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 89%\" aria-valuenow=\"89\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">Mobile Template</p>\n");
      out.write("                                        <div class=\"progress rounded\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 55%\" aria-valuenow=\"55\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <p class=\"mt-4 mb-1\" style=\"font-size: .77rem;\">Backend API</p>\n");
      out.write("                                        <div class=\"progress rounded mb-2\" style=\"height: 5px;\">\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 66%\" aria-valuenow=\"66\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("         ");
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
      out.write("                </div>            \n");
      out.write("                <!-- Grid row -->\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        <!-- Footer Links -->\n");
      out.write("  \n");
      out.write("\n");
      out.write("    </footer>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
