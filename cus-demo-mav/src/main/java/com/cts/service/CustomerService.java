package com.cts.service;

import java.util.List;

import com.cts.customer.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	Customer getById(int id);
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int id);
}
