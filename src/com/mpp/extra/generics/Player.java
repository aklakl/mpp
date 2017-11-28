package com.mpp.extra.generics;

public class Player implements GenericPlayer<String, String> {

	private String name;
	private String game;

	public Player(String n, String g) {
		this.name = n;
		this.game = g;

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getGame() {
		return this.game;
	}
	
	@Override
	public String toString(){
		return "Name : "+this.name+"\nGame : "+this.game;
	}

}
