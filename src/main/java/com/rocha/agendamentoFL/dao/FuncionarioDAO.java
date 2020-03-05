package com.rocha.agendamentoFL.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rocha.agendamentoFL.entidade.Funcionario;

@Repository
public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer>{

}