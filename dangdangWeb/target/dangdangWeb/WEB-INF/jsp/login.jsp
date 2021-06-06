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
		function changeVerifyCode() {
		    var time=new Date().getTime();
		    document.getElementById("kaptchaImage").src="${pageContext.request.contextPath}/rest/user/check_code?d="+time;//为了不让验证码缓存，为了安全起见，需要次次都刷新
		}
		
		function checkForm(){
			//每次提交表单,就调用检验验证码
			var flag=CheckCode();
			return flag;
		}
		//验证码检验
		var flag1=false;
		function CheckCode() {
			var veryCode=document.getElementById("veryCode").value;
			$.ajax({
				type:"POST",
				url:"${pageContext.request.contextPath}/rest/user/code",
				data:"veryCode="+veryCode,
				success:function(msg) {
					/*alert("DataSaved:" + msg);*/
					if (msg=="Right"){
						flag1=true;
					}else {
						alert("验证码错误!");
						flag1=false;
					}
				}
			});
			return flag1;
		}

</script>
</head>
<body onload="changeVerifyCode()">
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
<div id="register" class="wrap">
	<div class="shadow">
		<em class="corner lb"></em>
		<em class="corner rt"></em>
		<div class="box">
			<h1>欢迎回到当当网</h1>
			<form id="loginForm" method="post" action="${pageContext.request.contextPath}/rest/user/login" onsubmit="return checkForm(this)">
				<table>
					<tr>
						<td class="field">邮箱：</td>
						<td><input class="text" type="text" id="duEmail" name="duEmail" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
					</tr>
					<tr>
						<td class="field">登录密码：</td>
						<td><input class="text" type="password" id="duPassword" name="duPassword" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
					</tr>
					<tr>
						<td class="field">验证码：</td>
						<td><input class="text verycode" type="text" id="veryCode" name="veryCode" onfocus="FocusItem(this)" onblur="CheckCode();" /><img id="kaptchaImage" src="/kaptcha.jpg" onclick="changeVerifyCode()"/><span></span></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-green"><input type="submit" name="submit" value="立即登录" /></label></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">Copyright &copy; 2018 无涯 All Rights Reserved. 京ICP证1000001号</div>
</body>
</html>
