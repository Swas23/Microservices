package com.cts;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient {
    @Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", ailment=" + ailment + "]";
	}
	@Id
    private int id;
    private String name;
    private String ailment;
    @ManyToMany(mappedBy = "patients")
    private Set<Doctor> doctors;
}
