package com.cts.spring_demo;

public class Client {
	
	private Animal ani;

	public Animal getAni() {
		return ani;
	}

	public void setAni(Animal ani) {
		this.ani = ani;
	}
	
	public void draw() {
		ani.sound();
	}
	
	

}
