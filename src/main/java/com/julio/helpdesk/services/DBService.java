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
		
		Tecnico tec2 = new Tecnico(null, "Lucas Rodrigues", "06352495614", "lucas@mail.com", "123");
		tec2.addPerfis(Perfil.ADMIN);
		
		Tecnico tec3 = new Tecnico(null, "Rodrigo Souza", "06352495695", "rodrigo@mail.com", "123");
		tec2.addPerfis(Perfil.ADMIN);
		
		Tecnico tec4 = new Tecnico(null, "Roberval Rodrigues", "06352495619", "roberval@mail.com", "123");
		tec2.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Roberto Ribeiro", "80527954796", "roberto@mail.com", "123");
		Cliente cli3 = new Cliente(null, "Rogerio Fonseca", "90527954780", "rogerio@mail.com", "123");
		Cliente cli4 = new Cliente(null, "Thomas Oliveira", "80527674780", "thomas@mail.com", "123");
		
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.BAIXA, Status.ABERTO, "Chamado 02", "Segundo chamado", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.ALTA, Status.ENCERRADO, "Chamado 03", "Terceiro chamado", tec3, cli3);
		Chamado c4 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 04", "Quarto chamado", tec4, cli4);
		
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		clienteRepository.saveAll(Arrays.asList(cli2));
		chamadoRepository.saveAll(Arrays.asList(c2));
		
		tecnicoRepository.saveAll(Arrays.asList(tec3));
		clienteRepository.saveAll(Arrays.asList(cli3));
		chamadoRepository.saveAll(Arrays.asList(c3));
		
		tecnicoRepository.saveAll(Arrays.asList(tec4));
		clienteRepository.saveAll(Arrays.asList(cli4));
		chamadoRepository.saveAll(Arrays.asList(c4));
		
	}

}
