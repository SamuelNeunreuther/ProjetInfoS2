
package com.projetinfo_s2;

public class Plafond {
    
    private Revetement revetement;

    public Plafond(Revetement revetement) {
        this.revetement = revetement;
    }
    
    public Revetement getRevetement() {
        return revetement;
    }

    public void setRevetement(Revetement revetement) {
        this.revetement = revetement;
    }    
}
