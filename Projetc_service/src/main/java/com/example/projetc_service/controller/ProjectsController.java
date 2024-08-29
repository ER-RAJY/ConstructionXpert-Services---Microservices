package com.example.projetc_service.controller;

import com.example.projetc_service.model.Projets;
import com.example.projetc_service.service.IprojectService;
import com.example.projetc_service.service.ProjetsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/projets")
public class ProjectsController implements IprojetsController {
    @Autowired
    IprojectService projectService;

    @Override
    public Projets addProjet(Projets projet) {
        return projectService.addProject(projet);
    }

    @Override
    public List<Projets> getAllProjets() {
        return projectService.getAllProjets();
    }

    @Override
    public Projets updateProjet( Long id, Projets projet) {
        return projectService.editeProject(id,projet);
    }

    @Override
    public void deleteProjet( Long id) {
        projectService.deleteProject(id);
    }
}
