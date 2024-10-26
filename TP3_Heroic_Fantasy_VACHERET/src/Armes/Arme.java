/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Armes;
/**
 *
 * @author Administrateur
 */

public abstract class Arme {
    private String nom;
    private int niveau;
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
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom+ " est une arme avec un niveau :"+niveau;
        return chaine_a_retourner ;
    }
}
