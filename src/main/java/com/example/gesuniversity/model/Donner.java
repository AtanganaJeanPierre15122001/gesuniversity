package com.example.gesuniversity.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "donners")
@IdClass(DonnerId.class)
public class Donner {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_enseignant", nullable = false)
    private Enseignant enseignant;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_cours", nullable = false)
    private Cours cours;

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }
}

class DonnerId implements Serializable {
    private int enseignant;
    private int cours;

    public int getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(int enseignant) {
        this.enseignant = enseignant;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DonnerId donnerId)) return false;
        return enseignant == donnerId.enseignant && cours == donnerId.cours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enseignant, cours);
    }
}
