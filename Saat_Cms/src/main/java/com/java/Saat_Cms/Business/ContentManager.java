package com.java.Saat_Cms.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.Saat_Cms.DataAccess.IContentDal;
import com.java.Saat_Cms.entitis.Content;

@Service
public class ContentManager implements IContentService{

	private IContentDal contentDal;

	@Autowired
	public ContentManager(IContentDal contentDal) {
		
		this.contentDal = contentDal;
	}

	@Override
	@Transactional
	public List<Content> getAll() {
		// TODO Auto-generated method stub
		return  this.contentDal.getAll();
	}

	@Override
	@Transactional
	public void add(Content content) {
		// TODO Auto-generated method stub
		this.contentDal.add(content);
		
	}

	@Override
	@Transactional
	public void update(Content content) {
		// TODO Auto-generated method stub
		this.contentDal.update(content);
		
	}

	@Override
	@Transactional
	public void delete(Content content) {
		// TODO Auto-generated method stub
		this.contentDal.delete(content);
		
	}

	@Override
	@Transactional
	public Content getById(int id) {
		// TODO Auto-generated method stub
		
		return this.contentDal.getById(id);
	}

	

}
