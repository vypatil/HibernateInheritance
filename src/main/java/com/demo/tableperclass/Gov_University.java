package com.demo.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Gov_Universty_list")
public class Gov_University extends India {
	
	@Column(name="Founded_Year")
	int year;
	
	@Column(name="Founded_by")
	String founder;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	@Override
	public String toString() {
		return "Gov_University [year=" + year + ", founder=" + founder + "]";
	}
	
	
	

}
