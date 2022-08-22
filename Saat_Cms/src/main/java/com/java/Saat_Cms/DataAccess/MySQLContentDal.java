package com.java.Saat_Cms.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.Saat_Cms.entitis.Content;


@Repository
public class MySQLContentDal implements IContentDal {
private EntityManager entityManager;
	
	@Autowired
	public MySQLContentDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	

	@Override
	@Transactional
	public List<Content> getAll() {
		// TODO Auto-generated method stub
		
		Session session = entityManager.unwrap(Session.class);

		List<Content> content = session.createNativeQuery("select * from content",Content.class).getResultList();
	     return content;
	     
	}

	@Override
	public void add(Content content) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.save(content);
	}

	@Override
	public void update(Content content) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.update(content);
		
	}

	@Override
	public void delete(Content content) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Content contentToDelete = session.get(Content.class, content.getId());
		session.delete(contentToDelete);
		
	}



	@Override
	public Content getById(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Content content = session.get(Content.class, id);
		return content;
	}



	
}
