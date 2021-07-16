package com.ys.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PagesBean {
	@Value("4")
	private int id;
	@Value("458")
	private int noOfPages;
	@Value("white")
	private String pageColour;

	public PagesBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getPageColour() {
		return pageColour;
	}

	public void setPageColour(String pageColour) {
		this.pageColour = pageColour;
	}

	@Override
	public String toString() {
		return "PagesBean [id=" + id + ", noOfPages=" + noOfPages + ", pageColour=" + pageColour + "]";
	}

}
