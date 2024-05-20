package com.kientruc.dao;

import java.util.List;

import com.kientruc.entities.NguoiDung;

public interface NguoiDungDAO {
	public List<NguoiDung> getListNguoiDung();
	public void addNguoiDungs(NguoiDung nguoiDung);
	public void deleteNguoiDungs(int id);
	public NguoiDung getNguoiDung(int id);
}
