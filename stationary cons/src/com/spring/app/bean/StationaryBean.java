package com.spring.app.bean;

public class StationaryBean {
	private int id;
	private String name;
	private int orderNo;
	private String location;
	private double price;

	public StationaryBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public void book() {
		System.out.println("booked ");
	}

	public StationaryBean(int id, String name, int orderNo, String location, double price) {
		super();
		this.id = id;
		this.name = name;
		this.orderNo = orderNo;
		this.location = location;
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

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "StationaryBean [id=" + id + ", name=" + name + ", orderNo=" + orderNo + ", location=" + location
				+ ", price=" + price + "]";
	}

}
