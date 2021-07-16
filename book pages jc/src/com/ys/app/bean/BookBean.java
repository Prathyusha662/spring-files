package com.ys.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookBean {
	@Value("56")
	private int id;
	@Value("ramayan")

	private String name;
	@Value("valmiki")

	private String Author;
	@Value("560")

	private double price;
	@Value("45.07")

	private float width;
	@Autowired
	private PagesBean page;

	public BookBean() {
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

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public PagesBean getPage() {
		return page;
	}

	public void setPage(PagesBean page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "BookBean [id=" + id + ", name=" + name + ", Author=" + Author + ", price=" + price + ", width=" + width
				+ ", page=" + page + "]";
	}

}
