package com.julio.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julio.helpdesk.domain.Chamado;
import com.julio.helpdesk.domain.Cliente;
import com.julio.helpdesk.domain.Tecnico;
import com.julio.helpdesk.domain.enums.Perfil;
import com.julio.helpdesk.domain.enums.Prioridade;
import com.julio.helpdesk.domain.enums.Status;
import com.julio.helpdesk.repositories.ChamadoRepository;
import com.julio.helpdesk.repositories.ClienteRepository;
import com.julio.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "06562597609", "valdir@mail.com", "123");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}
