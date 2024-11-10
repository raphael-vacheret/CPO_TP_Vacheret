/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;


/**
 *
 * @author Administrateur
 */
public class Magicien extends Personnage {
    private boolean comfirme=false;
    public static int nbr_Magicien=0;

    public Magicien(String nom_Perso, int nbVie, boolean comfirme) {
        super(nom_Perso, nbVie);
        this.comfirme = comfirme;
        nbr_combatant++;
        nbr_Magicien++;
    }

    public void setComfirme(boolean comfirme) {
        this.comfirme = comfirme;
    }

    public boolean isComfirme() {
        return comfirme;
    }
    
    public void close() {
        nbr_combatant--;
        nbr_Magicien--;
    }
    
    @Override
    public String toString() {
        return "nom=" + getNom() + ", age=" + comfirme + ", niveau=" + getNiveau();
    }
    
}
