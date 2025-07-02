package com.cts;

import java.util.HashSet;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-pu");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	//Add a customer
    	
//    	Customer cus = new Customer(5, "Shital", "Shital@gmail.com", "7776666756", 30000);	
//    	em.getTransaction().begin();
//    	em.persist(cus);
//    	em.getTransaction().commit();
//    	System.out.println("User Saved");
    	
    	
    // Display specific customer
    	
//    	var result= em.find(Customer.class, 3);
//    	System.out.println(result);
    
    	
    //Update a customer 
    	
//    	em.getTransaction().begin();
//    	var result = em.find(Customer.class, 2);
//    	System.out.println(result);
//    	
//    	result.setCustName("K L Rahul");
//    	em.getTransaction().commit();
//    	
//    	var res = em.find(Customer.class, 2);
//    	System.out.println("Updated customer : "+res);
    	
    	
    //Display all customers 
    	
//    	TypedQuery<Customer> qu = em.createQuery("from Customer",Customer.class);
//    	
//    	List<Customer> cus = qu.getResultList();
//    	
//    	cus.forEach(System.out::println);
    	
    	
    // Delete Customer
    	
//    	Customer cus = new Customer();
//    	
//    	var result = em.find(Customer.class, 1);
//    	
//    	em.getTransaction().begin();
//    	
//    	em.remove(result);
//    	
//    	em.getTransaction().commit();
    	
    	
    	
    	
    	//cars
    	
//    	Engine eng = new Engine(1, "E100", "petrol", "255");
//    	Car car = new Car(1, "3 series", "BMW", eng);
//    	
//    	em.getTransaction().begin();
//    	
//    	em.persist(car);
//    	
//    	em.getTransaction().commit();
    	
    	//car name and engine details
   	
//    	Car car = em.find(Car.class, 1);
//    	
//    	System.out.println(car.getModel());
//    	
//    	System.out.println("..................................................");
//    	
//    	System.out.println(car.getEngine().getType()); 
    	
    	
    	
    	//school and students
//    	
      School sch=new School();
      sch.setId(1);
      sch.setName("St. Thomas School");
      sch.setLocation("Ratnagiri ,Maharashtra, India");
      Students stu=new Students(1,"Swasthik",8,sch);
      Students stu1=new Students(2,"Kartthik",8,sch);
      Students stu2=new Students(3,"Prathamesh",9,sch);
      Students stu3=new Students(4,"Rahul",10,sch);
      sch.getStudents().add(stu);
      sch.getStudents().add(stu1);
      sch.getStudents().add(stu2);
      sch.getStudents().add(stu3);
      em.getTransaction().begin();
      em.persist(sch);
      em.getTransaction().commit();
      
      //get school and list of students
      
      School s=em.find(School.class,1);
      System.out.println(s.getName());
      s.getStudents().forEach(System.out::println);
      
//     Retrieve a Student and print their School name
      
      Students se=em.find(Students.class,3);
      System.out.println(se.getName());
      School school=se.getSchool();
      System.out.println(school.getName());
//    
//    
    // Doctor and Patient
    
    
// // Create Doctors
//    Doctor doctor1 = new Doctor(1, "Dr. Deepa", "Cardiology", new HashSet<>());
//    Doctor doctor2 = new Doctor(2, "Dr. Anushree ", "Neurology", new HashSet<>());
//
//    // Create Patients
//    Patient patient1 = new Patient(1, "Soukhya", "Heart Disease", new HashSet<>());
//    Patient patient2 = new Patient(2, "Laxmi", "Migraine", new HashSet<>());
//    Patient patient3 = new Patient(3, "Kalpana", "Diabetes", new HashSet<>());
//
//    // Associate Doctors with Patients
//    doctor1.getPatients().add(patient1);
//    doctor1.getPatients().add(patient2);
//    doctor2.getPatients().add(patient2);
//    doctor2.getPatients().add(patient3);
//
//    // Associate Patients with Doctors
//    patient1.getDoctors().add(doctor1);
//    patient2.getDoctors().add(doctor1);
//    patient2.getDoctors().add(doctor2);
//    patient3.getDoctors().add(doctor2);
//
//    em.getTransaction().begin();
//    em.persist(doctor1);
//    em.persist(doctor2);
//    em.persist(patient1);
//    em.persist(patient2);
//    em.persist(patient3);
//    em.getTransaction().commit();
//
//    // Retrieve all Patients for a Doctor
//    Doctor d = em.find(Doctor.class, 1); // Change the ID as needed
//    if (d != null) {
//        System.out.println("Doctor: " + d.getName());
//        System.out.println("Patients:");
//        d.getPatients().forEach(patient -> System.out.println(patient.getName()));
//    } else {
//        System.out.println("Doctor not found.");
//    }
//
//    // Retrieve all Doctors for a Patient
//    Patient p = em.find(Patient.class, 2); // Change the ID as needed
//    if (p != null) {
//        System.out.println("Patient: " + p.getName());
//        System.out.println("Doctors:");
//        p.getDoctors().forEach(doctor -> System.out.println(doctor.getName()));
//    } else {
//        System.out.println("Patient not found.");
//    }
}
}
