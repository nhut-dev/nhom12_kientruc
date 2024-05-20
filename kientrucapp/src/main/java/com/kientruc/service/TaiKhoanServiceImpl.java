package com.kientruc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kientruc.dao.TaiKhoanDAO;
import com.kientruc.entities.TaiKhoan;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService{

	@Autowired
	private TaiKhoanDAO dao;
	
	@Override
	@Transactional
	public List<TaiKhoan> getListTaiKhoans() {
		// TODO Auto-generated method stub
		return dao.getListTaiKhoans();
	}

	@Override
	@Transactional
	public void taoTaiKhoan(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		dao.taoTaiKhoan(taiKhoan);
	}

	@Override
	@Transactional
	public boolean check(String tenTaiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public TaiKhoan dangNhap(String tenTaiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		return dao.dangNhap(tenTaiKhoan, matKhau);
	}

}
