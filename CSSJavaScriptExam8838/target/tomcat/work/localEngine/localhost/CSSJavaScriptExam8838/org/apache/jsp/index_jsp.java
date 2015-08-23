package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>电影租赁系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"css/Apple.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function goto() {\r\n");
      out.write("            window.location.href = \"http://www.baidu.com\";\r\n");
      out.write("        }\r\n");
      out.write("        function isexit() {\r\n");
      out.write("            if (confirm(\"确定退出？\")) {\r\n");
      out.write("                location=\"com.hand.servlet.HandExit\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        function showeditdialog(){   //通过JS调用模态框\r\n");
      out.write("         $(\"#mymodal\").modal(\"show\");\r\n");
      out.write("         }\r\n");
      out.write("        function showalert(){\r\n");
      out.write("            if(confirm(\"删除该条客户信息吗？\")){\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function tofilmindex(){\r\n");
      out.write("            alert(\"后续FilmIndex.jsp尚未完成！\")\r\n");
      out.write("        }\r\n");
      out.write("        function toindex(){\r\n");
      out.write("            location=\"index.jsp\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
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
      out.write("                        <li><a onclick=\"isexit()\">退出</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade bs-example-modal-sm\" role=\"dialog\" id=\"mymodal\">   ");
      out.write("\r\n");
      out.write("    <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                信息修改窗口\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"modal-body\">    ");
      out.write("\r\n");
      out.write("                <form role=\"form\" class=\"form-horizontal \">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-md-10 has-success has-feedback col-md-offset-1\">\r\n");
      out.write("                            <input name=\"Customerid\" type=\"text\" placeholder=\"Customerid\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-md-10 has-feedback col-md-offset-1\">\r\n");
      out.write("                            <input name=\"First Name\" type=\"password\" placeholder=\"First Name\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-md-10 has-feedback col-md-offset-1\">\r\n");
      out.write("                            <input name=\"Last Name\" type=\"password\" placeholder=\"Last Name\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-md-10 has-feedback col-md-offset-1\">\r\n");
      out.write("                            <input name=\"Address\" type=\"password\" placeholder=\"Address\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-md-10 has-feedback col-md-offset-1\">\r\n");
      out.write("                            <input name=\"Email\" type=\"password\" placeholder=\"Email\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"loginmodal_btn\" class=\"modal-footer\">\r\n");
      out.write("                <button class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                <button class=\"btn btn-primary\" onclick=\"toindex()\">Finish</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" style=\"margin: -15px 0px;\">\r\n");
      out.write("    <div class=\"col-md-2\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" href=\"index.jsp\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\" ></span>\r\n");
      out.write("                Customer管理\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <br>\r\n");
      out.write("            <a class=\"btn btn-default\" style=\"width: 100%;text-align: left\" onclick=\"tofilmindex()\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-stop\" ></span>\r\n");
      out.write("                Film设置\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-10\">\r\n");
      out.write("        <div style=\"background-color: #e7e7e7\"><p style=\"font-size: x-large;font-family: '黑体'\">客户管理</p>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"border-top: 2px solid blue;padding: 10px;\">\r\n");
      out.write("                <label style=\"font-size: large;width: 300px;\">客户列表</label>\r\n");
      out.write("                <a class=\"btn btn-primary\" href=\"insert.jsp\">新建</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div style=\"margin-left: 20px;\">\r\n");
      out.write("                <table border=2 style=\"background-color: #c4e3f3;line-height: 20px;\">\r\n");
      out.write("                    <tr style=\"border-bottom: 2px solid blue\">\r\n");
      out.write("                        <td colspan=\"2\">操作</td>\r\n");
      out.write("                        <th>First Name</th>\r\n");
      out.write("                        <th>Last Name</th>\r\n");
      out.write("                        <th>Address</th>\r\n");
      out.write("                        <th>Email</th>\r\n");
      out.write("                        <th>Customerid</th>\r\n");
      out.write("                        <th>LastUpdate</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                        Connection conn = getConnection();
                        StringBuffer str = new StringBuffer();
                        try {
                            Statement st = conn.createStatement();
                            String sql = "SELECT first_name,last_name,address.address,email,customer_id,customer.last_update from customer left join address on customer.address_id=address.address_id limit 0,2000";
                            ResultSet rs = st.executeQuery(sql);

                            while (rs.next()) {
                                out.print("<tr>");
                                out.print("<td><a data-toggle='modal' data-target='#mymodal'>编辑</a></td>");
                                out.print("<td><a onclick='showalert()'>删除</a></td>");
                                out.print("<td>" + rs.getString(1) + "</td>");
                                out.print("<td>" + rs.getString(2) + "</td>");
                                out.print("<td>" + rs.getString(3) + "</td>");
                                out.print("<td>" + rs.getString(4) + "</td>");
                                out.print("<td>" + rs.getInt(5) + "</td>");
                                out.print("<td>" + rs.getString(6) + "</td>");
                                out.print("</tr>");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                    
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    //    alert(screen.availHeight+\" \"+screen.availWidth);\r\n");
      out.write("    $(\"#mytab a\").click(function (e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("        $(this).tab(\"show\");\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#user_a\").hover(function (e) {                     /* 鼠标划过用户头像显示下拉菜单*/\r\n");
      out.write("        $(\"#user_ul\").slideDown(500);\r\n");
      out.write("    }, function (e) {                                      /* 鼠标离开用户头像隐藏下拉菜单*/\r\n");
      out.write("        $(\"#user_ul\").hide();\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#user_ul\").hover(function (e) {                    /* 鼠标悬停在下拉菜单时保持显示*/\r\n");
      out.write("        $(this).show();\r\n");
      out.write("    }, function (e) {                                      /* 鼠标离开下拉菜单时隐藏*/\r\n");
      out.write("        $(this).hide();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
