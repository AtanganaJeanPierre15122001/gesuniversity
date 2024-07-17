package com.example.gesuniversity.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "participers")
@IdClass(ParticiperId.class)
public class Participer {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_cours", nullable = false)
    private Cours cours;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_etudiant", nullable = false)
    private Etudiant etudiant;

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}

class ParticiperId implements Serializable {
    private int cours;
    private int etudiant;

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public int getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(int etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParticiperId that)) return false;
        return cours == that.cours && etudiant == that.etudiant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cours, etudiant);
    }
}