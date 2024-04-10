package br.com.senai.fullstack.senaifullstackeducationsemana10.entity;

import br.com.senai.fullstack.senaifullstackeducationsemana10.enums.StatusAgendamento;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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
  private Date data;

  @Enumerated(EnumType.ORDINAL)
  private StatusAgendamento status;

  @Column(nullable = false)
  private String tema;

  private String descricao;

}
