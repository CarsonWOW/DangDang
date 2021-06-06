<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
				<dd><em><a href="${pageContext.request.contextPath}/rest/AddUser">新增</a></em><a href="${pageContext.request.contextPath}/rest/user/UserList">用户管理</a></dd>
				<dt>商品信息</dt>
				<dd><em><a href="${pageContext.request.contextPath}/rest/AddCategory">新增</a></em><a href="${pageContext.request.contextPath}/rest/Category/productClass">分类管理</a></dd>
				<dd><em><a href="${pageContext.request.contextPath}/rest/addProduct">新增</a></em><a href="${pageContext.request.contextPath}/rest/Product/queryAllManage">商品管理</a></dd>
				<dt>订单管理</dt>
				<dd><a href="${pageContext.request.contextPath}/rest/Order">订单管理</a></dd>
				<dt>留言管理</dt>
				<dd><a href="${pageContext.request.contextPath}/rest/Guest/ManageGuest">留言管理</a></dd>
				<dt>新闻管理</dt>
				<dd><em><a href="${pageContext.request.contextPath}/rest/News/addNews">新增</a></em><a href="${pageContext.request.contextPath}/rest/News/news">新闻管理</a></dd>
			</dl>
		</div>
	</div>
</body>
</html>