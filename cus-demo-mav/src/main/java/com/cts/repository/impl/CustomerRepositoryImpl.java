package com.cts.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.customer.Customer;
import com.cts.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Customer> getAllCustomers() {
		return jdbcTemplate.query("select * from customer", new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Customer cus = new Customer();
				cus.setCustId(rs.getInt("CustId"));
				cus.setCustName(rs.getString("CustName"));
				cus.setEmail(rs.getString("email"));
				cus.setMobile(rs.getString("mobile"));
				cus.setSubscriptionFee(rs.getDouble("subscription"));
				cus.setDoj(rs.getDate("doj").toLocalDate());
				return cus;
			}

		});
		// TODO Auto-generated method stu
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from customer where custId=?",(rs,rowNum)->{
			Customer customer=new Customer();
			customer.setCustId(rs.getInt(1));
			customer.setCustName(rs.getString(2));
			customer.setEmail(rs.getString(3));
			customer.setMobile(rs.getString(4));
			customer.setSubscriptionFee(rs.getDouble(5));
			customer.setDoj(rs.getDate(6).toLocalDate());
		return customer;
		},id);
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into customer values(?,?,?,?,?,?)", customer.getCustId(), customer.getCustName(),
				customer.getEmail(), customer.getMobile(), customer.getSubscriptionFee(), customer.getDoj());
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update customer set custName=?,email=?,mobile=?,subscription=?,doj=? where custId=?",
				customer.getCustName(),	customer.getEmail(), customer.getMobile(), customer.getSubscriptionFee(), customer.getDoj(),customer.getCustId());
				
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from customer where custId=?",id);
	}

}
