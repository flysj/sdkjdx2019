<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息展示</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<link
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js">
	
</script>
</head>
<body>
	<div class="list_content">
		<div class="container">
			<!-- 标题 -->
			<div class="row">
				<div class="col-md-6">
					<h1>权限更改</h1>
				</div>
			</div>
			<!-- 按钮 -->
			<div>
				<div class="col-md-2 col-md-offset-7">
					<button type="button" class="btn btn-success" id="p-add"
						style="width: 100px; position:absolute ; left: 205px; top: -35px">新增</button>
				</div>
			</div>
			<div class="row">
				<div class="col-md-11">
					<table class="table .table-hover">
						<tr>
							<th>ID</th>
							<th>用户名</th>
							<th>权限</th>
							<th>邮箱</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${lists}" var="user">
							<tr>
								<td>${user.getUserid()}</td>
								<td>${user.getUsername()}</td>
								<td>${user.getPassword()}</td>
								<td>${user.getEmail()}</td>
								<td>
									<form action="#" class="col-md-5" id="formDemo"
										style="position: relative; left: -15px">
										
										<input type="hidden" name="userid" value="${user.getUserid()}">
										<input type="hidden" name="username" value="${user.getUsername()}">
										<input type="hidden" name="password" value="${user.getPassword()}">
										<input type="hidden" name="email" value="${user.getEmail()}">
										<input type="submit" value="编辑" class="btn btn-primary btn-sm"></input>
									</form>

									<form action="${APP_PATH }/deleteUser/${user.getUserid() }">
										<input type="submit" value="删除" class="btn btn-danger btn-sm"
											onclick="return deleteUser();"></input>
									</form>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
		<a ></a>
	</div>
</body>

<script type="text/javascript">

	function deleteUser() {
		if (confirm("确认删除吗？")) {
			return true;
		}
		return false;
	}
	
	
</script>

<!--------------------- 新增用户--------------------->
<jsp:include page="/add.jsp"></jsp:include>
<script type="text/javascript" src="${APP_PATH }/static/js/show.js"></script>
<!--------------------- 新增用户-end --------------------->

<!--------------------- 修改用户--------------------->
<jsp:include page="/update.jsp"></jsp:include>
<script type="text/javascript" src="${APP_PATH }/static/js/show.js"></script>
<!--------------------- 修改用户-end --------------------->
</html>