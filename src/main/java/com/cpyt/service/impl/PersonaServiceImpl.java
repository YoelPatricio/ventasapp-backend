package com.cpyt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpyt.dao.IPersonaDAO;
import com.cpyt.model.Persona;
import com.cpyt.service.IPersonaService;
@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDAO dao;
	
	@Override
	public Persona registrar(Persona persona) {
		return dao.save(persona);
	}

	@Override
	public void modificar(Persona persona) {
		dao.save(persona);
		
	}

	@Override
	public void eliminar(int idPersona) {
		dao.delete(idPersona);
		
	}

	@Override
	public Persona listarId(int idPersona) {
		return dao.findOne(idPersona);
	}

	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

}
