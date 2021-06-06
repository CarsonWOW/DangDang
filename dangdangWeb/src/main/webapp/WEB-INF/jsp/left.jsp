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
<div class="box">
	<h2>商品分类</h2>
	<dl>
		<c:forEach var="u" items="${Category}">
			<c:if test="${u.dpcParentId==0}" var="flag">
				<dt>${u.dpcName}</dt>
			</c:if>
			<c:if test="${!flag}">
				<dd><a href="${pageContext.request.contextPath}/rest/Product/ProductList?dpcChildId=${u.dpcId}">${u.dpcName}</a></dd>
			</c:if>
		</c:forEach>
		<%--<dd><a href="product-list.jsp">图书</a></dd>
		<dd><a href="product-list.jsp">音乐</a></dd>
		<dt>百货</dt>
		<dd><a href="product-list.jsp">运动健康</a></dd>
		<dd><a href="product-list.jsp">服装</a></dd>
		<dd><a href="product-list.jsp">家居</a></dd>
		<dd><a href="product-list.jsp">美妆</a></dd>
		<dd><a href="product-list.jsp">母婴</a></dd>
		<dd><a href="product-list.jsp">食品</a></dd>
		<dd><a href="product-list.jsp">手机数码</a></dd>
		<dd><a href="product-list.jsp">家具首饰</a></dd>
		<dd><a href="product-list.jsp">手表饰品</a></dd>
		<dd><a href="product-list.jsp">鞋包</a></dd>
		<dd><a href="product-list.jsp">家电</a></dd>
		<dd><a href="product-list.jsp">电脑办公</a></dd>
		<dd><a href="product-list.jsp">玩具文具</a></dd>
		<dd><a href="product-list.jsp">汽车用品</a></dd>--%>
	</dl>
</div>
</body>
</html>