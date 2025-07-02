package com.cts.spring_demo2;

public class Vehicle {
	
	private String type;

	public Vehicle(String type) {
		
		this.type = type;
	}

	@Override
	
	public String toString() {
		return "Vehicle [type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void myVehicle() {
		System.out.println("Vehicle : " +type);
	}
	
	
	

}
