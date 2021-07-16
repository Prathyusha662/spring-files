package com.spring.app.bean;

public class ShampooBean {
	private int id;
	private String Company;
	private String name;
	private long code;
	private double price;
	private String chemicalsUsed;
	private String mfd;

	public ShampooBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public void getLife() {
		System.out.println("get a life");
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getChemicalsUsed() {
		return chemicalsUsed;
	}

	public void setChemicalsUsed(String chemicalsUsed) {
		this.chemicalsUsed = chemicalsUsed;
	}

	public String getMfd() {
		return mfd;
	}

	public void setMfd(String mfd) {
		this.mfd = mfd;
	}

	public void displayPlanet() {
		System.out.println("Display ShampooBean IS CALLED");
		System.out.println(getId() + "  " + getCompany() + " " + getName() + "  " + getCode() + "   " + getPrice()
				+ "  " + getChemicalsUsed() + "  " + getMfd());
	}

	@Override
	public String toString() {
		return "ShampooBean [id=" + id + ", Company=" + Company + ", name=" + name + ", code=" + code + ", price="
				+ price + ", chemicalsUsed=" + chemicalsUsed + ", mfd=" + mfd + "]";
	}

}
