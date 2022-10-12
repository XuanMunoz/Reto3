package com.g15.jpa.controller;

import com.g15.jpa.service.ScoreService;

import com.g15.jpa.entity.Score;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Score")
@CrossOrigin(origins = "*")

public class ScoreController {
    @Autowired
    private ScoreService ScoreService;
    
    //Metodo para consultar todos los registros (Capa de controlador)
    @GetMapping("/all")
    public List<Score> getScore(){
            return ScoreService.getScore();
    }
    
    @PostMapping("/save")
    //Metodo para insertar (Capa de controlador)
    public ResponseEntity insertScore(@RequestBody Score score){
      ScoreService.insertScore(score);
      return ResponseEntity.status(201).build(); 
    }
}
