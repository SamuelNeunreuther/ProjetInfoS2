/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinfo_s2;

/**
 *
 * @author obrutin01
 */
public class Niveau {
    private int idNiveau;
    private int nbAppart;
    private float hauteur;

    public int getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public Niveau(int idNiveau, int nbAppart, float hauteur) {
        this.idNiveau = idNiveau;
        this.nbAppart = nbAppart;
        this.hauteur = hauteur;
    }
    
    // il faut faire la methode add appart
}
