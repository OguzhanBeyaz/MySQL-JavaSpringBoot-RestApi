package com.java.Saat_Cms.entitis;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="status")
	private String status;
	
	@Column(name="licenses")
	private String licenses ;
	
	@Column(name="poster_url")
	private String posterUrl;
	
	@Column(name="video_url")
	private String videoUrl;

	

	
	
	
	
	public Content() {};
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

	public String getStatus () {
		return status;
	}

	public void setStatus (String status) {
		this.status  = status;
	}

	public String getLicenses () {
		return licenses ;
	}

	public void setLicenses (String licenses) {
		this.licenses  = licenses;
	}

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl  = posterUrl;
	}
	
	public String getVideoUrl() {
		return posterUrl ;
	}

	public void setVideoUrl (String videoUrl  ) {
		this.videoUrl   = videoUrl  ;
	}

	public Content(int id, String name, String status, String licenses, String posterUrl,String videoUrl ) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.licenses = licenses;
		this.posterUrl   = posterUrl  ; 
		this.videoUrl   = videoUrl  ;
	}

}
