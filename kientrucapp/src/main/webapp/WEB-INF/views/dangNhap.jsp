<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
<div>
<h3>Đăng nhập</h3>
	<form:form action="check-dangnhap" method="post">
		<table padding = 2>
			<tr>
				<td>Tên đăng nhập</td>
				<td>
					<form:input path="tenTaiKhoan"/>
				</td>
			</tr>
			<tr>
				<td>Mật khẩu</td>
				<td>
					<form:password path="matKhau"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Đăng nhập">
					<td><a href="dangKy"><input type="button" value="Đăng ký"></a></td>
				</td>
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>