package project.Plants.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nameEng, nameLat;
	
	public Plant() {}

	public Plant(String nameEng, String nameLat) {
		super();
		this.nameEng = nameEng;
		this.nameLat = nameLat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameEng() {
		return nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getNameLat() {
		return nameLat;
	}

	public void setNameLat(String nameLat) {
		this.nameLat = nameLat;
	}

	
}
