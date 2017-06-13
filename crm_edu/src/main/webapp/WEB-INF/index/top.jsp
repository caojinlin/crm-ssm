<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/Style/skin.css" />
    <script src="<%=path %>/components/jquery-ui/jquery-1.2.6.js" type="text/javascript"></script>
   <script>
    $(function(){
		if("${sessionScope.user}"==null){
			alert("您没有登陆,请重新登陆");
			top.location = 'logout.do';
		};
	 });
     function logout(){
    	 if(window.confirm('您确定要退出吗？')) {
	          top.location = 'logout.do';
	     }
    }       
    </script>
</head>
    <body>
        <table cellpadding="0" width="100%" height="64" background="<%=path %>/Images/top_top_bg.gif">
            <tr valign="top">
                <td width="50%"><a href="javascript:void(0)"><img style="border:none" src="<%=path %>/Images/logo.png" /></a></td>
                <td width="30%" style="padding-top:13px;font:15px Arial,SimSun,sans-serif;color:#FFF">
			      	<c:if test="${sessionScope.user.status==0 }">管理员</c:if>          
			      	<c:if test="${sessionScope.user.status==1 }">高管</c:if>          
			      	<c:if test="${sessionScope.user.status==2 }">项目经理</c:if>          
			      	<c:if test="${sessionScope.user.status==4 }">开发人员</c:if>          
			               	 ：<b>${user.name }</b> 您好，欢迎登陆使用！</td>
                <td style="padding-top:10px;" align="center"><a href="main.do" target="main"><img style="border:none" src="<%=path %>/Images/index.gif" /></a></td>
                <td style="padding-top:10px;" align="center"><a href="javascript:void(0)" onclick="logout()"><img style="border:none" src="<%=path %>/Images/out.gif" /></a></td>
            </tr>
        </table>
    </body>
</html>