package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.TutorEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.exception.NotFoundException;
import br.com.senai.fullstack.senaifullstackeducationsemana10.repository.TutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TutorServiceImpl implements TutorService {

  private final TutorRepository repository;

  @Override
  public TutorEntity criar(TutorEntity entity) {
    entity.setId(null);
    return repository.save(entity);
  }

  @Override
  public List<TutorEntity> buscarTodos() {
    return repository.findAll();
  }

  @Override
  public TutorEntity buscarPorId(Long id) {
    return repository.findById(id).orElseThrow(() -> new NotFoundException("Tutor não encontrado"));
  }

  @Override
  public TutorEntity alterar(Long id, TutorEntity entity) {
    buscarPorId(id);
    entity.setId(id);
    return repository.save(entity);
  }

  @Override
  public void apagar(Long id) {
    TutorEntity entity = buscarPorId(id);
    repository.delete(entity);
  }
}
