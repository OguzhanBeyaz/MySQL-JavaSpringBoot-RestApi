package com.java.Saat_Cms.RestApi;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.Saat_Cms.Business.IContentService;

import com.java.Saat_Cms.entitis.*;


@RestController
@RequestMapping("/content")
public class ContentController {
	
	private IContentService  contentService;

	@Autowired
	public ContentController(IContentService contentService) {
				
		this.contentService = contentService;
		
	}
	
	@GetMapping("/saatcms")
	public List<Content> get(){
		
		return contentService.getAll();
		 
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Content content) {
		contentService.add(content);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Content content) {
		contentService.update(content);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Content content) {
		contentService.delete(content);
	}
	
	@GetMapping("/saatcms/{id}")
	public Content getById(@PathVariable int id){
		
		return contentService.getById(id);
		
	}
	}


