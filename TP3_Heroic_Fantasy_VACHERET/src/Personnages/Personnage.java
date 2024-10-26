package Personnages;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
/**
 *
 * @author Administrateur
 */
public abstract class Personnage {
    private String nom_Perso;
    private int nbVie;
    int nbArme=0;
    Arme [] liste_Arme = new Arme [5] ;
    public Personnage(String nom_Perso , int nbVie) {
        this.nom_Perso = nom_Perso;
        this.nbVie=nbVie;
    }

    public String getNom() {
        return nom_Perso;
    }

    public int getNiveau() {
        return nbVie;
    }
    public boolean ajouter_Arme(Arme Arme_a_ajouter) {
        
        if (Arme_a_ajouter.getProprietaire() != null) {
            return false;
        }
         if (nbArme >= 5) {
            return false;
        }
        liste_Arme[nbArme] = Arme_a_ajouter;
        nbArme++;
        Arme_a_ajouter.getProprietaire() = this ; 
        return true;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom_Perso+ "est un perso avec un niveau de point de vie egale a "+nbVie;
        return chaine_a_retourner ;
    }
}
