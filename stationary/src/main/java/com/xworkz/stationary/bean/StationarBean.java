package com.xworkz.stationary.bean;

import java.io.Serializable;

public class StationarBean implements Serializable {
	private int StationaryId;
	private String name;
	private String address;
	private String ownerName;

	public void ProvideItems() {
		System.out.println("invoked provideItems");
	}

	public int getStationaryId() {
		return StationaryId;
	}

	public void setStationaryId(int stationaryId) {
		StationaryId = stationaryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
