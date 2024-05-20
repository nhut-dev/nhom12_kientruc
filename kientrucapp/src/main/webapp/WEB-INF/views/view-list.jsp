<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách</title>
</head>
<body>
	<table border = 1 padding = 2>
		<tr>
			<td>Mã phiếu nhập</td>
			<td>Tên thiết bị</td>
			<td>Ngày tạo</td>
			<td>Số lượng</td>
			<td>Tình trạng</td>
			<td>Chi tiết</td>
			<td>Gia</td>
			<td>Thành tiền</td>
		</tr>
		<c:forEach var="nhap" items="${phieuNhap}">
			<tr>
				<td>${nhap.maPhieuNhap}</td>
				<td>${nhap.thietBi}</td>
				<td>${nhap.ngayTao}</td>
				<td>${nhap.getChiTietPhieuNhap().getSoLuong()}</td>
				<td>${nhap.getChiTietPhieuNhap().getTinhTrang()}</td>
				<td>${nhap.getChiTietPhieuNhap().getChiTiet()}</td>
				<td>${nhap.getChiTietPhieuNhap().getGia()}</td>
				<td>${nhap.tongTien}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="../taikhoan/logout">Đăng xuất</a>
</body>
</html>