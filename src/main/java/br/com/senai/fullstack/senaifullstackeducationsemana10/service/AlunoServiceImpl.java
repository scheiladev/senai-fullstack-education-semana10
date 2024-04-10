package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AlunoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.exception.NotFoundException;
import br.com.senai.fullstack.senaifullstackeducationsemana10.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AlunoServiceImpl implements AlunoService {

  private final AlunoRepository repository;

  @Override
  public AlunoEntity criar(AlunoEntity entity) {
    entity.setId(null);
    return repository.save(entity);
  }

  @Override
  public List<AlunoEntity> buscarTodos() {
    return repository.findAll();
  }

  @Override
  public AlunoEntity buscarPorId(Long id) {
    return repository.findById(id).orElseThrow(() -> new NotFoundException("Usuário não encontrado"));
  }

  @Override
  public AlunoEntity alterar(Long id, AlunoEntity entity) {
    buscarPorId(id);
    entity.setId(id);
    return repository.save(entity);
  }

  @Override
  public void apagar(Long id) {
    AlunoEntity entity = buscarPorId(id);
    repository.delete(entity);
  }
}
