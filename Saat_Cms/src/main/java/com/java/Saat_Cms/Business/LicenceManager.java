package com.java.Saat_Cms.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.Saat_Cms.DataAccess.ILicenceDal;
import com.java.Saat_Cms.entitis.Licence;

@Service
public class LicenceManager implements ILicenceService{
	
	private ILicenceDal licenceDal;

	@Autowired
	public LicenceManager(ILicenceDal licenceDal) {
		
		this.licenceDal = licenceDal;
	}

	@Override
	@Transactional
	public List<Licence> getAll() {
		// TODO Auto-generated method stub
		return  this.licenceDal.getAll();
	}

	@Override
	@Transactional
	public void add(Licence licence) {
		// TODO Auto-generated method stub
		this.licenceDal.add(licence);
		
	}

	@Override
	@Transactional
	public void update(Licence licence) {
		// TODO Auto-generated method stub
		this.licenceDal.update(licence);
		
	}

	@Override
	@Transactional
	public void delete(Licence licence) {
		// TODO Auto-generated method stub
		this.licenceDal.delete(licence);
		
	}

	@Override
	@Transactional
	public Licence getById(int id) {
		// TODO Auto-generated method stub
		
		return this.licenceDal.getById(id);
	}


}
