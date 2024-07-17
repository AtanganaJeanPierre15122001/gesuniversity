package com.example.gesuniversity.repository;


import com.example.gesuniversity.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {

}
