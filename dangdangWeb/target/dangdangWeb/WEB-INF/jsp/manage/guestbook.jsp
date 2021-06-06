<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 - 当当网</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/function-manage.js"></script>
</head>
<body>
<!-- <div id="header" class="wrap">
	<div id="logo"><img src="../images/logo.gif" /></div>
	<div class="help"><a href="../index.jsp">返回前台页面</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li><a href="index.jsp">首页</a></li>
			<li class="current"><a href="user.jsp">用户</a></li>
			<li><a href="product.jsp">商品</a></li>
			<li><a href="order.jsp">订单</a></li>
			<li><a href="guestbook.jsp">留言</a></li>
			<li><a href="news.jsp">新闻</a></li>
		</ul>
	</div>
</div> -->
<jsp:include page="header.jsp"></jsp:include>
<div id="position" class="wrap">
	您现在的位置：<a href="index.jsp">当当网</a> &gt; 管理后台
</div>
<div id="main" class="wrap">
	<!-- <div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
				<dd><em><a href="user-add.jsp">新增</a></em><a href="user.jsp">用户管理</a></dd>
				<dt>商品信息</dt>
				<dd><em><a href="productClass-add.jsp">新增</a></em><a href="productClass.jsp">分类管理</a></dd>
				<dd><em><a href="product-add.jsp">新增</a></em><a href="product.jsp">商品管理</a></dd>
				<dt>订单管理</dt>
				<dd><a href="order.jsp">订单管理</a></dd>
				<dt>留言管理</dt>
				<dd><a href="guestbook.jsp">留言管理</a></dd>
				<dt>新闻管理</dt>
				<dd><em><a href="news-add.jsp">新增</a></em><a href="news.jsp">新闻管理</a></dd>
			</dl>
		</div>
	</div> -->
	<jsp:include page="lefter.jsp"></jsp:include>
	<div class="main">
		<h2>留言管理</h2>
		<div class="manage">
			<table class="list">
				<tr>
					<th>ID</th>
					<th>网名</th>
					<th>留言内容</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
				<c:forEach var="u" items="${CList}">
				<tr>
					<td class="first w4 c">${u.duId}</td>
					<td class="w1 c">${u.duCommentName}</td>
					<td>${u.duContent}</td>
					<c:if test="${u.duAnswerContent!=null and u.duAnswerContent!='' }" var="flag">
						<td class="w1 c">已回复</td>
					</c:if>
					<c:if test="${!flag}">
						<td class="w1 c">未回复</td>
					</c:if>
					<td class="w1 c"><a href="${pageContext.request.contextPath}/rest/Guest/FindGuestById?duId=${u.duId}">回复</a> <a href="javascript:Delete(1);">删除</a></td>
				</tr>
				</c:forEach>
			</table>
			<table>
				<tr>
					<td>
						当前第${pageInfo.pageNum} 页  总共${pageInfo.total}条数据  总共${pageInfo.pages}页
						<c:if test="${pageInfo.pageNum>1}">
							<a href="${pageContext.request.contextPath}/rest/Guest/ManageGuest?PageNow=1"> 首页</a>
							<a  href="${pageContext.request.contextPath}/rest/Guest/ManageGuest?PageNow=${pageInfo.pageNum-1}">上一页</a>
						</c:if>

						<c:if test="${pageInfo.pageNum<pageInfo.pages}">
							<a  href="${pageContext.request.contextPath}/rest/Guest/ManageGuest?PageNow=${pageInfo.pageNum+1}">下一页</a>
							<a href="${pageContext.request.contextPath}/rest/Guest/ManageGuest?PageNow=${pageInfo.pages}">末页</a>
						</c:if>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2010  All Rights Reserved. 京ICP证1000001号</div>
</body>
</html>
