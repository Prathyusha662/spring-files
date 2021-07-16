package com.spring.app;

import java.io.Serializable;

public class FmBean implements Serializable {
	private int id;
	private double chanelNo;
	private String fmLanguage;
	private int noOfChanels;
	private String singnalStrength;

	public FmBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public FmBean(int id, double chanelNo, String fmLanguage, int noOfChanels, String singnalStrength) {
		super();
		this.id = id;
		this.chanelNo = chanelNo;
		this.fmLanguage = fmLanguage;
		this.noOfChanels = noOfChanels;
		this.singnalStrength = singnalStrength;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getChanelNo() {
		return chanelNo;
	}

	public void setChanelNo(double chanelNo) {
		this.chanelNo = chanelNo;
	}

	public String getFmLanguage() {
		return fmLanguage;
	}

	public void setFmLanguage(String fmLanguage) {
		this.fmLanguage = fmLanguage;
	}

	public int getNoOfChanels() {
		return noOfChanels;
	}

	public void setNoOfChanels(int noOfChanels) {
		this.noOfChanels = noOfChanels;
	}

	public String getSingnalStrength() {
		return singnalStrength;
	}

	public void setSingnalStrength(String singnalStrength) {
		this.singnalStrength = singnalStrength;
	}

	@Override
	public String toString() {
		return "FmBean [id=" + id + ", chanelNo=" + chanelNo + ", fmLanguage=" + fmLanguage + ", noOfChanels="
				+ noOfChanels + ", singnalStrength=" + singnalStrength + "]";
	}

}
