package com.corona.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoronaBean {
	@Value("7")
	private int id;
	@Value("50000")
	private int activeCases;
	@Value("18888776")
	private int Recoverd;
	@Value("covisheild")
	private String vaccineName;

	public CoronaBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActiveCases() {
		return activeCases;
	}

	public void setActiveCases(int activeCases) {
		this.activeCases = activeCases;
	}

	public int getRecoverd() {
		return Recoverd;
	}

	public void setRecoverd(int recoverd) {
		Recoverd = recoverd;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	@Override
	public String toString() {
		return "CoronaBean [id=" + id + ", activeCases=" + activeCases + ", Recoverd=" + Recoverd + ", vaccineName="
				+ vaccineName + "]";
	}

}
