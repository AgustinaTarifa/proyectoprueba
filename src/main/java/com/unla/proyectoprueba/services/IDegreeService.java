package com.unla.proyectoprueba.services;

import java.util.List;


import com.unla.proyectoprueba.entities.Degree;
import com.unla.proyectoprueba.models.DegreeModel;

public interface IDegreeService {
	
	public List<Degree> getAll();
	
	public DegreeModel insertOrUpDATE(DegreeModel degreeModel);
	
	public boolean remove(int id);
}
