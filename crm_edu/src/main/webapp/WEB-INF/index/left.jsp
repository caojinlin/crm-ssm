<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script src="<%=path %>/Js/prototype.lite.js" type="text/javascript"></script>
    <script src="<%=path %>/Js/moo.fx.js" type="text/javascript"></script>
    <script src="<%=path %>/Js/moo.fx.pack.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="<%=path %>/Style/skin.css" />
    <script type="text/javascript">
        window.onload = function () {
            var contents = document.getElementsByClassName('content');
            var toggles = document.getElementsByClassName('type');

            var myAccordion = new fx.Accordion(
            toggles, contents, {opacity: true, duration: 400}
            );
            myAccordion.showThisHideOpen(contents[0]);
            for(var i=0; i<document .getElementsByTagName("a").length; i++){
                var dl_a = document.getElementsByTagName("a")[i];
                    dl_a.onfocus=function(){
                        this.blur();
                    }
            }
        }
    </script>
</head>

<body>
    <table width="100%" height="280" border="0" cellpadding="0" cellspacing="0" bgcolor="#EEF2FB">
        <tr>
            <td width="182" valign="top">
                <div id="container">
                    <h1 class="type"><a href="javascript:void(0)">项目管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="<%=path %>/Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="chance.do?page=1" target="main">项目管理</a></li>
                            <li><a href="plan.do?page=1" target="main">项目开发</a></li>
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">客户管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="<%=path %>/Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="tocustomer.do?page=1" target="main">客户信息管理</a></li>
                            <li><a href="tolostlist.do?page=1" target="main">客户流失管理</a></li>
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">服务管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="<%=path %>/Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="toaddservice.do" target="main">服务创建</a></li>
                            <li><a href="toassignservice.do?page=1" target="main">服务分配</a></li>
                            <li><a href="todueservicelist.do?page=1" target="main">服务处理</a></li>
                            <li><a href="toresultlist.do?page=1" target="main">服务反馈</a></li>
                            <li><a href="tostatuslist.do?page=1" target="main">服务归档</a></li>
                        </ul>
                    </div>
                    <!-- *********** -->
                    <h1 class="type"><a href="javascript:void(0)">人员管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="<%=path %>/Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                        	<c:if test="${sessionScope.user.status==0 }">
                           	 <li><a href="touserlist.do" target="main">人员管理</a></li>
                        	</c:if>
                            <li><a href="toupdatepwd.do" target="main">密码修改</a></li>
                        </ul>
                    </div>
                   <h1 class="type"><a href="javascript:void(0)">统计分析</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="<%=path %>/Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="analycus.do" target="main">客户统计</a></li>
                            <li><a href="analyuser.do" target="main">人员管理</a></li>
                        </ul>
                    </div>
                    <!-- *********** 
                    <h1 class="type"><a href="javascript:void(0)">其它设置</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="<%=path %>/Images/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="javascript:void(0)" target="main">友情连接</a></li>
                            <li><a href="javascript:void(0)" target="main">在线留言</a></li>
                            <li><a href="javascript:void(0)" target="main">网站投票</a></li>
                            <li><a href="javascript:void(0)" target="main">邮箱设置</a></li>
                            <li><a href="javascript:void(0)" target="main">图片上传</a></li>
                        </ul>
                    </div>
                   *********** -->
                </div>
            </td>
        </tr>
    </table>
</body>
</html>