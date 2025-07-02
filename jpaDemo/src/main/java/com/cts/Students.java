package com.cts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Students {
	@Id
	 private int id;
	 private String name;
	 private int grade;
	 @ManyToOne
	 @JoinColumn(name = "school_id")
	 private School school;
 
}
