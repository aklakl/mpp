package com.mpp.lab2.prob1;

import java.util.Date;

public class Feature {
	
	private int id;
	private String name;
	private Project project;
	private Employee assignee;
	private Employee author;
	private Date dueDate;
	private Sprint sprint;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Employee getAssignee() {
		return assignee;
	}
	public void setAssignee(Employee assignee) {
		this.assignee = assignee;
	}
	public Employee getAuthor() {
		return author;
	}
	public void setAuthor(Employee author) {
		this.author = author;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Sprint getSprint() {
		return sprint;
	}
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
	
	

}
