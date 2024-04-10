package br.com.senai.fullstack.senaifullstackeducationsemana10.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.TutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<TutorEntity, Long> {
}
