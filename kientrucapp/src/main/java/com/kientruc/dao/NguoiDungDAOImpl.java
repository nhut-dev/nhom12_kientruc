package com.kientruc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kientruc.entities.NguoiDung;

@Repository
public class NguoiDungDAOImpl implements NguoiDungDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<NguoiDung> getListNguoiDung() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<NguoiDung> query = session.createQuery("from NguoiDung", NguoiDung.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void addNguoiDungs(NguoiDung nguoiDung) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(nguoiDung);
		
	}

	@Override
	@Transactional
	public void deleteNguoiDungs(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from NguoiDung where maNguoiDung =: id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	@Transactional
	public NguoiDung getNguoiDung(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(NguoiDung.class, id);
	}
}
