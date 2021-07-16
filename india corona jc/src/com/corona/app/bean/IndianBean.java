package com.corona.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IndianBean {
	@Value("6")
	private int id;
	@Value("29")
	private int noOfStates;
	@Value("777777")
	private int deaths;
	@Autowired
	private CoronaBean bean;

	public IndianBean() {
		// TODO Auto-generated constructor stub
		System.out.println(" indianBean is created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public CoronaBean getBean() {
		return bean;
	}

	public void setBean(CoronaBean bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return "IndianBean [id=" + id + ", noOfStates=" + noOfStates + ", deaths=" + deaths + ", bean=" + bean + "]";
	}

}
