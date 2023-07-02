package com.demo.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bikes")
@DiscriminatorValue("BikeRecord")

public class Bike extends Vehicle  {
	
	@Column(name="BikeType")
	String Biketype;
	
	@Column(name="BikeStand")
	String stand;
	

	public String getBiketype() {
		return Biketype;
	}


	public void setBiketype(String biketype) {
		Biketype = biketype;
	}


	public String getStand() {
		return stand;
	}


	public void setStand(String stand) {
		this.stand = stand;
	}


	@Override
	public String toString() {
		return "Bike [Biketype=" + Biketype + ", stand=" + stand + "]";
	}

	
	
	
	

}
