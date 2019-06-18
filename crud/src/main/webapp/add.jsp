<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增用户</title>
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
	<div class="add"
		style="display: none; position:absolute; left: 500px; top: 200px; width: 480px;">
		<div class="container"
			style="background-color: #ffffff; width: 500px; border-radius: 8px; border-style: solid; border-width: 1px; border-color: #009393">

			<!-- 标题 -->
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<h3>新增用户</h3>
					<a href="#" class="add-guanbi"> <img
						src="${APP_PATH }/static/img/popup_guanbi.png"
						style="position: relative; left: 280px; top: -50px;">
					</a>
				</div>
			</div>

			<div class="row" style="width: 480px; height: 300px;">
				<form action="${APP_PATH }/addUser" class="form-horizontal"
					method="post">
					<div class="form-group" style="position: relative; top: 30px">
						<label for="inputPassword3" class="col-sm-2 control-label">用户名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputPassword3"
								name="username" placeholder="Username" required="required">
						</div>
					</div>
					<div class="form-group" style="position: relative; top: 55px">
						<label for="inputPassword3" class="col-sm-2 control-label">权限</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="inputPassword3"
								name="password" placeholder="role" required="required">
						</div>
					</div>
					<div class="form-group" style="position: relative; top: 80px">
						<label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="inputEmail3"
								name="email" placeholder="Email" required="required">
						</div>
					</div>
					<div style="position: relative; top: 100px">
						<button type="reset" class="btn btn-default"
							style="position: relative; left: 40px">清空</button>
						<button type="submit" class="btn btn-info"
							style="position: relative; left: 350px">新增</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>