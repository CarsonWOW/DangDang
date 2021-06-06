<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/26
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="spacer"></div>
<div class="news-list">
    <h4>新闻动态</h4>
    <ul>
        <c:forEach var="u" items="${NewsList}">
            <li><a href="${pageContext.request.contextPath}/rest/News/QueryNewsById?dnId=${u.dnId}" target="_blank">${u.dnTitle}</a></li>
        </c:forEach>
    </ul>
</div>
</div>
</body>
</html>
