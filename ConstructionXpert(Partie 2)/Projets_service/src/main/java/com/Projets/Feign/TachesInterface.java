package com.Projets.Feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "tache-service", url = "http://localhost:8082/api/Taches")
public interface TachesInterface {

    @DeleteMapping("/projet/{idProjet}")
    void deleteTachesByProjetId(@PathVariable("idProjet") Long idProjet);
}

