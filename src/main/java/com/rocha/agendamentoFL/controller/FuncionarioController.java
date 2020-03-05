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

import com.rocha.agendamentoFL.entidade.Funcionario;
import com.rocha.agendamentoFL.service.FuncionarioService;

@RestController
@RequestMapping(path="funcionario")
public class FuncionarioController {
	@Autowired
	private FuncionarioService service;
		
	@GetMapping(path="/{id}")
	public Funcionario buscar(@PathVariable Integer id) {
		Funcionario funcionario = service.buscar(id);
		return funcionario;
	}
	
	@GetMapping()
	public List<Funcionario> listar() {
		List<Funcionario> funcionario = service.listar();
		return funcionario;
	}

	@PostMapping()
	public void salvar(@RequestBody Funcionario funcionario) {
		service.salvar(funcionario);
	}

	@PutMapping()
	public void editar(@RequestBody Funcionario funcionario) {
		service.editar(funcionario);
	}

	@DeleteMapping(path="/{id}")
	public void deletar(@PathVariable Integer id) {
		service.deletar(id);
	}

}
