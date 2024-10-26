package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrateur
 */
public abstract class Personnage {
    private String nom_Perso;
    private int nbVie;
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
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom_Perso+ "est un perso avec un niveau de point de vie egale a "+nbVie;
        return chaine_a_retourner ;
    }
}
