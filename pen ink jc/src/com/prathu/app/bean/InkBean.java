package com.prathu.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InkBean {
	@Value("78")
	private int id;
	@Value("2mm")
	private String quantity;
	@Value("5.1mm")
	private String lengthOfRifle;

	public InkBean() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getLengthOfRifle() {
		return lengthOfRifle;
	}

	public void setLengthOfRifle(String lengthOfRifle) {
		this.lengthOfRifle = lengthOfRifle;
	}

	@Override
	public String toString() {
		return "InkBean [id=" + id + ", quantity=" + quantity + ", lengthOfRifle=" + lengthOfRifle + "]";
	}

}
