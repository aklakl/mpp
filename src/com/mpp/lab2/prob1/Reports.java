package com.mpp.lab2.prob1;

import java.util.Date;

public class Reports {
	
	private int id;
	private String name;
	private Date generationDate;
	private String developerName;
	private Employee generator;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getGenerationDate() {
		return generationDate;
	}
	public void setGenerationDate(Date generationDate) {
		this.generationDate = generationDate;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public Employee getGenerator() {
		return generator;
	}
	public void setGenerator(Employee generator) {
		this.generator = generator;
	}

	
	
}
