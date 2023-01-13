package com.example.professoraluno.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
//    @JsonIgnore
//    @OneToMany(mappedBy = "professor")
//    private List<Aluno> alunos;

//    @ManyToOne
//    @JoinColumn(name = "coordenador_id", nullable = true)
//    private Coordenador coordenador;
//
//    @ManyToOne
//    @JoinColumn(name = "diretor_id", nullable = true)
//    private Diretor diretor;

    public Professor() {
    }

    public Professor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
