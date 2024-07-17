package com.example.gesuniversity.repository;


import com.example.gesuniversity.model.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant,Long> {
    public Enseignant findByEmail(String email);
}
