<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="com.ncist.edu.crm.pojo.UserInfo" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="./Style/skin.css" />
<script>
	function formSubmit() {
		document.getElementById("form1").submit();
	}
	function assign(){
		
	}
</script>
<style type="text/css">
	.sub{
 		background-color:transparent;  /* 背景色透明 */
 		border:0px;       /* 边框取消 */
		}
</style>
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<!-- 头部开始 -->
		<tr>
			<td width="17" valign="top"
				background="<%=path%>/Images/mail_left_bg.gif"><img
				src="./Images/left_top_right.gif" width="17" height="29" /></td>
			<td valign="top" background="./Images/content_bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0"
					cellspacing="0" background="././Images/content_bg.gif">
					<tr>
						<td height="31"><div class="title">项目指派</div></td>
					</tr>
				</table>
			</td>
			<td width="16" valign="top" background="./Images/mail_right_bg.gif"><img
				src="./Images/nav_right_bg.gif" width="16" height="29" /></td>
		</tr>
		<!-- 中间部分开始 -->
		<tr>
			<!--第一行左边框-->
			<td valign="middle" background="./Images/mail_left_bg.gif">&nbsp;</td>
			<!--第一行中间内容-->
			<td valign="top" bgcolor="#F7F8F9">
				<table width="100%" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<!-- 空白行-->
					<tr>
						<td colspan="2" valign="top">&nbsp;</td>
						<td>&nbsp;</td>
						<td valign="top">&nbsp;</td>
					</tr>
					<tr>
						<td colspan="4">
							<table>
								<tr>
									<td width="100" align="center"><img
										src="./Images/mime.gif" /></td>
									<td valign="bottom"><h3 style="letter-spacing: 1px;">进行任务指派</h3></td>
								</tr>
							</table>
						</td>
					</tr>
					<!-- 一条线 -->
					<tr>
						<td height="40" colspan="4">
							<table width="100%" height="1" border="0" cellpadding="0"
								cellspacing="0" bgcolor="#CCCCCC">
								<tr>
									<td></td>
								</tr>
							</table>
						</td>
					</tr>
					<!-- 产品列表开始 -->
					<tr>
						<td width="2%">&nbsp;</td>
						<td width="96%">
							<table width="100%">
								<tr>
									<td colspan="2">
										<form id="form1" action="assign.do" method="post">
											<table width="100%" class="cont tr_color">
												<tr>
													<th>机会来源</th>
													<th>客户名称</th>
													<th>项目名称</th>
													<th>成功几率</th>
													<th>概要</th>
													<th>联系人</th>
													<th>联系人电话</th>
													<th>描述</th>
													<th>创建时间</th>
													<th>创建人</th>
													<th>负责人</th>
													<th>指派时间</th>
													<th>状态</th>
												</tr>
												<c:forEach var="chance" items="${chances }">
													<tr align="center" class="d">
														<td>
														<input type="hidden" name="chanceid" value="${chance.id }"/>
														${chance.source }</td>
														<td>${chance.title }</td>
														<td>${chance.pname }</td>
														<td>${chance.rate }</td>
														<td>${chance.resume }</td>
														<td>${chance.linkman }</td>
														<td>${chance.tel }</td>
														<td>${chance.des }</td>
														<td><fmt:formatDate value="${chance.createtime }"
																type="date" dateStyle="long" /></td>
														<td>${chance.createname }</td>
														<td>${chance.duename }</td>
														<td>${chance.duetime }</td>
														<td><c:if test="${chance.status==0 }">未开发</c:if> <c:if
																test="${chance.status==1 }">开发中</c:if> <c:if
																test="${chance.status==2 }">开发成功</c:if> <c:if
																test="${chance.status==3 }">开发失败</c:if></td>
													</tr>
												</c:forEach>
											</table>

											<table>
												<tr>
													<td height="40" colspan="4">
														<table width="100%" height="1" border="0" cellpadding="0"
															cellspacing="0" bgcolor="#CCCCCC">
															<tr>
																<td></td>
															</tr>
														</table>
													</td>
												</tr>
												<tr>
													<td  align="center">
														<p>指派任务</p>
													</td>
													<td width="10"></td>
													<td>
														<select name="duename">
															
															<c:forEach items="${userinfos }" var="userinfo">
																${userinfo['root'] }
																<option value="${userinfo['name'] }">${userinfo['name'] }</option>
															</c:forEach>
														</select>
													</td>
													<td width="10"></td>
													<td background="<%=path%>/Images/menu-button.gif"
														width="60px" height="20" align="center"><input class="sub" type="submit" value="指派" /></td>
												</tr>
											</table>
										</form>
									</td>
								</tr>
							</table>
						</td>
						<td width="2%">&nbsp;</td>
					</tr>
					<!-- 产品列表结束 -->
					<tr>
						<td height="40" colspan="4">
							<table width="100%" height="1" border="0" cellpadding="0"
								cellspacing="0" bgcolor="#CCCCCC">
								<tr>
									<td></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td width="2%">&nbsp;</td>
						<td width="51%" class="left_txt"><img
							src="<%=path%>/Images/icon_mail.gif" width="16" height="11">
								客户服务邮箱：rainman@foxmail.com<br /> <img
								src="<%=path%>/Images/icon_phone.gif" width="17" height="14">
									官方网站：<a href="http://h2design.taobao.com/" target="_blank">氢设计</a></td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>
			</td>
			<td background="<%=path%>/Images/mail_right_bg.gif">&nbsp;</td>
		</tr>
		<!-- 底部部分 -->
		<tr>
			<td valign="bottom" background="./Images/mail_left_bg.gif"><img
				src="<%=path%>/Images/buttom_left.gif" width="17" height="17" /></td>
			<td background="<%=path%>/Images/buttom_bgs.gif"><img
				src="<%=path%>/Images/buttom_bgs.gif" width="17" height="17"></td>
			<td valign="bottom" background="<%=path%>/Images/mail_right_bg.gif">
				<img src="<%=path%>/Images/buttom_right.gif" width="16" height="17" />
			</td>
		</tr>
	</table>
</body>
</html>