package br.com.senai.fullstack.senaifullstackeducationsemana10.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "agenda")
public class AgendaEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(optional = false)
  @JoinColumn(name = "aluno_id", nullable = false)
  private AlunoEntity aluno;

  @ManyToOne(optional = false)
  @JoinColumn(name = "tutor_id", nullable = false)
  private TutorEntity tutor;

  @Column(nullable = false)
  private LocalDate data;

  @Column(nullable = false)
  private String status;

  @Column(nullable = false)
  private String tema;

  private String descricao;

}
