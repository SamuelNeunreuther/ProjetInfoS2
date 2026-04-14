package com.projetinfo_s2;

public class Appartement {
    private int idAppartement;
    private int NbPiece;

    public Appartement(int idAppartement, int NbPiece) {
        this.idAppartement = idAppartement;
        this.NbPiece = NbPiece;
    }
    
    public String[] afficher(){
        String[] infos = new String[2];
        infos[0] = "Appartement "+this.idAppartement;
        infos[1] = "Nombre de pieces : "+this.NbPiece;
        return infos;
    }

    public int getIdAppartement() {
        return idAppartement;
    }

    public void setIdAppartement(int idAppartement) {
        this.idAppartement = idAppartement;
    }

    public int getNbPiece() {
        return NbPiece;
    }

    public void setNbPiece(int NbPiece) {
        this.NbPiece = NbPiece;
    }
}
