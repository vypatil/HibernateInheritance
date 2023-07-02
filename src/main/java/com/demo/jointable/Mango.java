package com.demo.jointable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Mango_tree_Details")
public class Mango extends Jungle {

	@Column(name = "Growing_Time_in_years")
	int Growing_duration;

	@Column(name = "Tree_type")
	String type;

	public int getGrowing_duration() {
		return Growing_duration;
	}

	public void setGrowing_duration(int growing_duration) {
		Growing_duration = growing_duration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Mango [Growing_duration=" + Growing_duration + ", type=" + type + "]";
	}

}
