package br.com.senai.fullstack.senaifullstackeducationsemana10.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<AgendaEntity, Long> {
}
