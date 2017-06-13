<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/Style/skin.css" />
    <script>
    function check(){
		var flag = true;
		flag = checkNull("name", "客户名不能为空") && flag;
		flag = checkNull("address", "地址不能为空") && flag;
		flag = checkNull("lev", "等级不能为空") && flag;
		flag = checkNull("zip", "邮编不能为空") && flag;
		flag = checkNull("tel", "电话不能为空") && flag;
		return flag;
	}
	function checkNull(name, msg){
		var value = document.getElementsByName(name)[0].value;
		setMsg(name, "");
		if(value == ""){
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
    
        <table width="100%" border="0" cellpadding="0" cellspacing="0">
            <!-- 头部开始 -->
            <tr>
                <td width="17" valign="top" background="<%=path %>/Images/mail_left_bg.gif">
                    <img src="<%=path %>/Images/left_top_right.gif" width="17" height="29" />
                </td>
                <td valign="top" background="<%=path %>/Images/content_bg.gif">
                    <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" background="./<%=path %>/Images/content_bg.gif">
                        <tr><td height="31"><div class="title">客户修改</div></td></tr>
                    </table>
                </td>
                <td width="16" valign="top" background="<%=path %>/Images/mail_right_bg.gif"><img src="<%=path %>/Images/nav_right_bg.gif" width="16" height="29" /></td>
            </tr>
            <!-- 中间部分开始 -->
            <tr>
                <!--第一行左边框-->
                <td valign="middle" background="<%=path %>/Images/mail_left_bg.gif">&nbsp;</td>
                <!--第一行中间内容-->
                <td valign="top" bgcolor="#F7F8F9">
                    <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                        <!-- 空白行-->
                        <tr><td colspan="2" valign="top">&nbsp;</td><td>&nbsp;</td><td valign="top">&nbsp;</td></tr>
                        <tr>
                            <td colspan="4">
                                <table>
                                    <tr>
                                        <td width="100" align="center"><img src="<%=path %>/Images/mime.gif" /></td>
                                        <td valign="bottom"><h3 style="letter-spacing:1px;">修改客户的基本信息！</h3></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 一条线 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 添加栏目开始 -->
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="96%">
                                <table width="100%">
                                    <tr>
                                        <td colspan="2">
                                            <form action="updatecustomer.do" method="post" onsubmit="return check()">
                                                <table width="100%" class="cont">
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td width="10%">客户名称：<input type="hidden" name="id"  value="${customer.id }"  readonly="readonly"/></td>
                                                        <td width="20%"><input checked="text" type="text" name="name" value="${customer.name }" readonly="readonly"/> </td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                  <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>地址：</td>
                                                        <td><input class="text" type="text" name="address" value="${customer.address }" /></td>
                                                        <td width="2%"><span id="address_msg" style="font-size:13px; color:red"></span></td>
                                                    </tr>
                                                      <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>等级：</td>
                                                        <td><input class="text" type="text" name="lev" value="${customer.lev }" /></td>
                                                        <td width="2%"><span id="lev_msg" style="font-size:13px; color:red"></span></td>
                                                    </tr>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>邮编：</td>
                                                        <td><input class="text" type="text" name="zip" value="${customer.zip }" /></td>
                                                        <td width="2%"><span id="zip_msg" style="font-size:13px; color:red"></span></td>
                                                    </tr>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>电话：</td>
                                                        <td><input class="text" type="text" name="tel" value="${customer.tel }" /></td>
                                                        <td width="2%"><span id="tel_msg" style="font-size:13px; color:red"></span>;</td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td colspan="3"><input class="btn" type="submit" value="提交" /></td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                </table>
                                            </form>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="2%">&nbsp;</td>
                        </tr>
                        <!-- 添加栏目结束 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="51%" class="left_txt">
                                 <img src="<%=path %>/Images/icon_mail.gif" width="16" height="11"> 作者邮箱：caojinlin563580@gmail.com<br />
                                <img src="<%=path %>/Images/icon_phone.gif" width="17" height="14"> 官方网站：<a href="http://h2design.taobao.com/" target="_blank">氢设计</a>
                            </td>
                            <td>&nbsp;</td><td>&nbsp;</td>
                        </tr>
                    </table>
                </td>
                <td background="<%=path %>/Images/mail_right_bg.gif">&nbsp;</td>
            </tr>
            <!-- 底部部分 -->
            <tr>
                <td valign="bottom" background="<%=path %>/Images/mail_left_bg.gif">
                    <img src="<%=path %>/Images/buttom_left.gif" width="17" height="17" />
                </td>
                <td background="<%=path %>/Images/buttom_bgs.gif">
                    <img src="<%=path %>/Images/buttom_bgs.gif" width="17" height="17">
                </td>
                <td valign="bottom" background="<%=path %>/Images/mail_right_bg.gif">
                    <img src="<%=path %>/Images/buttom_right.gif" width="16" height="17" />
                </td>           
            </tr>
        </table>
    </body>
</html>