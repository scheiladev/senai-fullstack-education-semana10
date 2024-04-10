package br.com.senai.fullstack.senaifullstackeducationsemana10.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {

  List<AgendaEntity> findAgendasByAlunoIdOrderByDataAsc(Long id);

  List<AgendaEntity> findAgendasByTutorIdOrderByDataAsc(Long id);
}
