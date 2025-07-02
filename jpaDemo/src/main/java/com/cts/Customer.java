package com.cts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
	
	@Id
	private int custId;
	private String custName;
	private String email;
	private String mobile;
	private double subscription_fee;
	

}
