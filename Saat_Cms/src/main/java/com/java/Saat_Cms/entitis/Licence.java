package com.java.Saat_Cms.entitis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licence")
public class Licence {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="start_time ")
	private String starTime ;
	
	@Column(name="end_time ")
	private String endTime  ;
	
	@Column(name="contents ")
	private String contents ;
	
	

	

	
	
	
	
	public Licence() {};
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStarTime () {
		return starTime ;
	}

	public void setStarTime (String endTime) {
		this.starTime   = endTime;
	}

	public String getEndTime () {
		return endTime  ;
	}

	public void setEndTime (String endTime) {
		this.endTime   = endTime;
	}

	public String getcontents () {
		return contents ;
	}

	public void setContents (String contents ) {
		this.contents   = contents ;
	}
	


	

	public Licence(int id, String name, String starTime , String endTime , String contents ) {
		super();
		this.id = id;
		this.name = name;
		this.starTime  = starTime ;
		this.endTime  = endTime ;
		this.contents    = contents   ; 
		
	}

}
