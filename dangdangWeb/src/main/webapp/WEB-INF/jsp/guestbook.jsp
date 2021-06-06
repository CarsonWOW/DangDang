<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>当当网 - 首页</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/function.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-2.1.1.min.js"></script>
	<script type="text/javascript">
		function abc() {
			var duCommentName=$("#duCommentName").val();
			var duContent=$("#duContent").val();
			if (duCommentName=='' || duCommentName==null){
				return false;
			}else if (duContent=='' || duContent==null){
				return false;
			}else {
				return true;
			}

		}
	</script>
</head>
<body>
<!-- <div id="header" class="wrap">
	<div id="logo"><img src="images/logo.gif" /></div>
	<div class="help"><a href="#" class="shopping">购物车</a><a href="login.jsp">登录</a><a href="register.jsp">注册</a><a href="guestbook.jsp">留言</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li class="current"><a href="#">首页</a></li>
			<li><a href="#">图书</a></li>
			<li><a href="#">百货</a></li>
			<li><a href="#">品牌</a></li>
			<li><a href="#">促销</a></li>
		</ul>
	</div>
</div> -->
<jsp:include page="header.jsp"></jsp:include>
<!-- <div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
			<li class="first"><a href="#">音乐</a></li>
			<li><a href="#">影视</a></li>
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
			<li><a href="#">饰品</a></li>
			<li class="last"><a href="#">Investor Relations</a></li>
		</ul>
	</div>
</div> -->
<div id="position" class="wrap">
	您现在的位置：<a href="index.html">当当网</a> &gt; 在线留言
</div>
<div id="main" class="wrap">
	<div class="lefter">
		<!-- <div class="box">
			<h2>商品分类</h2>
			<dl>
				<dt>图书音像</dt>
				<dd><a href="product-list.jsp">图书</a></dd>
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
				<dd><a href="product-list.jsp">汽车用品</a></dd>
			</dl>
		</div> -->
		<jsp:include page="left.jsp"></jsp:include>
	</div>
	<div class="main">
		<div class="guestbook">
			<h2>全部留言</h2>
			<c:forEach var="u" items="${CList}">
			<ul>
				<li>
					<dl>
						<dt>${u.duContent}</dt>
						<dd class="author">网友：${u.duCommentName} <span class="timer">${u.duCreateTime}</span></dd>
						<dd>${u.duAnswerContent}</dd>
					</dl>
				</li>
				<%--<li>
					<dl>
						<dt>那个什么衣服贵吗</dt>
						<dd class="author">网友：张三丰 <span class="timer">2010:10:10 20:00:01</span></dd>
						<dd>不贵</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt>那个什么衣服贵吗</dt>
						<dd class="author">网友：张三丰 <span class="timer">2010:10:10 20:00:01</span></dd>
						<dd>不贵</dd>
					</dl>
				</li>--%>
			</ul>
			</c:forEach>
			<table>
				<tr>
					<td>
						当前第${pageInfo.pageNum} 页  总共${pageInfo.total}条数据  总共${pageInfo.pages}页
						<c:if test="${pageInfo.pageNum>1}">
							<a href="${pageContext.request.contextPath}/rest/Guest/guest?PageNow=1"> 首页</a>
							<a  href="${pageContext.request.contextPath}/rest/Guest/guest?PageNow=${pageInfo.pageNum-1}">上一页</a>
						</c:if>

						<c:if test="${pageInfo.pageNum<pageInfo.pages}">
							<a  href="${pageContext.request.contextPath}/rest/Guest/guest?PageNow=${pageInfo.pageNum+1}">下一页</a>
							<a href="${pageContext.request.contextPath}/rest/Guest/guest?PageNow=${pageInfo.pages}">末页</a>
						</c:if>
					</td>
				</tr>
			</table>
			<div id="reply-box">
				<form action="${pageContext.request.contextPath}/rest/Guest/addGuest" method="post" onsubmit="return abc()">
					<table>
						<tr>
							<td class="field">昵称：</td>
							<td><input class="text" type="text" id="duCommentName" name="duCommentName" /></td>
						</tr>
						<tr>
							<td class="field">留言内容：</td>
							<td><textarea name="duContent" id="duContent"></textarea></td>
						</tr>
						<tr>
							<td></td>
							<td><label class="ui-blue"><input type="submit" name="submit" value="提交留言" /></label></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">Copyright &copy; 2018 无涯 All Rights Reserved. 京ICP证1000001号</div>
</body>
</html>
