package com.unla.proyectoprueba.models;

import lombok.Getter;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DegreeModel {
	private int id;
	private String name; //tuve que poner public pero es private
	
	@Size(min=3, max=12)
	private String institution;
	
	@Min(3)
	private int year;
	
	

	public DegreeModel(int id, String name, String institution, int year) {
		super();
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.year = year;
	} 
	
	
}
