package com.example.gesuniversity.model;

import jakarta.persistence.*;

@Entity
@Table(name = "niveau")
public class Niveau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_niveau")
    private int idNiveau;

    @Column(name = "nom_niv")
    private String nomNiv;

    @Column(name = "faculte")
    private String faculte;

    public int getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }

    public String getNomNiv() {
        return nomNiv;
    }

    public void setNomNiv(String nomNiv) {
        this.nomNiv = nomNiv;
    }

    public String getFaculte() {
        return faculte;
    }

    public void setFaculte(String faculte) {
        this.faculte = faculte;
    }
}