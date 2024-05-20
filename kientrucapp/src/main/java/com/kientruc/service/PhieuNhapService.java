package com.kientruc.service;

import java.util.List;

import com.kientruc.entities.PhieuNhap;

public interface PhieuNhapService {
	public List<PhieuNhap> getListPhieuNhap();
	public void addPhieuNhap(PhieuNhap phieuNhap);
	public void deletePhieuNhap(int id);
	public PhieuNhap getPhieuNhap(int id);
}
