package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class data {
	@Id
	private String name;
	private int age;
	private int smoking;
	private int yellow_fingers;
	private int wheezing;
	public data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public data(String name, int age, int smoking, int yellow_fingers, int wheezing) {
		super();
		this.name = name;
		this.age = age;
		this.smoking = smoking;
		this.yellow_fingers = yellow_fingers;
		this.wheezing = wheezing;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSmoking() {
		return smoking;
	}
	public void setSmoking(int smoking) {
		this.smoking = smoking;
	}
	public int getYellow_fingers() {
		return yellow_fingers;
	}
	public void setYellow_fingers(int yellow_fingers) {
		this.yellow_fingers = yellow_fingers;
	}
	public int getWheezing() {
		return wheezing;
	}
	public void setWheezing(int wheezing) {
		this.wheezing = wheezing;
	}
	
}
