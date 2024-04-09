package br.com.senai.fullstack.senaifullstackeducationsemana10.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "agenda")
public class AgendaEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private AlunoEntity aluno;
  @ManyToOne
  private TutorEntity tutor;
  private LocalDate data;
  private String status;
  private String tema;
  private String descricao;

}
