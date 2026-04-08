/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinfo_s2;

/**
 *
 * @author obrutin01
 */
public class Ouverture {
    private Mur mur;
    private float largeur;
    private float longueur;
    private float hauteur;
    private String materiau;

    public Mur getMur() {
        return mur;
    }

    public void setMur(Mur mur) {
        this.mur = mur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public String getMateriau() {
        return materiau;
    }

    public void setMateriau(String materiau) {
        this.materiau = materiau;
    }

    public Ouverture(Mur mur, float largeur, float longueur, float hauteur, String materiau) {
        this.mur = mur;
        this.largeur = largeur;
        this.longueur = longueur;
        this.hauteur = hauteur;
        this.materiau = materiau;
    }
    
    
}
