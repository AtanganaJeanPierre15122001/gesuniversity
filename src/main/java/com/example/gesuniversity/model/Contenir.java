package com.example.gesuniversity.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "contenirs")
@IdClass(ContenirId.class)
public class Contenir {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_niveau", nullable = false)
    private Niveau niveau;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_filiere", nullable = false)
    private Filiere filiere;

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}

class ContenirId implements Serializable {
    private int niveau;
    private int filiere;

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getFiliere() {
        return filiere;
    }

    public void setFiliere(int filiere) {
        this.filiere = filiere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContenirId that)) return false;
        return niveau == that.niveau && filiere == that.filiere;
    }

    @Override
    public int hashCode() {
        return Objects.hash(niveau, filiere);
    }
}
