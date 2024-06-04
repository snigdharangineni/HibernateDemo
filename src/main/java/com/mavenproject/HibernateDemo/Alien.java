package com.mavenproject.HibernateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien { //POJO 
	@Id
	private int aid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String string) {
		this.aname = string;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String aname;
	private String color;
	
	
}
