package com.example.projetc_service.service;

import com.example.projetc_service.model.Projets;

import java.util.List;

public interface IprojectService {
 List<Projets> getAllProjets();
 Projets addProject(Projets projet);
 Projets editeProject(Long id , Projets projet);
 void deleteProject(Long id);


}
