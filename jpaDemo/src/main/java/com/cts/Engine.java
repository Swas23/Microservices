package com.cts;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Engine {
	@Id
	private int id;
	private String engineNumber;
	private String type;
	private String horsePower;
	@OneToOne
	private Car car;

}
