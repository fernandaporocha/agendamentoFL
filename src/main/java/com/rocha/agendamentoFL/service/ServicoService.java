package com.rocha.agendamentoFL.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocha.agendamentoFL.dao.ServicoDAO;
import com.rocha.agendamentoFL.entidade.Servico;

@Service
public class ServicoService {
	@Autowired
	private ServicoDAO servicoDAO;

	public void salvar(Servico servico) {
		servicoDAO.save(servico);
	}

	public void editar(Servico servico) {
		servicoDAO.save(servico);
		
	}

	public void deletar(Integer id) {
		servicoDAO.deleteById(id);
	}

	public List<Servico> listar() {
		List<Servico> servicos = (List<Servico>) servicoDAO.findAll();
		return servicos;
	}

	public Servico buscar(Integer id) {
		Optional<Servico> optional = servicoDAO.findById(id);
		Servico servico = optional.get();		

		return servico;
	}

}
