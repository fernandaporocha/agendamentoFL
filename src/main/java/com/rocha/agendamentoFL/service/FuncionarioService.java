package com.rocha.agendamentoFL.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocha.agendamentoFL.dao.FuncionarioDAO;
import com.rocha.agendamentoFL.entidade.Funcionario;

@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioDAO funcionarioDAO;

	public void salvar(Funcionario funcionario) {
		funcionarioDAO.save(funcionario);
	}

	public void editar(Funcionario funcionario) {
		funcionarioDAO.save(funcionario);
		
	}

	public void deletar(Integer id) {
		funcionarioDAO.deleteById(id);
	}

	public List<Funcionario> listar() {
		List<Funcionario> funcionarios = (List<Funcionario>) funcionarioDAO.findAll();
		return funcionarios;
	}

	public Funcionario buscar(Integer id) {
		Optional<Funcionario> optional = funcionarioDAO.findById(id);
		Funcionario funcionario = optional.get();		

		return funcionario;
	}
}
