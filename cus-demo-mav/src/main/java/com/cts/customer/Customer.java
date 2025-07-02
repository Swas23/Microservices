package com.cts.customer;
import java.sql.Date;
import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
	private int custId;
	@NotNull
	@Pattern(regexp="[A-Za-z\s]{5,}")
	private String custName;
	@NotEmpty
	@Pattern(regexp="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
	private String email;
	@Pattern(regexp="^[6-9]\\d{9}$")
	private String mobile;
	private double subscriptionFee;
	private LocalDate doj;
}
