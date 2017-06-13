<%@ page language="Java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=path %>/Style/skin.css" />
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
                        <tr><td height="31"><div class="title">添加人员</div></td></tr>
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
                                        <td valign="bottom"><h3 style="letter-spacing:1px;">添加人员的基本信息！</h3></td>
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
                                            <form action="updateuser.do" method="post">
                                                <table width="100%" class="cont">
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td width="10%">账号：<input type="hidden" name="id" value="${user.id }"/></td>
                                                        <td width="20%"><input class="text" type="text" name="account" value="${user.account }" /></td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>用户名：</td>
                                                        <td><input class="text" type="text" name="name" value="${user.name} " /></td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                      <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>密码：</td>
                                                        <td><input class="text" type="password" name="pwd" value="${user.pwd }" /></td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>确认密码：</td>
                                                        <td><input class="text" type="password" name="pwd2" value="${user.pwd }" /></td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>级别：</td>
                                                        <td>
                                                        	<select name="root">
                                                        		<c:if test="${user.root==0 }">
                                                        		<option value="0" selected="selected">管理员</option>
                                                        		<option value="1">高管</option>
                                                        		<option value="2">产品经理</option>
                                                        		<option value="3">开发人员</option>
                                                        		</c:if>
                                                        		<c:if test="${user.root==1 }">
                                                        			<option value="0" >管理员</option>
	                                                        		<option value="1" selected="selected">高管</option>
	                                                        		<option value="2">产品经理</option>
	                                                        		<option value="3">开发人员</option>
                                                        		</c:if>
                                                        		<c:if test="${user.root==2 }">
                                                        			<option value="0" >管理员</option>
	                                                        		<option value="1" >高管</option>
	                                                        		<option value="2" selected="selected">产品经理</option>
	                                                        		<option value="3">开发人员</option>
                                                        		</c:if>
                                                        		<c:if test="${user.root==3 }">
                                                        			<option value="0" >管理员</option>
	                                                        		<option value="1" >高管</option>
	                                                        		<option value="2" >产品经理</option>
	                                                        		<option value="3" selected="selected">开发人员</option>
                                                        		</c:if>
                                                        		
                                                        		
                                                        	</select>
                                                        </td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                   <tr>
                                                   		<td width="2%">&nbsp;</td>
                                                   		<td>
                                                   			<input type="submit" value="提交"/>
                                                   		</td>
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