package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.CustomerService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
      
    	ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
    	
    	CustomerService cus = con.getBean(CustomerService.class);
//    	cus.addCustomer();
//    	cus.updateCustomer();
//    	cus.deleteCustomer();
    	cus.purchase();
    }
}
