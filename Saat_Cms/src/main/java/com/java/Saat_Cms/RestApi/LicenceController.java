package com.java.Saat_Cms.RestApi;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.java.Saat_Cms.Business.ILicenceService;

import com.java.Saat_Cms.entitis.*;

@RestController
@RequestMapping("/licence")
public class LicenceController {
	
	private ILicenceService licenceService;

	@Autowired
	public LicenceController(ILicenceService licenceService) {
				
		this.licenceService = licenceService;
		
	}
	
	@GetMapping("/saatcms")
	public List<Licence> get(){
		
		return licenceService.getAll();
		 
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Licence licence) {
		licenceService.add(licence);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Licence licence) {
		licenceService.update(licence);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Licence licence) {
		licenceService.delete(licence);
	}
	
	@GetMapping("/saatcms/{id}")
	public Licence getById(@PathVariable int id){
		
		return licenceService.getById(id);
		
	}

}
