package com.demo.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CarDetails")
@DiscriminatorValue("CarRecords")
public class Car extends Vehicle {

	@Column(name = "CarType")
	String Cartype;

	@Column(name = "AirConditioner")
	String airconditioner;

	public String getCartype() {
		return Cartype;
	}

	public void setCartype(String cartype) {
		Cartype = cartype;
	}

	public String getAirconditioner() {
		return airconditioner;
	}

	public void setAirconditioner(String airconditioner) {
		this.airconditioner = airconditioner;
	}

	@Override
	public String toString() {
		return "Car [Cartype=" + Cartype + ", airconditioner=" + airconditioner + "]";
	}

}
