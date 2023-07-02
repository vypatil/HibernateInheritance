package com.demo.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Private_universities")
public class Private_University extends India {
	
	@Column(name="Rating_of_University")
	int rating;
	
	@Column(name="Owener_of_University")
	String owner;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Private_University [rating=" + rating + ", owner=" + owner + "]";
	}
	
	

}
