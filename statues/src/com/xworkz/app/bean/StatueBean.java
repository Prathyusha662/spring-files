package com.xworkz.app.bean;

import java.io.Serializable;

public class StatueBean implements Serializable {
	private int id;
	private String name;
	private String location;
	private String material;

	public StatueBean() {
		// TODO Auto-generated constructor stub
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "StatueBean [id=" + id + ", name=" + name + ", location=" + location + ", material=" + material + "]";
	}
	
	public void displayPlanet() {
		System.out.println("display statue bean IS CALLED");
		System.out.println(getId() + "  " + getName() + "  " + getLocation() + "   " + getMaterial());
	}

}
