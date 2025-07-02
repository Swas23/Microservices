package com.cts.spring_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name;
	private int age;
	private Vehicle vehicle;
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
	public Vehicle getVehicle() {
		return vehicle;
	}
	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", vehicle=" + vehicle + "]";
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Vehicle :"+vehicle);
	}
	

}
