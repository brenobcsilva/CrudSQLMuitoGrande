package com.example.professoraluno.controller;

import com.example.professoraluno.persistence.model.Aluno;
import com.example.professoraluno.persistence.repository.AlunoRepository;
import com.example.professoraluno.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlunoController {

    private final AlunoService alunoService;
    private final AlunoRepository alunoRepository;


    public AlunoController(AlunoService alunoService, AlunoRepository alunoRepository) {
        this.alunoService = alunoService;
        this.alunoRepository = alunoRepository;
    }

    @PostMapping("/cadastrarAluno")
    public ResponseEntity<Aluno> salvarAluno(@RequestBody Aluno aluno){

        if(aluno.getNome().equals("Breno")){
            aluno.setNome("Testa");
            alunoRepository.save(aluno);
        }
        return new ResponseEntity<>(alunoRepository.save(aluno),HttpStatus.CREATED);
    }

    @PutMapping("/AlterarAluno")
    public ResponseEntity<Aluno> alterarAluno(@RequestBody Aluno aluno){

        if(aluno.getNome().equals("Breno")){
            aluno.setNome("Testa");
            alunoRepository.save(aluno);
        }
        return new ResponseEntity<>(alunoRepository.save(aluno),HttpStatus.CREATED);
    }


    @GetMapping("/mostrarAluno")
    public ResponseEntity<?> mostrarAluno(){
        return new ResponseEntity<>(alunoService.salvar(), HttpStatus.OK);
    }
}
