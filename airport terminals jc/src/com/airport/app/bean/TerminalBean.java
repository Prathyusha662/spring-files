package com.airport.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TerminalBean {
	@Value("5")
	private int id;
	@Value("18")
	private int noOfTerminals;
	@Value("ram")
	private String incharge;

	public TerminalBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfTerminals() {
		return noOfTerminals;
	}

	public void setNoOfTerminals(int noOfTerminals) {
		this.noOfTerminals = noOfTerminals;
	}

	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	@Override
	public String toString() {
		return "TerminalBean [id=" + id + ", noOfTerminals=" + noOfTerminals + ", incharge=" + incharge + "]";
	}

}
