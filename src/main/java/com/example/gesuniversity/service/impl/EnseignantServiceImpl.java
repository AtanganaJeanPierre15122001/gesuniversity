package com.example.gesuniversity.service.impl;

import com.example.gesuniversity.model.Enseignant;
import com.example.gesuniversity.repository.EnseignantRepository;
import com.example.gesuniversity.service.Serv.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class EnseignantServiceImpl implements EnseignantService {


    @Autowired
    private EnseignantRepository enseignantRepository;


    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void saveEnseignant(Enseignant enseignant) {
        enseignant.setPassword(passwordEncoder.encode(enseignant.getPassword()));
        this.enseignantRepository.save(enseignant);
    }
}
