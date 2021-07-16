package com.prathu.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PenBean {
	@Value("234")
	private int id;
	@Value("renoylds")
	private String name;
	@Value("Blue")
	private String color;
	@Value("5.6")
	private float length;
	@Autowired
	private InkBean ink;

	public PenBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public InkBean getInk() {
		return ink;
	}

	public void setInk(InkBean ink) {
		this.ink = ink;
	}

	@Override
	public String toString() {
		return "PenBean [id=" + id + ", name=" + name + ", color=" + color + ", length=" + length + ", ink=" + ink
				+ "]";
	}

}
