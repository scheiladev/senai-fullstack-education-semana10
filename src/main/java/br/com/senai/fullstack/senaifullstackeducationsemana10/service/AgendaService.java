package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;

import java.util.List;

public interface AgendaService {

  AgendaEntity criar(AgendaEntity entity);

  List<AgendaEntity> buscarTodos();

  AgendaEntity buscarPorId(Long id);

  AgendaEntity alterar(Long id, AgendaEntity entity);

  void apagar(Long id);

}
