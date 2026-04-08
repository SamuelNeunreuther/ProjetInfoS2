
package com.projetinfo_s2;

public class Piece {
    private int idPiece;
    private String usage;
    private Mur mur[];
    private Plafond plafond;
    private Sol sol;

    public Piece(int idPiece, String usage, Mur[] mur, Plafond plafond, Sol sol) {
        this.idPiece = idPiece;
        this.usage = usage;
        this.mur = mur;
        this.plafond = plafond;
        this.sol = sol;
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

    public Mur[] getMur() {
        return mur;
    }

    public void setMur(Mur[] mur) {
        this.mur = mur;
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
/*    public float Surface(){
        return (largeur*longueur);
    }*/
    
}