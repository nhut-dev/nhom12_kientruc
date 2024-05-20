package com.kientruc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kientruc.dao.NguoiDungDAO;
import com.kientruc.entities.NguoiDung;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {

	@Autowired
	private NguoiDungDAO dao;

	@Override
	@Transactional
	public List<NguoiDung> getListNguoiDung() {
		// TODO Auto-generated method stub
		return dao.getListNguoiDung();
	}

	@Override
	@Transactional
	public void addNguoiDungs(NguoiDung nguoiDung) {
		// TODO Auto-generated method stub
		dao.addNguoiDungs(nguoiDung);
	}

	@Override
	@Transactional
	public void deleteNguoiDungs(int id) {
		// TODO Auto-generated method stub
		dao.deleteNguoiDungs(id);

	}

	@Override
	@Transactional
	public NguoiDung getNguoiDung(int id) {
		// TODO Auto-generated method stub
		return dao.getNguoiDung(id);
	}

}
