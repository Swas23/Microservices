package com.cts.spring_demo;

public class LifeCycleBean {
	
	public void init() {
		System.out.println("Init method created");
	}
	
	public void destroy() {
		System.out.println("Destroy method created");
	}
	public void message() {
		System.out.println("Hellooooooo");
	}

}
