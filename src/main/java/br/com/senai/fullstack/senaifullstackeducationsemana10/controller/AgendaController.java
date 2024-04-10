package br.com.senai.fullstack.senaifullstackeducationsemana10.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.service.AgendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("agendas")
public class AgendaController {

  private final AgendaService service;

  @GetMapping
  public ResponseEntity<List<AgendaEntity>> get() {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarTodos());
  }

  @GetMapping("{id}")
  public ResponseEntity<AgendaEntity> getId(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarPorId(id));
  }

  @PostMapping
  public ResponseEntity<AgendaEntity> post(@RequestBody AgendaEntity entity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(entity));
  }

  @PutMapping("{id}")
  public ResponseEntity<AgendaEntity> put(@PathVariable Long id, @RequestBody AgendaEntity entity) {
    return ResponseEntity.status(HttpStatus.OK).body(service.alterar(id, entity));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.apagar(id);
    return ResponseEntity.noContent().build();
  }

}
