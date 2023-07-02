package com.demo.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Indian_university")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class India {

	@Column(name = "Sr_No")
	@Id
	int SrNo;

	@Column(name = "University_name")
	String Unv_name;

	public India() {
		super();
		
	}

	public India(int srNo, String unv_name) {
		super();
		SrNo = srNo;
		Unv_name = unv_name;
	}

	public int getSrNo() {
		return SrNo;
	}

	public void setSrNo(int srNo) {
		SrNo = srNo;
	}

	public String getUnv_name() {
		return Unv_name;
	}

	public void setUnv_name(String unv_name) {
		Unv_name = unv_name;
	}

	@Override
	public String toString() {
		return "India [SrNo=" + SrNo + ", Unv_name=" + Unv_name + "]";
	}

}
