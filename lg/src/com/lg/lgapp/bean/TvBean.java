package com.lg.lgapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TvBean {
	@Value("7")
	private int id;
	@Value("samsung")
	private String name;
	@Value("67")
	private int inches;
	@Value("676866")
	private int modelNo;
	@Autowired
	private RemoteBean remote;

	public TvBean() {
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

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public RemoteBean getRemote() {
		return remote;
	}

	public void setRemote(RemoteBean remote) {
		this.remote = remote;
	}

	@Override
	public String toString() {
		return "TvBean [id=" + id + ", name=" + name + ", inches=" + inches + ", modelNo=" + modelNo + ", remote="
				+ remote + "]";
	}

}
