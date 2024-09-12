package com.example.projetos.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NotFound;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_projeto")
@Data
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotFound
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @NotFound
    @Column(name = "descricao", length = 255)
    private String descricao;

    @NotFound
    @Column(name = "data_inicio", nullable = false)
    private Date dataInicio;

    @NotFound
    @Column(name = "data_fim")
    private Date dataFim;
}
