package com.kientruc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kientruc.dao.PhieuNhapDAO;
import com.kientruc.entities.PhieuNhap;

@Service
public class PhieuNhapServiceImpl implements PhieuNhapService{

	@Autowired
	private PhieuNhapDAO dao;
	
	@Override
	@Transactional
	public List<PhieuNhap> getListPhieuNhap() {
		// TODO Auto-generated method stub
		return dao.getListPhieuNhap();
	}

	@Override
	@Transactional
	public void addPhieuNhap(PhieuNhap phieuNhap) {
		// TODO Auto-generated method stub
		dao.addPhieuNhap(phieuNhap);
	}

	@Override
	@Transactional
	public void deletePhieuNhap(int id) {
		// TODO Auto-generated method stub
		dao.deletePhieuNhap(id);
	}

	@Override
	@Transactional
	public PhieuNhap getPhieuNhap(int id) {
		// TODO Auto-generated method stub
		return dao.getPhieuNhap(id);
	}
	
}
