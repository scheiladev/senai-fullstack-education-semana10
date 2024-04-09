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

  @ManyToOne
  private AgendaEntity agenda;
  private String descricao;
  private String caminhoArquivo;
}
