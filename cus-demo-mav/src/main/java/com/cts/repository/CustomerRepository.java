package com.cts.repository;

import java.util.List;

import com.cts.customer.Customer;

public interface CustomerRepository {
	List<Customer> getAllCustomers();
	Customer getById(int id);
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
	
	
	

}
