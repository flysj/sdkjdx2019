<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-3.2.1.js"></script>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js">
	
</script>
</head>
<body>
	<div class="update"
		style="display: none; position:absolute; left: 500px; top: 210px; width: 480px;">
		<div class="container"
			style="background-color: #ffffff; width: 500px; border-radius: 8px; border-style: solid; border-width: 1px; border-color: #009393">

			<!-- 标题 -->
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<h3>修改用户</h3>
					<a href="#" class="update-guanbi"> <img
						src="${APP_PATH }/static/img/popup_guanbi.png"
						style="position: relative; left: 280px; top: -50px;">
					</a>
				</div>
			</div>

			<div class="row" style="width: 480px; height: 300px;">
				<form action="${APP_PATH }/updateUser" class="form-horizontal">
					<input type="hidden" name="userid" value="${param.userid}">
					<input type="hidden" name="username" value="${param.username}">
					<div class="form-group" style="position: relative; top: 30px">
						<label for="inputPassword3" class="col-sm-2 control-label">用户名</label>
						<div class="col-sm-10">
							<p class="form-control-static">${param.username}</p>
						</div>
					</div>
					<div class="form-group" style="position: relative; top: 55px">
						<label for="inputPassword3" class="col-sm-2 control-label">权限</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputPassword3"
								placeholder="role" name="password" value="${param.password}">
						</div>
					</div>
					<div class="form-group" style="position: relative; top: 80px">
						<label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="inputEmail3"
								placeholder="Email" name="email" value="${param.email}">
						</div>
					</div>
					<div style="position: relative; top: 100px">
						<button type="reset" class="btn btn-default"
							style="position: relative; left: 40px">清空</button>
						<button type="submit" class="btn btn-info"
							style="position: relative; left: 350px">修改</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">
	$(document).ready(function() {
		/* 当请求的参数中带有userid时显示“编辑模态框”，否则隐藏 */
		if(${param.userid}){
			$(".update").show();
			$(".add").hide();
		}

	});
</script>

</html>