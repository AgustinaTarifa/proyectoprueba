package com.unla.proyectoprueba.implementation;

import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.proyectoprueba.entities.Degree;
import com.unla.proyectoprueba.models.DegreeModel;
import com.unla.proyectoprueba.respositories.IDegreeRepository;
import com.unla.proyectoprueba.services.IDegreeService;

@Service("degreeService")
public class DegreeService implements IDegreeService {
	
	@Autowired
	@Qualifier("degreeRepository")
	private IDegreeRepository degreeRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<Degree> getAll() {
		return  degreeRepository.findAll();
	}

	@Override
	public DegreeModel insertOrUpDATE(DegreeModel degreeModel) {
		Degree degree = degreeRepository.save(modelMapper.map(degreeModel, Degree.class));
		return modelMapper.map(degree, DegreeModel.class);
	}

	@Override
	public boolean remove(int id) {
		try {
			degreeRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	
	
	
}
