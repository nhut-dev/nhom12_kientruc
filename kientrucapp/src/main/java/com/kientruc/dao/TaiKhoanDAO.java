package com.kientruc.dao;

import java.util.List;

import com.kientruc.entities.TaiKhoan;

public interface TaiKhoanDAO {
	public List<TaiKhoan> getListTaiKhoans();
	public void taoTaiKhoan(TaiKhoan taiKhoan);
	public boolean check(String tenTaiKhoan, String matKhau);
	public TaiKhoan dangNhap(String tenTaiKhoan, String matKhau);
}
