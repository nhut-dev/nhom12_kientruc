<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form-Add-NguoiDung</title>
</head>
<body>
	<form:form action="form-add-sumit-nguoidung" method="post">
		<table padding=2>
			<tr>
				<td>Tên người dùng</td>
				<td><form:input path="tenNguoiDung" /></td>
			</tr>
			<tr>
				<td>Số điện thoại</td>
				<td><form:input path="sdt" /></td>
			</tr>
			<tr>
				<td>Địa chỉ</td>
				<td><form:input path="diaChi" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Thêm"></td>
			</tr>
		</table>
	</form:form>
	<a href="../nguoidung/view-list-admin-nguoidung">Quay lại</a>
</body>
</html>