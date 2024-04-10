package br.com.senai.fullstack.senaifullstackeducationsemana10.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AlunoEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("alunos")
public class AlunoController {

  private final AlunoService service;

  @GetMapping
  public ResponseEntity<List<AlunoEntity>> get() {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarTodos());
  }

  @GetMapping("{id}")
  public ResponseEntity<AlunoEntity> getId(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorId(id));
  }

  @PostMapping
  public ResponseEntity<AlunoEntity> post(@RequestBody AlunoEntity entity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(entity));
  }

  @PutMapping("{id}")
  public ResponseEntity<AlunoEntity> put(@PathVariable Long id, @RequestBody AlunoEntity entity) {
    return ResponseEntity.status(HttpStatus.OK).body(service.alterar(id, entity));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.apagar(id);
    return ResponseEntity.noContent().build();
  }

}
