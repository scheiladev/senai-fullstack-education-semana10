package br.com.senai.fullstack.senaifullstackeducationsemana10.controller;

import br.com.senai.fullstack.senaifullstackeducationsemana10.entity.AgendaEntity;
import br.com.senai.fullstack.senaifullstackeducationsemana10.service.AgendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("agendamentos")
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

  @GetMapping("aluno-id/{id}")
  public ResponseEntity<List<AgendaEntity>> getAlunoId(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarAlunoPorId(id));
  }

  @GetMapping("tutor-id/{id}")
  public ResponseEntity<List<AgendaEntity>> getTutorId(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarTutorPorId(id));
  }

  @GetMapping("/alunos/{id}/agendas-abertas")
  public ResponseEntity<List<AgendaEntity>> getAlunoAgendasFuturas(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarAlunoAgendasAbertas(id));
  }

  @GetMapping("/tutores/{id}/agendas-abertas")
  public ResponseEntity<List<AgendaEntity>> getTutorAgendasfuturas(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(service.buscarTutorAgendasAbertas(id));
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
