package com.example.gesuniversity.service.impl;

import com.example.gesuniversity.model.Cours;
import com.example.gesuniversity.repository.CoursRepository;
import com.example.gesuniversity.service.Serv.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CoursServiceImpl implements CoursService {


    @Autowired
    private CoursRepository coursRepository;
    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public void saveCours(Cours cours) {
        this.coursRepository.save(cours);
    }

    @Override
    public Cours getCoursById(Long idCours) {
        Optional<Cours> optional = coursRepository.findById(idCours);
        Cours cours = null;
        if (optional.isPresent()) {
            cours = optional.get();
        } else {
            throw new RuntimeException(" Cours not found for id :: " + idCours);
        }
        return cours;
    }

    @Override
    public void deleteCoursById(Long idCours) {
        this.coursRepository.deleteById(idCours);
    }
}
