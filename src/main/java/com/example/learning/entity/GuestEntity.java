package com.example.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class GuestEntity {
	
	@Id
	@GeneratedValue
	private String fullName;
	private Integer contectNum;
	private String houseNum;
	private String vehicleRegNo;
	private Integer NumberOfVisitors;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getContectNo() {
		return contectNum;
	}
	public void setContectNo(Integer contectNo) {
		this.contectNum = contectNo;
	}
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	public String getVehicleRegNo() {
		return vehicleRegNo;
	}
	public void setVehicleRegNo(String vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}
	public Integer getNumberOfVisitors() {
		return NumberOfVisitors;
	}
	public void setNumberOfVisitors(Integer numberOfVisitors) {
		NumberOfVisitors = numberOfVisitors;
	}

}
