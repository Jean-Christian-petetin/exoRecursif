package exorecursif;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeanchristian-petetin
 */
public class Repertoire {
    public String nom = "";
    public Repertoire parent = null;
    List <Repertoire> repertoires = new ArrayList();
    
    public Repertoire(String nom){
        this.nom = nom;
    }
    
    public void addChildren(Repertoire r){
        r.parent = this;
        this.repertoires.add(r);
    }
    
    public void afficheNom(){
        //PROBLEME dans l'ordre d'affichage.
        System.out.println(this.nom);
        for (Repertoire repertoire : repertoires) {
            repertoire.afficheNom();
        }
    }
    
    //Pourquoi on utilise cette methode la?
    public int getIndent(){
        //il manque quelque chose ici.
        return this.parent.getIndent()+1;
    }
    
    //une tabulation = \t
    //le nombre de tabulation correspond au nombre de parent.
    public String indentation(){
        
    }
    
}
