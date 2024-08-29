package com.example.projetc_service.controller;

import com.example.projetc_service.model.Projets;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IprojetsController {
    @PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Projets addProjet(@RequestBody Projets projet);
    @GetMapping(value = "/all")
    List<Projets> getAllProjets();
    @PutMapping(value = "/edit/{id}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Projets updateProjet(@PathVariable Long id,@RequestBody Projets projet);
    @DeleteMapping(value = "/delete/{id}")
    void deleteProjet(@PathVariable Long id);

}
