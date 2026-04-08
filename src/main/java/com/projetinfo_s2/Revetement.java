/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projetinfo_s2;

/**
 *
 * @author obrutin01
 */
public class Revetement {
    
    private int idRev;
    private String type;
    private float prixUnitaire;

    public int getIdRev() {
        return idRev;
    }

    public void setIdRev(int idRev) {
        this.idRev = idRev;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Revetement(int idRev, String type, float prixUnitaire) {
        this.idRev = idRev;
        this.type = type;
        this.prixUnitaire = prixUnitaire;
    }
    
    
    
}
