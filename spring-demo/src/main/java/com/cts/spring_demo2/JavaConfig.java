package com.cts.spring_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.cts.spring_demo2")

public class JavaConfig {
	
	@Bean
	@Primary
	public Vehicle getVehicle1() {
		return new Vehicle ("BMW");	
	}
	
	@Bean
//	@Primary
	public Vehicle getVehicle2() {
		return new Vehicle("Lamborgini");
		
	}
	
//	@Bean
//	Person getPerson() {
//		Vehicle v = new Vehicle("BMW");
//		Person p = new Person();
//		p.setName("Swas");
//		p.setAge(22);
//		p.setVehicle(v);
//		return p;
//	}
//	@Bean
//	@Primary
//	Person getPerson1() {
//		Vehicle v = new Vehicle("Lambo");
//		Person p = new Person();
//		p.setName("Prathik");
//		p.setAge(15);
//		p.setVehicle(v);
//		return p;
//		
//		
//	}
}

