<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phiếu nhập</title>
</head>
<body>
	<form:form action="form-add-sumit" method="post">
		<table padding=3>
			<tr>
				<td>Tên thiết bị</td>
				<td><form:input path="thietBi" /></td>
			</tr>
			<tr>
				<td>Ngày tạo</td>
				<td><form:input path="ngayTao" /></td>
			</tr>
			<tr>
				<td>Số lượng</td>
				<td><form:input path="chiTietPhieuNhap.soLuong" /></td>
			</tr>
			<tr>
				<td>Tình trạng</td>
				<td><form:input path="chiTietPhieuNhap.tinhTrang" /></td>
			</tr>
			<tr>
				<td>Chi tiết</td>
				<td><form:input path="chiTietPhieuNhap.chiTiet" /></td>
			</tr>
			<tr>
				<td>Giá</td>
				<td><form:input path="chiTietPhieuNhap.gia" /></td>
			</tr>
			<tr>
				<td>Thành tiền</td>
				<td><form:input path="tongTien" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Thêm"></td>
			</tr>

		</table>
	</form:form>
	<a href="view-list-admin">Trở về</a>

</body>
</html>