package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AlunoEntity;

import java.util.List;

public interface AlunoService {

  AlunoEntity criar(AlunoEntity entity);

  List<AlunoEntity> buscarTodos();

  AlunoEntity buscarPorId(Long id);

  AlunoEntity alterar(Long id, AlunoEntity entity);

  void apagar(Long id);

}
