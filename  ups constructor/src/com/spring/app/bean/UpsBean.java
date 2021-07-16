package com.spring.app.bean;

import java.io.Serializable;

public class UpsBean implements Serializable {
	private int id;
	private String Company;
	private String capacity;
	private int price;
	private boolean charge;

	public UpsBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public UpsBean(int id, String company, String capacity, int price, boolean charge) {
		super();
		this.id = id;
		Company = company;
		this.capacity = capacity;
		this.price = price;
		this.charge = charge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isCharge() {
		return charge;
	}

	public void setCharge(boolean charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "UpsBean [id=" + id + ", Company=" + Company + ", capacity=" + capacity + ", price=" + price
				+ ", charge=" + charge + "]";
	}

}
