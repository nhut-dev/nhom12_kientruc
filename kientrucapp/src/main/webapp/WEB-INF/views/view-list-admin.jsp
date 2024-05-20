<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách</title>
</head>
<body>
	<a href="../nguoidung/view-list-admin-nguoidung">Thêm người dùng</a>
	<table border=1 padding=2>
		<tr>
			<td>Mã phiếu nhập</td>
			<td>Tên thiết bị</td>
			<td>Ngày tạo</td>
			<td>Số lượng</td>
			<td>Tình trạng</td>
			<td>Chi tiết</td>
			<td>Giá</td>
			<td>Thành tiền</td>
			<td>Action</td>
		</tr>
		<c:forEach var="nhap" items="${phieuNhap}">
			<c:url var="deleteLink" value="/app/delete">
				<c:param name="maPhieuNhap" value="${nhap.maPhieuNhap}"></c:param>
			</c:url>
			<c:url var="updateLink" value="/app/form-update">
				<c:param name="maPhieuNhap" value="${nhap.maPhieuNhap}"></c:param>
			</c:url>
			<tr>
				<td>${nhap.maPhieuNhap}</td>
				<td>${nhap.thietBi}</td>
				<td>${nhap.ngayTao}</td>
				<td>${nhap.getChiTietPhieuNhap().getSoLuong()}</td>
				<td>${nhap.getChiTietPhieuNhap().getTinhTrang()}</td>
				<td>${nhap.getChiTietPhieuNhap().getChiTiet()}</td>
				<td>${nhap.getChiTietPhieuNhap().getGia()}</td>
				<td>${nhap.tongTien}</td>
				<td><a href="${deleteLink}"
					onclick="if(!(confirm('Bạn có muốn xóa Giày này không?'))) return false">Xóa</a>
					<a href="${updateLink}">Cập nhật</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="form-add">Thêm mới</a>
	<a href="dangNhap">Đăng xuất</a>
</body>
</html>