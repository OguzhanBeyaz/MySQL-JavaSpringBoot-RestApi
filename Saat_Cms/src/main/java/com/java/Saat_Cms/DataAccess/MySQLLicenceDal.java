package com.java.Saat_Cms.DataAccess;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.java.Saat_Cms.entitis.Licence;

@Repository
public class MySQLLicenceDal implements ILicenceDal {
	
private EntityManager entityManager;
	
	@Autowired
	public MySQLLicenceDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	

	@Override
	@Transactional
	public List<Licence> getAll() {
		// TODO Auto-generated method stub
		
		Session session = entityManager.unwrap(Session.class);

		List<Licence> licence = session.createNativeQuery("select * from Licence",Licence.class).getResultList();
	     return licence;
	     
	}

	@Override
	public void add(Licence licence) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.save(licence);
	}

	@Override
	public void update(Licence licence) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.update(licence);
		
	}

	@Override
	public void delete(Licence licence) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Licence licenceToDelete = session.get(Licence.class, licence.getId());
		session.delete(licenceToDelete);
		
	}



	@Override
	public Licence getById(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Licence licence = session.get(Licence.class, id);
		return licence;
	}

}
