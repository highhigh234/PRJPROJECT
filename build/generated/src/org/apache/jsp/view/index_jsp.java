package org.apache.jsp.view;

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
      out.write("        <link href=\"../css/index.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Responsive navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Khách Sạn SUN&SEA Cửa Lò | 128 Nguyễn Sư Hồi | 0936640999</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"#!\">Trang chủ</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Giới Thiệu</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"room\">Hệ Thống Phòng</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"customer/booking.jsp\">Đặt Phòng</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#!\">Liên Hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Page Content-->\n");
      out.write("        <div class=\"container px-4 px-lg-5\">\n");
      out.write("            <!-- Heading Row-->\n");
      out.write("            <div class=\"row gx-4 gx-lg-5 align-items-center my-5\">\n");
      out.write("                <div class=\"col-lg-7\"><img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"https://upload.wikimedia.org/wikipedia/commons/6/61/Cualovedem.jpg\" alt=\"...\"  /></div>\n");
      out.write("                <div class=\"col-lg-5\">\n");
      out.write("                    <h1 class=\"font-weight-light\">Về Thị Xã Cửa Lò</h1>\n");
      out.write("                    <p>Cửa Lò được Tổ chức Du lịch thế giới đánh giá là một trong những bãi tắm lý tưởng nhất Việt Nam:Với chiều dài trên 10 km, được bao bọc bởi hai con sông ở hai đầu, độ dốc thoải đều, nước biển trong xanh, sóng vừa phải, độ mặn thích hợp là những đặc điểm mà không phải bãi tắm nào cũng có……</p>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"https://cualo.vn/gioi-thieu-ve-cua-lo/\">Tới bài viết.</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Call to Action-->\n");
      out.write("            <div class=\"card text-white bg-secondary my-5 py-4 text-center\">\n");
      out.write("                <div class=\"card-body\"><p class=\"text-white m-0\">Giới thiệu về thị xã Cửa Lò</p></div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Content Row-->\n");
      out.write("            <div class=\"row gx-4 gx-lg-5\">\n");
      out.write("                <div class=\"col-md-4 mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h2 class=\"card-title\"><img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"https://dulichbiencualo.org/view/at_thi-xa-cua-lo-nghe-an_7e7d77a3773f8e28fb07ffa52a847a38.jpg\" alt=\"...\"/></h2>\n");
      out.write("                            <p class=\"card-text\">Thị xã Cửa Lò - Nghệ An</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\"><a class=\"btn btn-primary btn-sm\" href=\"https://dulichbiencualo.org/thi-xa-cua-lo-nghe-an-n.html\">Tới bài viết!</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h2 class=\"card-title\"><img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"https://statics.vinpearl.com/du-lich-cua-lo-nghe-an-01_1635689952.jpg\" alt=\"...\"/></h2>\n");
      out.write("                            <p class=\"card-text\">Du lịch Cửa Lò Nghệ An nên đi đâu? Ăn gì? Ở khách sạn nào?...</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\"><a class=\"btn btn-primary btn-sm\" href=\"https://vinpearl.com/vi/du-lich-cua-lo-nghe-an-so-tay-du-lich-tu-a-den-z\">Tới bài viết!</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mb-5\">\n");
      out.write("                    <div class=\"card h-100\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h2 class=\"card-title\">Tại sao du khách lại chọn Cửa Lò làm nơi nghỉ dưỡng vào mùa hè ?</h2>\n");
      out.write("                            <p class=\"card-text\">Không chỉ nổi tiếng là danh thắng với vẻ đẹp nên thơ, kỳ vĩ; Cửa Lò còn là đô thị trẻ năng động với những đường </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\"><a class=\"btn btn-primary btn-sm\" href=\"https://www.youtube.com/watch?v=m0eAltxGXUo\">Xem video!</a></div>\n");
      out.write("                    </div>\n");
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
