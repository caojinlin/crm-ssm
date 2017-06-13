<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
    <title>客户关系管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="华北科技专业客户关系管理平台" />
    <meta name="keywords" content="华科,客户关系管理系统" />
    <meta name="Author" content="silin" />
    <meta name="CopyRight" content="华北科技" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/Style/skin.css" />
	 <script src="<%=path %>/components/jquery-ui/jquery-1.2.6.js" type="text/javascript"></script>
	<script type="text/javascript">
	$().ready(function(){  
		var msg = '${msg}';
		if(msg!=null&&msg!=""){
			alert(msg);
		}
   	}) ;
		function changeImage(obj){
			obj.src = "${pageContext.request.contextPath }/getvaliImage.do?time="+ new Date().getTime();
		}
		function check(){
			var flag = true;
			flag = checkNull("account", "用户名不能为空") && flag;
			flag = checkNull("pwd", "密码不能为空") && flag;
			flag = checkNull("code", "验证码不能为空") && flag;
			return flag;
		}
		function checkNull(name, msg){
			var value = document.getElementsByName(name)[0].value;
			setMsg(name, "");
			if(value == ""){
				//alert("用户名不能为空");
				setMsg(name, msg);
				return false;
			}
			return true;
		}
		function setMsg(name,msg){
			document.getElementById(name+"_msg").innerHTML = msg;
		}
	</script>
</head>
    <body>
        <table width="100%">
            <!-- 顶部部分 -->
            <tr height="41"><td colspan="2" background="<%=path %>/Images/login_top_bg.gif">&nbsp;</td></tr>
            <!-- 主体部分 -->
            <tr style="background:url(<%=path %>/Images/login_bg.jpg) repeat-x;" height="532">
                <!-- 主体左部分 -->
                <td id="left_cont">
                    <table width="100%" height="100%">
                        <tr height="155"><td colspan="2">&nbsp;</td></tr>
                        <tr>
                            <td width="20%" rowspan="2">&nbsp;</td>
                            <td width="60%">
                                <table width="100%">
                                    <tr height="70"><td align="right"><img src="<%=path %>/Images/logo.gif" title="华北科技" alt="华北科技" /></td></tr>
                                    <tr height="274">
                                        <td valign="top" align="right">
                                            <ul>
                                                <li>1- 为企业提高核心竞争力.</li>
                                                <li>2- 向客户提供创新式的个性化的客户交互..</li>
                                                <li>3- 提高企业的快速响应和应变能力..</li>
                                                <li><img src="<%=path %>/Images/icon_demo.gif" />&nbsp;<a href="javascript:void(0)">使用说明</a>&nbsp;&nbsp;<span> <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=609307843&site=qq&menu=yes" onfocus="this.blur()"><img border="0" src="http://wpa.qq.com/pa?p=2:609307843:41" alt="客户关系管理系统" title="华北科技"></a> </span></li>
                                            </ul>
                                        </td>
                                    </tr>
                                </table>
                            <td width="15%" rowspan="2">&nbsp;</td>
                            </td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                    </table>
                </td>
                <!-- 主体右部分 -->
                <td id="right_cont">
                    <table height="100%">
                        <tr height="30%"><td colspan="3">&nbsp;</td></tr>
                        <tr>
                            <td width="30%" rowspan="5">&nbsp;</td>
                            <td valign="top" id="form">
                                <form action="index.do" method="post" onsubmit="return check()">
                                    <table valign="top" width="50%">
                                        <tr><td colspan="2"><h4 style="letter-spacing:1px;font-size:16px;">客户关系管理系统</h4></td></tr>
                                        <tr><td>账&nbsp;&nbsp;&nbsp;&nbsp;号：</td><td><input type="text" name="account" value="" /><span id="account_msg" style="font-size:13px; color:red"></span>	</td></tr>
                                        <tr><td>密&nbsp;&nbsp;&nbsp;&nbsp;码：</td><td><input type="password" name="pwd" value="" /><span id="pwd_msg" style="font-size:13px; color:red"></span>	</td></tr>
                                        <tr><td>验证码：</td><td><input type="text" name="code"/></td><td><img id="yzm_img" src="${pageContext.request.contextPath }/getvaliImage.do" style="cursor: pointer" onclick="changeImage(this)"/><span id="code_msg" style="font-size:13px; color:red"></span>	</td></tr>
                                        <tr class="bt" align="center"><td>&nbsp;<input type="submit" value="登陆" /></td><td>&nbsp;<input type="reset" value="重填" /></td></tr>
                                    </table>
                                </form>
                            </td>
                            <td rowspan="5">&nbsp;</td>
                        </tr>
                        <tr><td colspan="3">&nbsp;</td></tr>
                    </table>
                </td>
            </tr>
            <!-- 底部部分 -->
            <tr id="login_bot"><td colspan="2"><p>Copyright © 2013-2017 silin 华北科技</p></td></tr>
        </table>
    </body>
</html>