package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>新增界面</title>\r\n");
      out.write("    <title>电影租赁系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"css/Apple.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-inverse\" role=\"navigation\" style=\"background-color: #31b0d5\">\r\n");
      out.write("    <div style=\"margin-left: 50px;margin-right: 50px;\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                    data-target=\"#response-navbar-collapse\">         <!--响应式导航栏-->\r\n");
      out.write("                <span class=\"sr-only\">切换导航</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">\r\n");
      out.write("                <p style=\"font-size: xx-large;color:gray;margin: 10px auto;\">8838林宇恒</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"response-navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right \">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a id=\"user_a\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"color: white\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-user\" style=\"color: #23527c\"></span>\r\n");
      out.write("                        Admin\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul id=\"user_ul\" class=\"dropdown-menu dropdown-menu-left\">\r\n");
      out.write("                        <li><a href=\"#\">退出</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"row\" style=\"margin: -15px 0px;\">\r\n");
      out.write("    <div class=\"col-md-2\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"#\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\"></span>\r\n");
      out.write("                Dashboard\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <br>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"#\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\"></span>\r\n");
      out.write("                应用设置\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a><br>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"#\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\"></span>\r\n");
      out.write("                管理设置\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a><br>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"#\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\"></span>\r\n");
      out.write("                数据配置\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a><br>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"#\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\"></span>\r\n");
      out.write("                主数据管理\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a><br>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"#\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\"></span>\r\n");
      out.write("                客户订单管理\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a><br>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"#\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\"></span>\r\n");
      out.write("                发货单管理\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-10\">\r\n");
      out.write("        <div style=\"background-color: #e7e7e7\"><p style=\"font-size: x-large;font-family: '黑体'\">创建Customer</p>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"border-top: 3px solid blue;padding: 10px;\">\r\n");
      out.write("                <label style=\"font-size: large;width: 300px;\">基本信息</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"margin-left: 40px;margin-top: 10px;width: 400px;\">\r\n");
      out.write("            <form action=\"com.hand.servlet.HandleInsert\" class=\"form-group\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    First Name <h7 style=\"color: red\">*</h7>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"First Name\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    Last Name <h7 style=\"color: red\">*</h7>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"Last Name\">\r\n");
      out.write("                </div><br>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    Email\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"Email\">\r\n");
      out.write("                </div><br>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    Address <h7 style=\"color: red\">*</h7>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <input type=\"text\" name=\"Address\">\r\n");
      out.write("                </div><br>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4  col-lg-offset-4\">\r\n");
      out.write("                    <button  type=\"submit\" class=\"btn btn-primary\">新建</button>\r\n");
      out.write("                    <button  type=\"submit\" class=\"btn btn-default\">取消</button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
