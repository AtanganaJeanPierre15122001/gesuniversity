package com.example.gesuniversity.service.Serv;

import com.example.gesuniversity.model.Cours;

import java.util.List;



public interface CoursService {
    List<Cours> getAllCours();

    void saveCours(Cours cours);

    Cours getCoursById(Long idCours);

    void  deleteCoursById(Long idCours);
}
