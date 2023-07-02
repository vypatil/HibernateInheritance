package com.demo.jointable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Coconut_Tree_Details")
public class Coconut extends Jungle {

	@Column(name = "Height_of_coconut_in_feet")
	int height;

	@Column(name = "Present_At")
	String location;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Coconut [height=" + height + ", location=" + location + "]";
	}

	
}
