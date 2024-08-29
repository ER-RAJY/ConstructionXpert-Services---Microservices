package com.example.projetc_service.service;

import com.example.projetc_service.model.Projets;
import com.example.projetc_service.repository.IprojectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProjetsImpl implements IprojectService{
    private IprojectRepository projectRepository;

    public ProjetsImpl(IprojectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @Override
    public List<Projets> getAllProjets() {
        return projectRepository.findAll();
    }

    @Override
    public Projets addProject(Projets projet) {
        return projectRepository.save(projet);
    }

    @Override
    public Projets editeProject(Long id, Projets projet) {
         projectRepository.findById(id);
         Projets projets = new Projets();
         projets.setId(id);
         projets.setNom(projet.getNom());
         projets.setBudget(projet.getBudget());
         projets.setDescription(projet.getDescription());
         projets.setDate_fin(projet.getDate_fin());
         projets.setDate_debut(LocalDate.now());
         return projectRepository.save(projet);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
