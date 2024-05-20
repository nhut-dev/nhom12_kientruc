package com.kientruc.dao;

import java.util.List;

import com.kientruc.entities.PhieuNhap;

public interface PhieuNhapDAO {

	public List<PhieuNhap> getListPhieuNhap();
	public void addPhieuNhap(PhieuNhap phieuNhap);
	public void deletePhieuNhap(int id);
	public PhieuNhap getPhieuNhap(int id);
}
