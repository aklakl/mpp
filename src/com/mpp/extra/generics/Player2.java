package com.mpp.extra.generics;

public class Player2<N, G> implements GenericPlayer<N, G> {

	private N name;
	private G game;

	Player2(N n, G g) {
		this.name = n;
		this.game = g;

	}

	@Override
	public N getName() {
		return this.name;
	}

	@Override
	public G getGame() {
		return this.game;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + "\nGame : " + this.game;
	}

}
