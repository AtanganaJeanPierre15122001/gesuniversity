package com.example.gesuniversity.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courss")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cours")
    private int idCours;

    @Column(name = "titre")
    private String titre;

    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "support")
    private byte[] support;



    @Column(name = "commentaire")
    private String commentaire;


    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getSupport() {
        return support;
    }

    public void setSupport(byte[] support) {
        this.support = support;
    }




    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
