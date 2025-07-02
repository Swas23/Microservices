package com.cts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.customer.Customer;
import com.cts.repository.CustomerRepository;
import com.cts.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerrepository;
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerrepository.getAllCustomers();
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return customerrepository.getById(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
	customerrepository.addCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerrepository.updateCustomer(customer);

	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerrepository.deleteCustomer(id);
	}

}
