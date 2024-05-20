package com.kientruc.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kientruc.entities.TaiKhoan;

@Repository
public class TaiKhoanDAOImpl implements TaiKhoanDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<TaiKhoan> getListTaiKhoans() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<TaiKhoan> query = session.createQuery("from TaiKhoan", TaiKhoan.class);
		return query.getResultList();
	}

	@Override
	public void taoTaiKhoan(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(taiKhoan);
		
	}

	@Override
	public boolean check(String tenTaiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TaiKhoan dangNhap(String tenTaiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		TypedQuery<TaiKhoan> query = session.createQuery("from TaiKhoan where tenTaiKhoan=:tenTaiKhoan and matKhau=:matKhau");
		query.setParameter("tenTaiKhoan", tenTaiKhoan);
		query.setParameter("matKhau", matKhau);
		try {
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
