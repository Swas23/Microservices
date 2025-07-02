package com.cts.spring_demo;

public class Employee {
	
	private int id;
	private String name;
	private Department dId; 
	
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getdId() {
		return dId;
	}

	public void setdId(Department dId) {
		this.dId = dId;
	}

	public void emp() {
		 System.out.println("Employee "+name+" with id : "+id+" is working in department : "+dId.getDeptId());
	}

}
