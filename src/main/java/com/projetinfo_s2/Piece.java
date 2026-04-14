
package com.projetinfo_s2;

import java.util.ArrayList;

public class Piece {
    private int idPiece;
    private String usage;
    private ArrayList<Mur> murs;
    private Plafond plafond;
    private Sol sol;

    public Piece(int idPiece, String usage, ArrayList<Mur> murs, Plafond plafond, Sol sol) {
        this.idPiece = idPiece;
        this.usage = usage;
        this.murs = murs;
        this.plafond = plafond;
        this.sol = sol;
    }
    
    public String[] afficher(){
        String[] infos = new String[4];
        infos[0] = "Piece "+this.idPiece;
        infos[1] = "Usage : "+this.usage;
        infos[2] = "Revetement de sol "+this.sol.getRevetement().getType();
        infos[3] = "Revetement de plafond "+this.plafond.getRevetement().getType();
        return infos;
    }
    
    public int getIdPiece() {
        return idPiece;
    }

    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Plafond getPlafond() {
        return plafond;
    }

    public void setPlafond(Plafond plafond) {
        this.plafond = plafond;
    }

    public Sol getSol() {
        return sol;
    }

    public void setSol(Sol sol) {
        this.sol = sol;
    }

    public ArrayList<Mur> getMurs() {
        return murs;
    }

    public void setMurs(ArrayList<Mur> murs) {
        this.murs = murs;
    }
    
    public void addMur(Mur mur){
        this.murs.add(mur);
    }
    
    /*    public float Surface(){
        return (largeur*longueur);
    }*/
    
}