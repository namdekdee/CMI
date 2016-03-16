package com.cmi.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tempvehical")
public class TempVehicleEntity {
	
	@Id
	@Column(name="VehicalCode")
	@GeneratedValue
	private int vehicleID;
	
	@Column(name="Make")
	private String make;
	
	@Column(name="Model")
	private String model;
	
	@Column(name="ManufactureYear")
	private String manufactureYear;
	
	@Column(name="ModelDescription")
	private String modelDescription;
	
	@Column(name="BodyType")
	private String bodyType;
	
	@Column(name="SubbodyType")
	private String subbodyType;
	
	@Column(name="Usage")
	private String usage;
	
	@Column(name="SeatNumber")
	private String seatNumber;

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(String manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public String getModelDescription() {
		return modelDescription;
	}

	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getSubbodyType() {
		return subbodyType;
	}

	public void setSubbodyType(String subbodyType) {
		this.subbodyType = subbodyType;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	

}
