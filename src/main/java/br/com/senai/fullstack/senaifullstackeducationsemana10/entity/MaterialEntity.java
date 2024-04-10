package br.com.senai.fullstack.senaifullstackeducationsemana10.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "material")
public class MaterialEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(optional = false)
  @JoinColumn(name = "agenda_id", nullable = false)
  private AgendaEntity agenda;

  @Column(nullable = false)
  private String descricao;

  @Column(nullable = false)
  private String caminhoArquivo;
}
