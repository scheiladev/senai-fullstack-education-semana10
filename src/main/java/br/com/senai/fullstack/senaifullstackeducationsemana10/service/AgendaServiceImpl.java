package br.com.senai.fullstack.senaifullstackeducationsemana10.service;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AlunoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.TutorEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.exception.NotFoundException;
import br.com.senai.fullstack.senaifullstackeducationsemana10.repository.AgendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AgendaServiceImpl implements AgendaService {

  private final AgendaRepository repository;
  private final AlunoService alunoService;
  private final TutorService tutorService;

  @Override
  public AgendaEntity criar(AgendaEntity entity) {
    entity.setId(null);

    AlunoEntity aluno = alunoService.buscarPorId(entity.getAluno().getId());
    entity.setAluno(aluno);

    TutorEntity tutor = tutorService.buscarPorId(entity.getTutor().getId());
    entity.setTutor(tutor);

    return repository.save(entity);
  }

  @Override
  public List<AgendaEntity> buscarTodos() {
    return repository.findAll();
  }

  @Override
  public AgendaEntity buscarPorId(Long id) {
    return repository.findById(id).orElseThrow(() -> new NotFoundException("Agenda não encontrada"));
  }

  @Override
  public List<AgendaEntity> buscarAlunoPorId(Long id) {
    return repository.findByAluno_Id(id);
  }

  @Override
  public List<AgendaEntity> buscarTutorPorId(Long id) {
    return repository.findByTutor_Id(id);
  }

  @Override
  public AgendaEntity alterar(Long id, AgendaEntity entity) {
    buscarPorId(id);
    entity.setId(id);
    return repository.save(entity);
  }

  @Override
  public void apagar(Long id) {
    AgendaEntity entity = buscarPorId(id);
    repository.delete(entity);
  }
}
