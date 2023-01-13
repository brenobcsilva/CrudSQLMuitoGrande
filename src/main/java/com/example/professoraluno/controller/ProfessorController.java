package com.example.professoraluno.controller;

import com.example.professoraluno.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


//    @GetMapping("/mostrarProfessor")
//    public ResponseEntity<?> mostrarProfessor(){
//        return new ResponseEntity<>(professorService.salvar(), HttpStatus.CREATED);
//    }
}
