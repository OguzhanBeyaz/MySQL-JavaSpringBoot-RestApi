package com.java.Saat_Cms.Business;

import java.util.List;

import com.java.Saat_Cms.entitis.Content;

public interface IContentService {
     List<Content> getAll();
	
	void add(Content content);
	
	void update(Content content);
	
	void delete(Content content);
	
	Content getById(int id);

}
