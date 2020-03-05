package com.rocha.agendamentoFL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocha.agendamentoFL.entidade.Servico;
import com.rocha.agendamentoFL.service.ServicoService;

@RestController
@RequestMapping(path="servico")
public class ServicoController {
	@Autowired
	private ServicoService service;
		
	@GetMapping(path="/{id}")
	public Servico buscar(@PathVariable Integer id) {
		Servico servico = service.buscar(id);
		return servico;
	}
	
	@GetMapping()
	public List<Servico> listar() {
		List<Servico> servico = service.listar();
		return servico;
	}

	@PostMapping()
	public void salvar(@RequestBody Servico servico) {
		service.salvar(servico);
	}

	@PutMapping()
	public void editar(@RequestBody Servico servico) {
		service.editar(servico);
	}

	@DeleteMapping(path="/{id}")
	public void deletar(@PathVariable Integer id) {
		service.deletar(id);
	}

}
