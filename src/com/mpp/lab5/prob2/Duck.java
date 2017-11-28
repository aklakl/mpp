package com.mpp.lab5.prob2;

public class Duck {

	public void quack() {

		QuackBehaviour qb;
		String duckName = this.getClass().getSimpleName();

		if (duckName.equalsIgnoreCase("MallardDuck")) {
			qb = new Quack();
		} else if (duckName.equalsIgnoreCase("DecoyDuck")) {
			qb = new MuteQuack();
		} else if (duckName.equalsIgnoreCase("RedheadDuck")) {
			qb = new Quack();
		} else if (duckName.equalsIgnoreCase("RubberDuck")) {
			qb = new Squeak();
		} else {
			qb = null;
		}

		qb.quack();
	}

	public void fly() {

		FlyBehaviour fb;
		String duckName = this.getClass().getSimpleName();

		if (duckName.equalsIgnoreCase("MallardDuck")) {
			fb = new FlyWithWings();
		} else if (duckName.equalsIgnoreCase("DecoyDuck")) {
			fb = new CannotFly();
		} else if (duckName.equalsIgnoreCase("RedheadDuck")) {
			fb = new FlyWithWings();
		} else if (duckName.equalsIgnoreCase("RubberDuck")) {
			fb = new CannotFly();
		} else {
			fb = null;
		}

		fb.fly();
	}

	public void swim() {
		System.out.println("swimming");
	}

	public void display() {
		System.out.println("displaying");
	}

}
