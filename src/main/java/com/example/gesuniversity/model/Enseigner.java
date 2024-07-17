package com.example.gesuniversity.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "enseigners")
@IdClass(EnseignerId.class)
public class Enseigner {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_enseignant", nullable = false)
    private Enseignant enseignant;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_ue", nullable = false)
    private Ue ue;

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Ue getUe() {
        return ue;
    }

    public void setUe(Ue ue) {
        this.ue = ue;
    }
}

class EnseignerId implements Serializable {
    private int enseignant;
    private int ue;

    public int getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(int enseignant) {
        this.enseignant = enseignant;
    }

    public int getUe() {
        return ue;
    }

    public void setUe(int ue) {
        this.ue = ue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnseignerId that)) return false;
        return enseignant == that.enseignant && ue == that.ue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enseignant, ue);
    }
}
