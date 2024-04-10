package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.MaterialEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.exception.NotFoundException;
import br.com.senai.fullstack.senaifullstackeducationsemana10.repository.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MaterialServiceImpl implements MaterialService {

  private final MaterialRepository repository;
  private final AgendaService agendaService;

  @Override
  public MaterialEntity criar(MaterialEntity entity) {
    entity.setId(null);

    AgendaEntity agenda = agendaService.buscarPorId(entity.getAgenda().getId());
    entity.setAgenda(agenda);

    return repository.save(entity);
  }

  @Override
  public List<MaterialEntity> buscarTodos() {
    return repository.findAll();
  }

  @Override
  public MaterialEntity buscarPorId(Long id) {
    return repository.findById(id).orElseThrow(() -> new NotFoundException("Material não encontrado"));
  }

  @Override
  public MaterialEntity alterar(Long id, MaterialEntity entity) {
    buscarPorId(id);
    entity.setId(id);
    return repository.save(entity);
  }

  @Override
  public void apagar(Long id) {
    MaterialEntity entity = buscarPorId(id);
    repository.delete(entity);
  }
}
