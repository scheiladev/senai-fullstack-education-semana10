package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.MaterialEntity;

import java.util.List;

public interface MaterialService {

  MaterialEntity criar(MaterialEntity entity);

  List<MaterialEntity> buscarTodos();

  MaterialEntity buscarPorId(Long id);

  MaterialEntity alterar(Long id, MaterialEntity entity);

  void apagar(Long id);

}
