
package com.cts;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class School {
	@Id
	private int id;
	private String name;
	private String location;
	@OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
	private List<Students> students=new ArrayList<>();
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", location=" + location + "]";
	}


 
 
}