
package com.projetinfo_s2;

import java.util.ArrayList;

public class Immeuble extends Batiment{
    
    private ArrayList<Niveau> niveauList = new ArrayList<>();
    
    public Immeuble(int id){
        super(id, "immeuble", 0);
        //chaque immeuble a comme type "immeuble" et a pour l'instant 0 niveaux
        this.niveauList = null;
    }
    
    public void addNiveau(Niveau niveau){
        this.niveauList.add(niveau);
        super.setNbNiveaux(super.getNbNiveaux() + 1);
    }
    
    @Override
    public String[] afficher(){
        String[] infos = new String[2];
        infos[0] = "Immeuble "+super.getBatID();
        infos[1] = "Nombre de niveaux : "+super.getNbNiveaux();
        return infos;
    }

    public ArrayList<Niveau> getNiveauList() {
        return niveauList;
    }

    public void setNiveauList(ArrayList<Niveau> niveauList) {
        this.niveauList = niveauList;
    }
    
}
