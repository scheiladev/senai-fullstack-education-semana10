package br.com.senai.fullstack.senaifullstackeducationsemana10.repository;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {
}
