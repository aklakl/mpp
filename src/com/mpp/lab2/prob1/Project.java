package com.mpp.lab2.prob1;

public class Project {
	
	private int id;
	private String name;
	private Employee projectManager;
	private Employee developer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Employee projectManager) {
		this.projectManager = projectManager;
	}
	public Employee getDeveloper() {
		return developer;
	}
	public void setDeveloper(Employee developer) {
		this.developer = developer;
	}
	
	


}
