package com.cts;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Car {
	@Id
	private int id;
	private String model;
	private String manufacturer;
	
	
//	@OneToOne(fetch = FetchType.LAZY)  only primary info will be fetched
	// bydefault it will be eagerFetching
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="engine_id")
	private Engine engine;

}
