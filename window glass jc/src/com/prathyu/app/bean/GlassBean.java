package com.prathyu.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GlassBean {
	@Value("5")
	private int id;
	@Value("56")
	private int length;
	@Value("6")
	private int width;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "GlassBean [id=" + id + ", length=" + length + ", width=" + width + "]";
	}

}
