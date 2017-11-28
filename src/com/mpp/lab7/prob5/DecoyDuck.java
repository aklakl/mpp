package com.mpp.lab7.prob5;

public class DecoyDuck extends Duck implements UnFlyable,Unquackable {

	@Override
	public void fly() {
		UnFlyable.super.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Unquackable.super.quack();
	}
	

}
