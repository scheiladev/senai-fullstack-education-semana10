package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.TutorEntity;

import java.util.List;

public interface TutorService {

  TutorEntity criar(TutorEntity entity);

  List<TutorEntity> buscarTodos();

  TutorEntity buscarPorId(Long id);

  TutorEntity alterar(Long id, TutorEntity entity);

  void apagar(Long id);

}
