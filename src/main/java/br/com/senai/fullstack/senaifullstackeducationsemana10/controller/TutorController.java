package br.com.senai.fullstack.senaifullstackeducationsemana10.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.TutorEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.service.TutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("tutores")
public class TutorController {

  private final TutorService service;

  @GetMapping
  public ResponseEntity<List<TutorEntity>> get() {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarTodos());
  }

  @GetMapping("{id}")
  public ResponseEntity<TutorEntity> getId(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorId(id));
  }

  @PostMapping
  public ResponseEntity<TutorEntity> post(@RequestBody TutorEntity entity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(entity));
  }

  @PutMapping("{id}")
  public ResponseEntity<TutorEntity> put(@PathVariable Long id, @RequestBody TutorEntity entity) {
    return ResponseEntity.status(HttpStatus.OK).body(service.alterar(id, entity));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.apagar(id);
    return ResponseEntity.noContent().build();
  }

}
