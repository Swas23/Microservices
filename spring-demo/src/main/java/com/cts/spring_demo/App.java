package com.cts.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       
    	
    	ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
//    	ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
    	
//  	    HelloWorld hw = (HelloWorld) con.getBean("hello");
//    	hw.sayHello();
//    	
//    	Person psn = con.getBean(Person.class);
//    	psn.persn();
//    	
//    	Employee employee = con.getBean(Employee.class);
//    	employee.emp();
//    	
//    	
//    	Triangle tri = (Triangle) con.getBean("triangle");
//    	tri.draw();
//    	
//    	Library li = con.getBean(Library.class);
//    	li.mylib();
//    	
//    	LifeCycleBean life = (LifeCycleBean) con.getBean("method");
//    	life.message();
//  	con.close();
    	
    	Client cli = con.getBean(Client.class);
    	cli.draw();
    }
}
