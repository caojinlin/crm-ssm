`<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="<%=path%>/Style/skin.css" />
<script src="<%=path%>/components/jquery-ui/jquery-1.2.6.js"
	type="text/javascript"></script>
<script src="<%=path%>/Js/query.js" type="text/javascript"></script>
<script src="<%=path%>/Js/paging.js" type="text/javascript"></script>
<script>
		function formSubmit()
		{
			document.getElementById("form1").submit();
		}
		function assignchance(){
			var chanceid = "";
			var i=0;
			var cid="";
			$(".chanceid").each(function(){
				if($(this).is(':checked')){
					i=i+1;
					chanceid = ";"+chanceid+$(this).val();
					cid=$(this).val();
				}
			})
			if(i==1){
				var duename = $("#"+cid).text();
				if(duename==null||duename==""){
					window.location.href="assignchance.do?chanceid="+chanceid;
				}else{
					alert('该项目已有负责人');
				}
			}else if(i>1){
				alert('只能选择一条记录');
			}else if(i==0){
				alert('请选择一条记录');
			}
		};
		function updatechance(){
			var chanceid = ""
			var i= 0 ;
			$(".chanceid").each(function(){
				if($(this).is(':checked')){
					i=i+1;
					chanceid = ";"+chanceid+$(this).val();
				}
			})
			if(i==1){
				window.location.href="toupdatechance.do?chanceid="+chanceid;
			}else if(i>1){
				alert('只能选择一条记录');
			}else if(i==0){
				alert('请选择一条记录');
			}
		};
		function jumpTo(maxPage){
		    var page = $("#jumpTo").val();
		    if(page > maxPage || page < 1){
		        alert("对不起，无法到达该页")
		    }else{
		        $('body').load('chance.do?page=' + page);
		    }
		}
	</script>
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<!-- 头部开始 -->
		<tr>
			<td width="17" valign="top" background="./Images/mail_left_bg.gif">
				<img src="./Images/left_top_right.gif" width="17" height="29" />
			</td>
			<td valign="top" background="./Images/content_bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0"
					cellspacing="0" background="././Images/content_bg.gif">
					<tr>
						<td height="31"><div class="title">项目管理</div></td>
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
									<td width="50"></td>
									<td background="<%=path%>/Images/menu-button.gif" width="60px"
										height="30" align="center"><a href="toaddchance.do">添加</a></td>
									<td background="<%=path%>/Images/menu-button.gif" width="60px"
										height="30" align="center"><a href="#"
										onclick="updatechance()">修改</a></td>
									<td background="<%=path%>/Images/menu-button.gif" width="60px"
										height="30" align="center"><a href="#"
										onclick="formSubmit()">删除</a></td>
									<td background="<%=path%>/Images/menu-button.gif" width="60px"
										height="30" align="center"><a href="#"
										onclick="assignchance()">指派</a></td>
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
										<form id="form1" action="delchance.do" method="post">
											<table width="100%" class="cont tr_color">
												<tr>
													<th>选中</th>
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
												<c:forEach var="chance" items="${page.list }">
													<tr align="center" class="d">
														<td><input type="checkbox" name="chanceid"
															class="chanceid" value="${chance.id }"
															 /></td>
														<td>${chance.source }</td>
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
														<td id="${chance.id }">${chance.duename }</td>
														<td><fmt:formatDate value="${chance.duetime }"
																type="date" dateStyle="long" /></td>
														<td><c:if test="${chance.status==0 }">未开发</c:if> <c:if
																test="${chance.status==1 }">开发中</c:if> <c:if
																test="${chance.status==2 }">开发成功</c:if> <c:if
																test="${chance.status==3 }">开发失败</c:if></td>
													</tr>
												</c:forEach>

											</table>
										</form>
									</td>
								</tr>
								<tr>
									<td width="40%">&nbsp;</td>
									<td>
										<!-- 上一页 按钮 -->
										<div id="pageControl">
											<c:choose>
												<c:when test="${page.pageNum != 1}">
													<a href="chance.do?page=${page.pageNum-1}"><input
														type="button" name="lastPage" value="上一页" /></a>
												</c:when>
												<c:otherwise>
													<input type="button" disabled="true" name="lastPage"
														value="上一页" />
													<!-- 为了要那个灰掉的button -->
												</c:otherwise>
											</c:choose>

											<!-- 页数列表 -->
											<c:forEach begin="1" end="${page.pages }" step="1" varStatus="item">
												<c:choose>
													<c:when test="${item.count == page.pageNum}">
														<a href="chance.do?page=${item.count}"
															class="currentPage">${item.count}</a>
													</c:when>
													<c:otherwise>
														<a href="chance.do?page=${item.count}">${item.count}</a>
													</c:otherwise>
												</c:choose>
											</c:forEach>

											<!-- 下一页 按钮 -->
											<c:choose>
												<c:when test="${page.pageNum !=page.pages}">
													<a href="chance.do?page=${page.pageNum+1}"> <input
														type="button" name="nextPage" value="下一页" />
													</a>
												</c:when>
												<c:otherwise>
													<input type="button" disabled=true name="nextPage"
														value="下一页" />
													<!-- 为了要那个灰掉的button -->
												</c:otherwise>
											</c:choose>

											<!-- 直接跳转 -->
											共${page.pages}页 -向<input type="text" id="jumpTo" />页 <input
												type="button" value="跳转" onclick="jumpTo(${page.pages})" />
										</div>
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