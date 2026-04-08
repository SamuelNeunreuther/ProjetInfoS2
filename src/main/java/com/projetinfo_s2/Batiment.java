
package com.projetinfo_s2;

public class Batiment {
    private int batID;
    private String type;
    private int nbNiveaux;
    
    public Batiment(int id, String type, int nbNiveaux){
        this.batID=id;
        this.nbNiveaux=nbNiveaux;
        this.type=type;
    }
    
    public void setID(int id){
        this.batID=id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNbNiveaux(int nbNiveaux) {
        this.nbNiveaux = nbNiveaux;
    }

    public int getBatID() {
        return batID;
    }

    public String getType() {
        return type;
    }

    public int getNbNiveaux() {
        return nbNiveaux;
    }
    
}
