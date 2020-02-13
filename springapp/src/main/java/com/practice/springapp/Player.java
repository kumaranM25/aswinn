package com.practice.springapp;

public class Player {
	private String playerName;
	private String sportName;
	private Address address;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Player() {
		super();
		System.out.println("player constructor invoked");
	}

	public Player( Address address) {
		super();
		System.out.println("Player(address) constructor invoked");
		this.address = address;
	}

	public Player(String playerName, String sportName, Address address) {
		super();
		System.out.println("Player(playerName,sportName,address) constructor invoked");
		this.playerName = playerName;
		this.sportName = sportName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "PlayerName = " + playerName + "\nSport = " + sportName + (String)(address != null ? address.toString() : "");
	}

}
