
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

    public ArrayList<Piece> getPieceList() {
        return pieceList;
    }

    public void setPieceList(ArrayList<Piece> pieceList) {
        this.pieceList = pieceList;
    }
    
    
}
