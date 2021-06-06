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
	<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.3.1.js"></script>

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
	您现在的位置：<a href="index.jsp">当当网</a> &gt; 购物车
</div>
<div class="wrap">
	<div id="shopping">
		<form action="${pageContext.request.contextPath}/rest/Order/order" method="post">
			<table>
				<tr>
					<th>商品名称</th>
					<th>商品价格</th>
					<th>购买数量</th>
					<th>操作</th>
				</tr>
				<c:forEach var="u" items="${car.list}">
				<tr id="product_id_1">
					<td class="thumb"><img width="50px" height="50px" src="${pageContext.request.contextPath }/images/product/${u.product.dpFileName}" /><a href="product-view.jsp">${u.product.dpName}</a></td>
					<td class="price" id="price_id_1">
						<span>￥${u.product.dpPrice*u.num}</span>
						<input type="hidden" value="99" />
					</td>
					<td class="number">
						<dl>
							<dt>
							<c:if test="${u.num==1}" var="flag">
								<%--如果数量为1,那么就不能点击---%>
								<input  type="button"  value="-" readonly="readonly" />
							</c:if>
							<c:if test="${!flag}">
								<%--如果数量不为一,则触发点击事件,根据产品id点击数量就减一,--%>
								<input  type="button"  value="-" onclick="updateNum(${u.product.dpId},${u.num-1});" />
							</c:if>
							<input id="number_id_1" type="text" name="number" value="${u.num}"  onblur="updateNum(${u.product.dpId},this.value);" />
							<input  type="button"  value="+"  onclick="updateNum(${u.product.dpId},${u.num+1});"/>
							<%--<dd onclick="reloadPrice(1,true);">修改</dd>--%>
							</dt>
						</dl>
					</td>
					<td class="delete"><a href="javascript:delShopping(1);">删除</a></td>
				</tr>
				</c:forEach>
			</table>
			总价格为:${car.account }
			<div class="button"><input type="submit" value="" /></div>
		</form>
	</div>
	<script type="text/javascript">
		document.write("Cookie中记录的购物车商品ID："+ getCookie("product") + "，可以在动态页面中进行读取");
		function updateNum(dpId,num){
			//alert(dpId);
			$.ajax({
				type: "POST",
				url: "${pageContext.request.contextPath}/rest/Car/update",
				data: "dpId="+dpId+"&num="+num,
				success: function(msg){
					//alert(msg);
					//刷新页面
					window.location.reload(true);
				}
			});
		}
	</script>
</div>
<div id="footer">Copyright &copy; 2018 无涯 All Rights Reserved. 京ICP证1000001号</div>
</body>
</html>
