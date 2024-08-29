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
        Projets existingProjet = projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        existingProjet.setNom(projet.getNom());
        existingProjet.setBudget(projet.getBudget());
        existingProjet.setDescription(projet.getDescription());
        existingProjet.setDate_fin(projet.getDate_fin());
        existingProjet.setDate_debut(projet.getDate_debut());

        return projectRepository.save(existingProjet);
    }



    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
