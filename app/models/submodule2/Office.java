package models.submodule2;

import javax.persistence.Entity;
import com.avaje.ebean.Model.Finder;
import models.submodule1.BaseModel;

@Entity
public class Office extends BaseModel {

	public static Finder<Long, Office> find = new Finder<>(Office.class);

	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



}
