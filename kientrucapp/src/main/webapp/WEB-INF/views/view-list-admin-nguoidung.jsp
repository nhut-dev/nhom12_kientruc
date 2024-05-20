<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View-List-NguoiDung</title>
</head>
<body>
	<a href="../taikhoan/logout">logout</a>
	<input type="button" onclick="window.location.href='form-add-nguoidung';return false" value="Thêm người dùng">
	<table border = 1 padding = 2>
		<tr>
			<td>Mã người dùng</td>
			<td>Tên người dùng</td>
			<td>Số điện thoại</td>
			<td>Địa chỉ</td>
			<td>Actions</td>
		</tr>
		<c:forEach var="ng" items="${nguoiDung}">
		<c:url var="deleteLink" value="/nguoidung/delete-nguoidung">
			<c:param name="maNguoiDung" value="${ng.maNguoiDung}"></c:param>
		</c:url>
		<c:url var="updateLink" value="/nguoidung/form-update-nguoidung">
			<c:param name="maNguoiDung" value="${ng.maNguoiDung}"></c:param>
		</c:url>
			<tr>
				<td>${ng.maNguoiDung }</td>
				<td>${ng.tenNguoiDung }</td>
				<td>${ng.sdt}</td>
				<td>${ng.diaChi}</td>
				<td>
					<a href="${deleteLink }" onclick="if(!(confirm('Bạn có muốn xóa người dùng này không?'))) return false">Xóa</a>
					<a href="${updateLink }">Cập nhật</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="../app/view-list-admin">Trở về</a>
</body>
</html>