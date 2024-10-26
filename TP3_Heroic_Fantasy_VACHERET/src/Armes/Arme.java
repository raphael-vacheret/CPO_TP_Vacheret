/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Armes;
import Personnages.Personnage;
/**
 *
 * @author Administrateur
 */

public abstract class Arme {
    private String nom;
    private int niveau;
    Personnage Proprietaire=null;
    Arme liste_Arme;
    public Arme(String nom , int niveau) {
        this.nom = nom;
        if (niveau<0 || niveau>100) this.niveau=0;
        else this.niveau=niveau;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setProprietaire(Personnage Proprietaire) {
        this.Proprietaire = Proprietaire;
    }

    public void setListe_Arme(Arme liste_Arme) {
        this.liste_Arme = liste_Arme;
    }

    public Personnage getProprietaire() {
        return Proprietaire;
    }

    public Arme getListe_Arme() {
        return liste_Arme;
    }
    
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom+ " est une arme avec un niveau :"+niveau;
        return chaine_a_retourner ;
    }
}
