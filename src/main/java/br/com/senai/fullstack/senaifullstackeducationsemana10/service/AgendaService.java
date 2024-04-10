package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;

import java.util.List;

public interface AgendaService {

  AgendaEntity criar(AgendaEntity entity);

  List<AgendaEntity> buscarTodos();

  AgendaEntity buscarPorId(Long id);

  List<AgendaEntity> buscarAlunoPorId(Long id);

  List<AgendaEntity> buscarTutorPorId(Long id);

  List<AgendaEntity> buscarAlunoAgendasAbertas(Long id);

  List<AgendaEntity> buscarTutorAgendasAbertas(Long id);

  AgendaEntity alterar(Long id, AgendaEntity entity);

  void apagar(Long id);

}
