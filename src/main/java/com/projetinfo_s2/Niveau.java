
package com.projetinfo_s2;

import java.util.ArrayList;


public class Niveau {
    private int idNiveau;
    private int nbAppart;
    private float hauteur;
    private ArrayList<Appartement> appartList = new ArrayList<>();
    
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
        this.appartList = null;
    }
   
public void addAppart(Appartement appartement){
        this.appartList.add(appartement);
        this.nbAppart++;
    }
}
