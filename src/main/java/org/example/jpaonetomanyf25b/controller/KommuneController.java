package org.example.jpaonetomanyf25b.controller;

import org.example.jpaonetomanyf25b.model.Kommune;
import org.example.jpaonetomanyf25b.model.Region;
import org.example.jpaonetomanyf25b.repository.KommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
public class KommuneController {

    @Autowired
    KommuneRepository KommuneRepository;

    @GetMapping("/kommuner")
    public List<Kommune> getKommuner(){
        return KommuneRepository.findAll ();
    }

    @PostMapping("/kommune")
    public ResponseEntity<Kommune> postKommune(@RequestBody Kommune kommune){
        Kommune savedKommune = KommuneRepository.save(kommune);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedKommune);
    }
}
