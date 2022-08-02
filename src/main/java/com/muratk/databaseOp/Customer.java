package com.muratk.databaseOp;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Long id;
	private int age;
	private String name;
	
	public Customer(){}
	
	public Customer(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
}
