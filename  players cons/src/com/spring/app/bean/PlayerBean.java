package com.spring.app.bean;

public class PlayerBean {
	private int id;
	private String game;
	private int noOfPlayers;
	private String country;

	public PlayerBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public PlayerBean(int id, String game, int noOfPlayers, String country) {
		super();
		this.id = id;
		this.game = game;
		this.noOfPlayers = noOfPlayers;
		this.country = country;
	}

	public void play() {
		System.out.println("is played");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PlayerBean [id=" + id + ", game=" + game + ", noOfPlayers=" + noOfPlayers + ", country=" + country
				+ "]";
	}

}
