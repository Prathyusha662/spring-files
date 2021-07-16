package com.xworkz.zoo.bean;

import java.io.Serializable;

public class ZooBean implements Serializable {

	private int id;
	private String name;
	private int noOfAnimalsAvalable;
	private double entryFee;
	private String location;

	public void open() {
		System.out.println("is opened");

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

	public int getNoOfAnimalsAvalable() {
		return noOfAnimalsAvalable;
	}

	public void setNoOfAnimalsAvalable(int noOfAnimalsAvalable) {
		this.noOfAnimalsAvalable = noOfAnimalsAvalable;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

//	@Override
//	public String toString() {
//		return "ZooBean [id=" + id + ", name=" + name + ", noOfAnimalsAvalable=" + noOfAnimalsAvalable + ", entryFee="
//				+ entryFee + ", location=" + location + "]";
//	}

}
