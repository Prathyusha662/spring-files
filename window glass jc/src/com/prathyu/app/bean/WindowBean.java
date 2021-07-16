package com.prathyu.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WindowBean {
	@Value("890")
	private int id;
	@Value("wood")
	private String madeOf;
	@Value("5")
	private int length;
	@Autowired
	private GlassBean glass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public GlassBean getGlass() {
		return glass;
	}

	public void setGlass(GlassBean glass) {
		this.glass = glass;
	}

	public WindowBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WindowBean [id=" + id + ", madeOf=" + madeOf + ", length=" + length + ", glass=" + glass + "]";
	}

}
