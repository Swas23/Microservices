package com.cts.spring_demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext con  = new AnnotationConfigApplicationContext(JavaConfig.class);
		Person p = con.getBean(Person.class);
		p.setName("Swas");
		p.setAge(22);
		p.display();
		
//		Person per = con.getBean(Person.class);
//		per.setName("Prathik");
//		per.setAge(15);
//		System.out.println(per);
		
//		Vehicle vh = con.getBean(Vehicle.class);
//		vh.myVehicle();
		
	}

}
