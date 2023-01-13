package com.example.professoraluno.service;

import com.example.professoraluno.persistence.model.Aluno;
import com.example.professoraluno.persistence.model.Professor;
import com.example.professoraluno.persistence.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> salvar() {
        return professorRepository.findAll();
    }

}