package com.mpp.lab4.probC;

public class PayCheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {

		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public void print() {

		System.out.println("Gross Pay : " + grossPay);
		System.out.println("FICA Tax : " + fica);
		System.out.println("State Tax : " + state);
		System.out.println("Local Tax : " + local);
		System.out.println("Medicare Tax : " + medicare);
		System.out.println("SocialSecurity Tax : " + socialSecurity);
		System.out.println("======================\nNetpay Amount : " + getNetPay()+"\n======================");

	}

	public double getNetPay() {

		return grossPay - fica - state - local - medicare - socialSecurity;

	}

}
