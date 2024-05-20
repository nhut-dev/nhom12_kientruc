package com.kientruc.service;

import java.util.List;

import com.kientruc.entities.NguoiDung;

public interface NguoiDungService {
	public List<NguoiDung> getListNguoiDung();
	public void addNguoiDungs(NguoiDung nguoiDung);
	public void deleteNguoiDungs(int id);
	public NguoiDung getNguoiDung(int id);
}
