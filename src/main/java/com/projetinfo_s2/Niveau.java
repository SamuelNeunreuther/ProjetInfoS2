
package com.projetinfo_s2;

import java.util.ArrayList;


public class Niveau {
    private int idNiveau;
    private int nbAppart;
    private float hauteur;
    private ArrayList<Appartement> appartList = new ArrayList<>();
    
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
    
    public String[] afficher(){
        String[] infos = new String[3];
        infos[0] = "Niveau "+this.idNiveau;
        infos[1] = "Hauteur du niveau : "+this.hauteur +" m";
        infos[2] = "Nombre d'appartements a ce niveau : "+this.nbAppart;
        return infos;
    }
    
    public String[] afficherAppart(){
        String[] apparts = new String[10];
        int i=0;
        for (Appartement a : appartList){
            apparts[i] = a.afficher()[0]+";" +a.afficher()[1];
            i++;
        }
        return apparts;
    }
    
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
}
