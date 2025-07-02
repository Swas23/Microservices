package com.cts.spring_demo;

public class Person {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private String age;
	
	public void persn() {
		System.out.println("My name is "+name+" and my age is "+age);
	}

}
