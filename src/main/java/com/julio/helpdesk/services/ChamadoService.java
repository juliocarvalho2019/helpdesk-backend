package com.julio.helpdesk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.helpdesk.domain.Chamado;
import com.julio.helpdesk.repositories.ChamadoRepository;
import com.julio.helpdesk.services.exceptions.ObjectnotFoundException;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class ChamadoService {
	
	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		java.util.Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectnotFoundException("Objeto não encontrado! ID: " + id));
		
	}

	public List<Chamado> findAll() {
		
		return repository.findAll();
	}

}
