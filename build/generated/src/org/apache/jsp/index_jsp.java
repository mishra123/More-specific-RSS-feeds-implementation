package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("        \n");
      out.write("        <form action=\"anoop1.do\" method=\"POST\">\n");
      out.write("            <h1>Select an Option!</h1>\n");
      out.write("        <select name=\"opt\" size=\"1\">\n");
      out.write("            <option value=\" \"></option>\n");
      out.write("  <option value=\"BBC\">BBC</option>\n");
      out.write("  <option value=\"NYT\">New York Times</option>\n");
      out.write("  <option value=\"SMH\">Sydney Morning Herald</option>\n");
      out.write("        </select>\n");
      out.write("            <select name=\"opt1\" size=\"1\">\n");
      out.write("            <option value=\" \"></option>\n");
      out.write("  <option value=\"Business\">Business</option>\n");
      out.write("  <option value=\"Technology\">Technology</option>\n");
      out.write("  <option value=\"World News\">World News</option>\n");
      out.write("        </select>\n");
      out.write("   <input type=\"text\" name=\"opt2\"  />\n");
      out.write("   <input type=\"submit\" />\n");
      out.write("              \n");
      out.write("            </form>\n");
      out.write("        </body>\n");
      out.write("        </html>");
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
