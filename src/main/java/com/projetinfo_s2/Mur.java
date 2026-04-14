
package com.projetinfo_s2;

public class Mur {
    
    private int idMur;
    private Segment position;
    private Revetement revetement;

    public Mur(int idMur, Segment position, Revetement revetement) {
        this.idMur = idMur;
        this.position = position;
        this.revetement = revetement;
    }
    
    public float surface(Niveau niveau){
        return position.longueur()*niveau.getHauteur();
    }
    
    public float prix(Niveau niveau){
        return this.surface(niveau)*this.revetement.getPrixUnitaire();
    }
    
    public String[] afficher(){
        String[] infos = new String[2];
        infos[0] = "Mur " +this.idMur;
        infos[1] = "Revetement du mur : "+this.revetement.getType();
        return infos;
    }

    public int getIdMur() {
        return idMur;
    }

    public void setIdMur(int idMur) {
        this.idMur = idMur;
    }

    public Segment getPosition() {
        return position;
    }

    public void setPosition(Segment position) {
        this.position = position;
    }

    public Revetement getRevetement() {
        return revetement;
    }

    public void setRevetement(Revetement revetement) {
        this.revetement = revetement;
    }
}
