package com.cts.model;

public class CustomerService {
	
	public void addCustomer() {
		
		System.out.println("Customer Added Successfully");
		
	}
	
	public void updateCustomer(){
		
		System.out.println("Customer details updated successfully");
		throw new RuntimeException("Error Occurred");
	}
	
	public void deleteCustomer() {
		System.out.println("Customer deleted successfully");
		throw new RuntimeException("Error Occurred");
	}
	
	public void purchase() throws InterruptedException{
		System.out.println("Purchase started....");
		Thread.sleep(2000);
		System.out.println("Puchase ended");

	}
	

}
