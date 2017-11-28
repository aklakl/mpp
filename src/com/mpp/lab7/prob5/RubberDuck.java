package com.mpp.lab7.prob5;

public class RubberDuck extends Duck implements UnFlyable,Squeakable{

	@Override
	public void fly() {
		UnFlyable.super.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Squeakable.super.quack();
	}

}
