package org.apache.jsp.all_005fcomponents;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.userDetails;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
