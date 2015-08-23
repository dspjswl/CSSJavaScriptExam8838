<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>

<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>电影租赁系统</title>
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/Apple.css" rel="stylesheet" type="text/css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script>
        function goto() {
            window.location.href = "http://www.baidu.com";
        }
        function isexit() {
            if (confirm("确定退出？")) {
                location="com.hand.servlet.HandExit";
            }

        }
        function showeditdialog(){   //通过JS调用模态框
         $("#mymodal").modal("show");
         }
        function showalert(){
            if(confirm("删除该条客户信息吗？")){

            }
        }
        function tofilmindex(){
            alert("后续FilmIndex.jsp尚未完成！")
        }
        function toindex(){
            location="index.jsp";
        }
    </script>
</head>
<body>
<%!
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
%>
<%--导航条--%>
<nav class="navbar navbar-inverse" role="navigation" style="background-color: #31b0d5">
    <div style="margin-left: 50px;margin-right: 50px;">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#response-navbar-collapse">         <!--响应式导航栏-->
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.jsp">
                <p style="font-size: xx-large;color:gray;margin: 10px auto;">8838林宇恒</p>
            </a>
        </div>
        <div class="collapse navbar-collapse" id="response-navbar-collapse">
            <ul class="nav navbar-nav navbar-right ">
                <li class="dropdown">
                    <a id="user_a" href="#" class="dropdown-toggle" data-toggle="dropdown" style="color: white">
                        <span class="glyphicon glyphicon-user" style="color: #23527c"></span>
                        Admin
                    </a>
                    <ul id="user_ul" class="dropdown-menu dropdown-menu-left">
                        <li><a onclick="isexit()">退出</a></li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>
</nav>
<%--第一屏背景图片--%>

<div class="modal fade bs-example-modal-sm" role="dialog" id="mymodal">   <%--登录窗口--%>
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                信息修改窗口
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>

            <div class="modal-body">    <%--登录窗口模块--%>
                <form role="form" class="form-horizontal ">
                    <div class="form-group">
                        <div class="col-md-10 has-success has-feedback col-md-offset-1">
                            <input name="Customerid" type="text" placeholder="Customerid" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-10 has-feedback col-md-offset-1">
                            <input name="First Name" type="password" placeholder="First Name" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-10 has-feedback col-md-offset-1">
                            <input name="Last Name" type="password" placeholder="Last Name" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-10 has-feedback col-md-offset-1">
                            <input name="Address" type="password" placeholder="Address" class="form-control">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-10 has-feedback col-md-offset-1">
                            <input name="Email" type="password" placeholder="Email" class="form-control">
                        </div>
                    </div>
                </form>
            </div>
            <div id="loginmodal_btn" class="modal-footer">
                <button class="btn btn-default" data-dismiss="modal">Close</button>
                <button class="btn btn-primary" onclick="toindex()">Finish</button>
            </div>
        </div>
    </div>
</div>
<%--<div class="container">--%>

<div class="row" style="margin: -15px 0px;">
    <div class="col-md-2">
        <div>
            <a class="btn btn-default" style="width: 100%;text-align: left" href="index.jsp">
                <span class="glyphicon glyphicon-stop" ></span>
                Customer管理
                <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
            <br>
            <a class="btn btn-default" style="width: 100%;text-align: left" onclick="tofilmindex()">
                <span class="glyphicon glyphicon-stop" ></span>
                Film设置
                <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
        </div>
        <%--<table><td colspan=""></td></table>--%>
    </div>
    <div class="col-md-10">
        <div style="background-color: #e7e7e7"><p style="font-size: x-large;font-family: '黑体'">客户管理</p>

            <div style="border-top: 2px solid blue;padding: 10px;">
                <label style="font-size: large;width: 300px;">客户列表</label>
                <a class="btn btn-primary" href="insert.jsp">新建</a>
            </div>
            <div style="margin-left: 20px;">
                <table border=2 style="background-color: #c4e3f3;line-height: 20px;">
                    <tr style="border-bottom: 2px solid blue">
                        <td colspan="2">操作</td>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>Customerid</th>
                        <th>LastUpdate</th>
                    </tr>
                    <%
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

                    %>
                </table>
            </div>
        </div>
    </div>
</div>
<%--</div>--%>
<script>
    //    alert(screen.availHeight+" "+screen.availWidth);
    $("#mytab a").click(function (e) {
        e.preventDefault();
        $(this).tab("show");
    });
    $("#user_a").hover(function (e) {                     /* 鼠标划过用户头像显示下拉菜单*/
        $("#user_ul").slideDown(500);
    }, function (e) {                                      /* 鼠标离开用户头像隐藏下拉菜单*/
        $("#user_ul").hide();
    });
    $("#user_ul").hover(function (e) {                    /* 鼠标悬停在下拉菜单时保持显示*/
        $(this).show();
    }, function (e) {                                      /* 鼠标离开下拉菜单时隐藏*/
        $(this).hide();
    });
</script>
</body>
</html>
