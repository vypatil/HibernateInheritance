package com.demo.jointable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Trees in Jungle")
@Inheritance(strategy = InheritanceType.JOINED)
public class Jungle {

	@Id
	@Column(name = "Sr_No")
	int ser_No;

	@Column(name = "Tree List")
	String tree_name;

	public Jungle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jungle(int ser_No, String tree_name) {
		super();
		this.ser_No = ser_No;
		this.tree_name = tree_name;
	}

	public int getSer_No() {
		return ser_No;
	}

	public void setSer_No(int ser_No) {
		this.ser_No = ser_No;
	}

	public String getTree_name() {
		return tree_name;
	}

	public void setTree_name(String tree_name) {
		this.tree_name = tree_name;
	}

	@Override
	public String toString() {
		return "Jungle [ser_No=" + ser_No + ", tree_name=" + tree_name + "]";
	}

}
