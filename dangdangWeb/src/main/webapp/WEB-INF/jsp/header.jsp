<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-2.1.1.min.js"></script>
	<script type="text/javascript">
		function clean() {
			if(confirm("确定要退出吗？")) {
				location.href = "${pageContext.request.contextPath}/rest/Clean";
			}
		}
	</script>
</head>
<body>

<div id="header" class="wrap">
	<div id="logo"><img src="${pageContext.request.contextPath}/images/logo.gif" /></div>
	<div class="help"><a href="${pageContext.request.contextPath}/rest/Car/CarAdd" class="shopping">购物车</a>
		<c:if test="${User==null}" var="flag">
			<a href="${pageContext.request.contextPath}/rest/UserLogin">登录</a><a href="${pageContext.request.contextPath}/rest/GoRegister">注册</a>
		</c:if>
		<c:if test="${!flag}">
			<c:if test="${User.duStatus==1}" var="ccc">
				欢迎用户${User.duUserName}登录本网站
				<a  onclick="clean()">退出</a>
			</c:if>
			<c:if test="${!ccc}">
				欢迎管理员${User.duUserName}登录本网站
				<a  onclick="clean()">退出</a>
				<a href="${pageContext.request.contextPath}/rest/goManage">返回后台</a>
			</c:if>
		</c:if>
		<a href="${pageContext.request.contextPath}/rest/Guest/guest">留言</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li class="current"><a href="#">首页</a></li>
			<c:forEach var="li" items="${Category}">
			<c:if test="${li.dpcParentId==0}" var="ParentId">
				<%--点击商品父类,查询该分类的所有信息--%>
				<li><a href="${pageContext.request.contextPath}/rest/Product/QueryAll?dpcParentId=${li.dpcId}">${li.dpcName}</a></li>
			</c:if>
			</c:forEach>
		</ul>
	</div>
</div>


<div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
			<c:forEach var="u" items="${Category}">
				<c:if test="${u.dpcParentId!=0}">
					<li><a href="${pageContext.request.contextPath}/rest/Product/QueryAll?dpcChildId=${u.dpcId}">${u.dpcName}</a></li>
				</c:if>
			</c:forEach>
			<%--<li class="first"><a href="#">音乐</a></li>
			<li><a href="#">影视1</a></li>
			<li><a href="#">少儿</a></li>
			<li><a href="#">动漫</a></li>
			<li><a href="#">小说</a></li>
			<li><a href="#">外语</a></li>
			<li><a href="#">数码相机</a></li>
			<li><a href="#">笔记本</a></li>
			<li><a href="#">羽绒服</a></li>
			<li><a href="#">秋冬靴</a></li>
			<li><a href="#">运动鞋</a></li>
			<li><a href="#">美容护肤</a></li>
			<li><a href="#">家纺用品</a></li>
			<li><a href="#">婴幼奶粉</a></li>
			<li><a href="#">饰品</a></li>--%>
			<li class="last"><a href="#">Investor Relations</a></li>
		</ul>
	</div>
</div>
</body>
</html>