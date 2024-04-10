package br.com.senai.fullstack.senaifullstackeducationsemana10.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.MaterialEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.service.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("materiais")
public class MaterialController {

  private final MaterialService service;

  @GetMapping
  public ResponseEntity<List<MaterialEntity>> get() {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarTodos());
  }

  @GetMapping("{id}")
  public ResponseEntity<MaterialEntity> getId(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorId(id));
  }

  @PostMapping
  public ResponseEntity<MaterialEntity> post(@RequestBody MaterialEntity entity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(entity));
  }

  @PutMapping("{id}")
  public ResponseEntity<MaterialEntity> put(@PathVariable Long id, @RequestBody MaterialEntity entity) {
    return ResponseEntity.status(HttpStatus.OK).body(service.alterar(id, entity));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.apagar(id);
    return ResponseEntity.noContent().build();
  }

}
