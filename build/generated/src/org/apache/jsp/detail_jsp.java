package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Small Business - Start Bootstrap Template</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Responsive navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Khách Sạn SUN&SEA Cửa Lò | 128 Nguyễn Sư Hồi | 0936640999</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"index\">Trang chủ</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Giới Thiệu</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"room\">Hệ Thống Phòng</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"booking.jsp\">Đặt Phòng</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Liên Hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>đ\n");
      out.write("        <!-- Page Content-->\n");
      out.write("        <div class=\"container px-4 px-lg-5\">\n");
      out.write("            <!-- Heading Row-->\n");
      out.write("            <div class=\"row gx-4 gx-lg-5 align-items-center my-5\">\n");
      out.write("                <div class=\"col-lg-7\"><img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"https://upload.wikimedia.org/wikipedia/commons/6/61/Cualovedem.jpg\" alt=\"...\"  /></div>\n");
      out.write("                <div class=\"col-lg-5\">\n");
      out.write("                    <h1 class=\"font-weight-light\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roomtypess.rtype}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Room</h1>\n");
      out.write("                    <P>Number of guest allowed : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roomtypess.maxallowed}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</P>\n");
      out.write("                    <P>Price Per Night : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roomtypess.pricepernight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("đ</P>\n");
      out.write("                    <P>Description : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roomtypess.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</P>\n");
      out.write("                    <P>Facilities : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${roomtypess.facilities}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</P>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"booking.jsp\">Book now!</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"py-5 bg-dark\">\n");
      out.write("            <div class=\"container px-4 px-lg-5\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2021</p></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
