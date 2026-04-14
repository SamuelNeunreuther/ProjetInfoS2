
package com.projetinfo_s2;

import java.util.ArrayList;

public class Maison extends Batiment {
    
    private ArrayList<Piece> pieceList = new ArrayList<>();
    private int nbPiece;
    
    public Maison(int id){
        super(id, "maison", 1);
        //toutes les maisons ont comme type "maison et ont 1 etage
        this.pieceList = null;
        this.nbPiece = 0;
        //pour l'instant pas de piece, on initialise ici et on incremente dans addPiece
    }
    
    public void addPiece(Piece piece){
        this.pieceList.add(piece);
        this.nbPiece++;
    }
    
    @Override
    public String[] afficher(){
        String[] infos = new String[2];
        infos[0] = "Maison "+super.getBatID();
        infos[1] = "Nombre de pieces : "+this.nbPiece;
        return infos;
    }

    public ArrayList<Piece> getPieceList() {
        return pieceList;
    }

    public void setPieceList(ArrayList<Piece> pieceList) {
        this.pieceList = pieceList;
    }

    public int getNbPiece() {
        return nbPiece;
    }

    public void setNbPiece(int nbPiece) {
        this.nbPiece = nbPiece;
    }  
}
