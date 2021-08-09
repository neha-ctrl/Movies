package com.model;

public class Movies {

	public int yearofrelease;
	public String name;
	public String actor;
	public String actress;
	public String director;
	
	public int getyearofrelease() {
	return yearofrelease;
	}
	public void setyearofrelease(int yearofrelease) {
		this.yearofrelease = yearofrelease;
	}
	public String getname() {
		return name;
	}

	@Override
	public String toString() {
		return "Movies [yearofrelease=" + yearofrelease + ", name=" + name + ", actor=" + actor + ", actress=" + actress
				+ ", director=" + director + "]";
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getactor() {
		return actor;
	}
	public void setactor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	
}
}