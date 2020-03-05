package com.rocha.agendamentoFL.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rocha.agendamentoFL.entidade.Servico;

@Repository
public interface ServicoDAO extends CrudRepository<Servico, Integer>{

}
