package com.example.professoraluno.service;

import com.example.professoraluno.persistence.model.Aluno;
import com.example.professoraluno.persistence.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> salvar() {

        return alunoRepository.findAll();
    }
}
