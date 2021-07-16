package com.spring.app.bean;

import java.io.Serializable;

public class WahingMachineBean implements Serializable {
	private int id;
	private String name;
	private String quantity;
	private double price;

	public WahingMachineBean() {

	}

	public WahingMachineBean(int id, String name, String quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WahingMachineBean [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
