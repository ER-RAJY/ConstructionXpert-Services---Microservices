package com.example.projetc_service.repository;

import com.example.projetc_service.model.Projets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IprojectRepository extends JpaRepository<Projets,Long> {

}
