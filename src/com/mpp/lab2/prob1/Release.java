package com.mpp.lab2.prob1;

import java.util.Date;

public class Release {
	
	private int id;
	private Date releaseDate;
	private String version;
	private Project project;
	private Employee projectManager;
	
	
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Employee getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Employee projectManager) {
		this.projectManager = projectManager;
	}
	
	
	

}
