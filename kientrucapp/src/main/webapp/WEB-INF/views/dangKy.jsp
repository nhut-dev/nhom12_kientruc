<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký</title>
<script type="text/javascript">
	function redirectToLogin() {
		window.location.href = 'login.jsp';
	}
</script>
</head>
<body>
	<div>
		<h3>Đăng ký</h3>
		<form:form action="submit-dangky" method="post">
			<table padding=2>
				<tr>
					<td>Tên người dùng</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Tài khoản</td>
					<td><form:input path="tenTaiKhoan" /></td>
				</tr>
				<tr>
					<td>Mật khẩu</td>
					<td><form:password path="matKhau" /></td>
				</tr>
				<tr>
					<td><a href="dangNhap"><input type="button" value="Đăng nhập"></a></td>
					<td><input type="submit" value="Đăng ký"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>