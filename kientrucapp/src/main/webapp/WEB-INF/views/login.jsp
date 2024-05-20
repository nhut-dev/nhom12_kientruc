<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="check-login" method="post">
		<table padding = 2>
			<tr>
				<td>Tên đăng nhập</td>
				<td>
					<form:input path="tenNguoiDung"/>
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
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>