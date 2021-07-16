package com.xworkz.simcard.bean;

import java.io.Serializable;

public class SimCardBean implements Serializable {
	private int id;
	private String name;
	private String headArea;
	private long revenue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadArea() {
		return headArea;
	}

	public void setHeadArea(String headArea) {
		this.headArea = headArea;
	}

	public long getRevenue() {
		return revenue;
	}

	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}

}
