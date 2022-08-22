package com.java.Saat_Cms.DataAccess;

import java.util.List;

import com.java.Saat_Cms.entitis.Content;

public interface IContentDal {
	
    List<Content> getAll();
	
	void add(Content content);
	
	void update(Content content);
	
	void delete(Content content);
	
	Content getById(int id);

}
