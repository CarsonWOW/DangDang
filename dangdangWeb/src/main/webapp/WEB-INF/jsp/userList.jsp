<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


	<script type="text/javascript">
		//全选 返选
		function checkId(){
			//获取name 为ids的集合
			var ids = document.getElementsByName("ids");
			//循环遍历
			for(var i in ids){
				//获取循环出来的每一个input标签 
				var id = ids[i];
				if(id.checked){//如果被选择  true
					id.checked=false;
				}else{
					id.checked=true;
				}
			}
			
		}
		
		
		function getCheckId(){
			var flag=false;
			//获取name 为ids的集合
			var ids = document.getElementsByName("ids");
			//循环遍历
			for(var i in ids){
				//获取循环出来的每一个input标签 
				var id = ids[i];
				if(id.checked){//如果被选择  true
					flag=true;
					return flag;
				}
			}
			return flag;
		}
		function deleteUser(){
		
			var flag = getCheckId();
			var from1 = document.getElementById("from1");
			if(flag){
				from1.action="${pageContext.request.contextPath }/rest/user/deleteUser";
				alert("删除成功");
			}else{
				alert("请至少选择一行");
				return false;
			}
			from1.submit();
		}
	
	</script>

  </head>
  
  <body>
   <form action="" id="from1" method="get">
   	<table border="1" cellpadding="0" cellspacing="0" width="80%">
   			<tr>
   				<td>
   					<input type="button" value="批量删除" onclick="deleteUser();">
   				
   				</td>
   			
   			</tr>
   		 	<tr>
   		 		<td>
   		 			<input type="button" value="选择" onclick="checkId();">
   		 		</td>
   		 		<td>tid</td>
   		 		<td>uname</td>
   		 		<td>birthday</td>
   		 		<td>sex</td>
   		 		<td>操作</td>
   		 	</tr>
   		 	
   		 	<c:forEach var="li" items="${list }">
   		 		<tr>
	   		 		<td>
	   		 			<input type="checkbox" name="ids" value="${li.tid }">
	   		 		</td> 
	   		 		<td>${li.tid }</td>
	   		 		<td>${li.uname }</td>
	   		 		<td>${li.birthday }</td>
	   		 		<td>${li.sex }</td>
	   		 		<td>操作</td>
	   		 	</tr>
   		 	</c:forEach>
   			
   	</table>
  	<table>
  		<tr>
  			<td>共&nbsp;${info.totalCount }&nbsp;条数据  &nbsp; 共&nbsp${info.totalPageCount }&nbsp
   				当前第&nbsp${info.currPageNo }&nbsp  页
   				
   				<a href="${pageContext.request.contextPath }/rest/user/queryUser?currPageNo=1">首页</a>
   				<c:if test="${info.currPageNo>1 }">
   					<a  href="${pageContext.request.contextPath }/rest/user/queryUser?currPageNo=${info.currPageNo-1 }">上一页</a>
   				</c:if>
   				
   				<c:if test="${info.currPageNo<info.totalPageCount }">
   					<a  href="${pageContext.request.contextPath }/rest/user/queryUser?currPageNo=${info.currPageNo+1 }">下一页</a>
   				</c:if>
   				
   				<a href="${pageContext.request.contextPath }/rest/user/queryUser?currPageNo=${info.totalPageCount }">尾页</a>
   			</td>
   				
   			
   			</tr>
  	</table>
   
   </form>
  </body>
</html>
