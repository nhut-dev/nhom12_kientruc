package com.kientruc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kientruc.entities.PhieuNhap;

@Repository
public class PhieuNhapDAOImpl implements PhieuNhapDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<PhieuNhap> getListPhieuNhap() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<PhieuNhap> query = session.createQuery("from PhieuNhap", PhieuNhap.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void addPhieuNhap(PhieuNhap phieuNhap) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(phieuNhap);
	}

	@Override
	@Transactional
	public void deletePhieuNhap(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from PhieuNhap maPhieuNhap=: id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	@Transactional
	public PhieuNhap getPhieuNhap(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(PhieuNhap.class, id);
	}
	
}
