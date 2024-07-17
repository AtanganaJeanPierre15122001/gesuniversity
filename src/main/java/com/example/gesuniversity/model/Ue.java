package com.example.gesuniversity.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ues")
public class Ue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ue")
    private int idUe;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "code_ue")
    private String codeUe;

    public int getIdUe() {
        return idUe;
    }

    public void setIdUe(int idUe) {
        this.idUe = idUe;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }
}