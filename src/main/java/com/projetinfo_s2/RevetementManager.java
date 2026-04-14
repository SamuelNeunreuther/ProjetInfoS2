
package com.projetinfo_s2;

import java.io.*;

public class RevetementManager extends BufferedReader{
    
    public RevetementManager() throws IOException{
        super(new FileReader("revetement.txt"));
        //Cette classe herite de BufferedReader mais seulement avec le fichier revetement pour eviter les erreurs
    }
    
    public String[] listeString()throws IOException{
        //renvoie une liste de tous les revetements
        String[] revetements = new String[100];
        String ligne;
        int i=0;
        while ((ligne = this.readLine()) != null){
            revetements[i]=ligne;
            i++;
        }
        return revetements;
    }
    
    public Revetement trouverRevetement(int id) throws IOException{
/*cette methode permet de renvoyer un objet Revetement du fichier texte
a partir de son code id*/
        String ligne;
        while ((ligne = this.readLine()) != null){
            //permet de parcourir toutes les lignes du fichier txt
            String[] partie = ligne.split(";");
            //separation chaque ligne en parties (se referer au fichier txt)
            //partie[0] est l'id, partie[1] est le nom et partie[3] est le prix unitaire
            
            if (partie[0].equals(id+"")){
                //verification de l'id donné avec l'id de la ligne parcourue 
                Revetement r = new Revetement(id, partie[1], Float.parseFloat(partie[2]));
                return r;
                //on renvoie le Revetement cree
            }
        }
        return null;
        //la methode return null si aucun revetement du fichier txt n'a ce code
    }
}
