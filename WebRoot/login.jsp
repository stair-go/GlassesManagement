<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<script type="text/javascript" src="js/jquery-2.1.3.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>

</head>


<body>

	<div class="container">
		<div class="row" style="margin-top:130px;">
			<div class="col-md-4 col-md-offset-4">
				<form action="admin_logintwo.action" method="post" class="form-signin">
					<a style="font: 18px" href="${pageContext.request.contextPath}/index.jsp">返回登录</a>
					<h2 class="form-signin-heading">注册</h2>
					<%
						if(request.getAttribute("msg")!=null){
						out.println(request.getAttribute("msg"));
					}
					%>
					<label class="sr-only">用户名：</label> <input type="text"
						name="username"  id="inputEmail" class="form-control"
						placeholder="请输入用户名" required autofocus> 
						
						<label
						class="sr-only">密码：</label> <input type="password"
						name="password"  id="inputPassword"
						class="form-control" placeholder="请输入密码" required>
						
						<label
						class="sr-only"> 密令：</label> <input type="text"
						name="mimi"  
						class="form-control" placeholder="请输入密令" >
						
					<button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>