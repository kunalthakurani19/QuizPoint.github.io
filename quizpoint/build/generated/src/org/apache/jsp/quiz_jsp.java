package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.userDetails;

public final class quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");


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
      out.write('\n');
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
      out.write("    ");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <!--Main Navigation-->\n");
      out.write("<header>\n");
      out.write("  <!-- Sidebar -->\n");
      out.write("  <nav id=\"sidebarMenu\" class=\"collapse d-lg-block sidebar collapse bg-white\">\n");
      out.write("    <div class=\"position-sticky\">\n");
      out.write("      <div class=\"list-group list-group-flush mx-3 mt-4\">\n");
      out.write("<!--        <a\n");
      out.write("          href=\"#\"\n");
      out.write("          class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          aria-current=\"true\"\n");
      out.write("        >-->\n");
      out.write("          <i class=\"fas fa-tachometer-alt fa-fw me-3\"></i><span>Main dashboard</span>\n");
      out.write("<!--        </a>-->\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple active\">\n");
      out.write("          <i class=\"fas fa-chart-area fa-fw me-3\"></i><span>Webiste traffic</span>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-lock fa-fw me-3\"></i><span>Password</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-chart-line fa-fw me-3\"></i><span>Analytics</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\">\n");
      out.write("          <i class=\"fas fa-chart-pie fa-fw me-3\"></i><span>SEO</span>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-chart-bar fa-fw me-3\"></i><span>Orders</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-globe fa-fw me-3\"></i><span>International</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-building fa-fw me-3\"></i><span>Partners</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-calendar fa-fw me-3\"></i><span>Calendar</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-users fa-fw me-3\"></i><span>Users</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action py-2 ripple\"\n");
      out.write("          ><i class=\"fas fa-money-bill fa-fw me-3\"></i><span>Sales</span></a\n");
      out.write("        >\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <!-- Sidebar -->\n");
      out.write("\n");
      out.write("  <!-- Navbar -->\n");
      out.write("  <nav id=\"main-navbar\" class=\"navbar navbar-expand-lg navbar-light bg-white fixed-top\">\n");
      out.write("    <!-- Container wrapper -->\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <!-- Toggle button -->\n");
      out.write("      <button\n");
      out.write("        class=\"navbar-toggler\"\n");
      out.write("        type=\"button\"\n");
      out.write("        data-mdb-toggle=\"collapse\"\n");
      out.write("        data-mdb-target=\"#sidebarMenu\"\n");
      out.write("        aria-controls=\"sidebarMenu\"\n");
      out.write("        aria-expanded=\"false\"\n");
      out.write("        aria-label=\"Toggle navigation\"\n");
      out.write("      >\n");
      out.write("        <i class=\"fas fa-bars\"></i>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <!-- Brand -->\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("<!--        <img\n");
      out.write("          src=\"https://mdbcdn.b-cdn.net/img/logo/mdb-transaprent-noshadows.webp\"\n");
      out.write("          height=\"25\"\n");
      out.write("          alt=\"MDB Logo\"\n");
      out.write("          loading=\"lazy\"\n");
      out.write("        />-->\n");
      out.write("      </a>\n");
      out.write("      <!-- Search form -->\n");
      out.write("      <form class=\"d-none d-md-flex input-group w-auto my-auto\">\n");
      out.write("        <input\n");
      out.write("          autocomplete=\"off\"\n");
      out.write("          type=\"search\"\n");
      out.write("          class=\"form-control rounded\"\n");
      out.write("          placeholder='Search (ctrl + \"/\" to focus)'\n");
      out.write("          style=\"min-width: 225px;\"\n");
      out.write("        />\n");
      out.write("        <span class=\"input-group-text border-0\"><i class=\"fas fa-search\"></i></span>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("      <!-- Right links -->\n");
      out.write("      <ul class=\"navbar-nav ms-auto d-flex flex-row\">\n");
      out.write("        <!-- Notification dropdown -->\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a\n");
      out.write("            class=\"nav-link me-3 me-lg-0 dropdown-toggle hidden-arrow\"\n");
      out.write("            href=\"#\"\n");
      out.write("            id=\"navbarDropdownMenuLink\"\n");
      out.write("            role=\"button\"\n");
      out.write("            data-mdb-toggle=\"dropdown\"\n");
      out.write("            aria-expanded=\"false\"\n");
      out.write("          >\n");
      out.write("            <i class=\"fas fa-bell\"></i>\n");
      out.write("            <span class=\"badge rounded-pill badge-notification bg-danger\">1</span>\n");
      out.write("          </a>\n");
      out.write("          <ul\n");
      out.write("            class=\"dropdown-menu dropdown-menu-end\"\n");
      out.write("            aria-labelledby=\"navbarDropdownMenuLink\"\n");
      out.write("          >\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Some news</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Another news</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <!-- Icon -->\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link me-3 me-lg-0\" href=\"#\">\n");
      out.write("            <i class=\"fas fa-fill-drip\"></i>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <!-- Icon -->\n");
      out.write("        <li class=\"nav-item me-3 me-lg-0\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">\n");
      out.write("            <i class=\"fab fa-github\"></i>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <!-- Icon dropdown -->\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a\n");
      out.write("            class=\"nav-link me-3 me-lg-0 dropdown-toggle hidden-arrow\"\n");
      out.write("            href=\"#\"\n");
      out.write("            id=\"navbarDropdown\"\n");
      out.write("            role=\"button\"\n");
      out.write("            data-mdb-toggle=\"dropdown\"\n");
      out.write("            aria-expanded=\"false\"\n");
      out.write("          >\n");
      out.write("            <i class=\"flag-united-kingdom flag m-0\"></i>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"\n");
      out.write("                ><i class=\"flag-united-kingdom flag\"></i>English\n");
      out.write("                <i class=\"fa fa-check text-success ms-2\"></i\n");
      out.write("              ></a>\n");
      out.write("            </li>\n");
      out.write("            <li><hr class=\"dropdown-divider\" /></li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-poland flag\"></i>Polski</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-china flag\"></i>中文</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-japan flag\"></i>日本語</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-germany flag\"></i>Deutsch</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-france flag\"></i>Français</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-spain flag\"></i>Español</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-russia flag\"></i>Русский</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\"><i class=\"flag-portugal flag\"></i>Português</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <!-- Avatar -->\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a\n");
      out.write("            class=\"nav-link dropdown-toggle hidden-arrow d-flex align-items-center\"\n");
      out.write("            href=\"#\"\n");
      out.write("            id=\"navbarDropdownMenuLink\"\n");
      out.write("            role=\"button\"\n");
      out.write("            data-mdb-toggle=\"dropdown\"\n");
      out.write("            aria-expanded=\"false\"\n");
      out.write("          >\n");
      out.write("<!--            <img\n");
      out.write("              src=\"https://mdbcdn.b-cdn.net/img/Photos/Avatars/img (31).webp\"\n");
      out.write("              class=\"rounded-circle\"\n");
      out.write("              height=\"22\"\n");
      out.write("              alt=\"Avatar\"\n");
      out.write("              loading=\"lazy\"\n");
      out.write("            />-->\n");
      out.write("          </a>\n");
      out.write("          <ul\n");
      out.write("            class=\"dropdown-menu dropdown-menu-end\"\n");
      out.write("            aria-labelledby=\"navbarDropdownMenuLink\"\n");
      out.write("          >\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">My profile</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Settings</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item\" href=\"#\">Logout</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- Container wrapper -->\n");
      out.write("  </nav>\n");
      out.write("  <!-- Navbar -->\n");
      out.write("</header>\n");
      out.write("<!--Main Navigation-->\n");
      out.write("\n");
      out.write("<!--Main layout-->\n");
      out.write("<main style=\"margin-top: 58px;\">\n");
      out.write("  <div class=\"container pt-4\"></div>\n");
      out.write("</main>\n");
      out.write("<!--Main layout-->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <h1 class=\"text-center\"> Welcome to QuizPoint Select Your Subject</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"card-deck m-5 w-80\">\n");
      out.write("\n");
      out.write("            <div class=\"card m-5 \">\n");
      out.write("                <img class=\"card-img-top \" src=\"Images/mlt.jpg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Machine Learning</h5>\n");
      out.write("                    <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                    <a href=\"machineLearningQuiz.jsp\" class=\"stretched-link\"></a>\n");
      out.write("                    <div class=\"start_btn\"><button>Start Quiz</button></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card m-5 \">\n");
      out.write("                <img class=\"card-img-top\" src=\"Images/cn.png\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Computer Networks</h5>\n");
      out.write("                    <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("                    <a href=\"computerNetoworkTutorial.html\" class=\"stretched-link\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card m-5\">\n");
      out.write("                <img class=\"card-img-top\" src=\"Images/cg.jpg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Computer Graphics And Visualization</h5>\n");
      out.write("                    <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n");
      out.write("                    <a href=\"#\" class=\"stretched-link\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <!-- start Quiz button -->\n");
      out.write("    <div class=\"start_btn\"><button>Start Quiz</button></div>\n");
      out.write("\n");
      out.write("    <!-- Info Box -->\n");
      out.write("    <div class=\"info_box\">\n");
      out.write("        <div class=\"info-title\"><span>Some Rules of this Quiz</span></div>\n");
      out.write("        <div class=\"info-list\">\n");
      out.write("            <div class=\"info\">1. You will have only <span>15 seconds</span> per each question.</div>\n");
      out.write("            <div class=\"info\">2. Once you select your answer, it can't be undone.</div>\n");
      out.write("            <div class=\"info\">3. You can't select any option once time goes off.</div>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
