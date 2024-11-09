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

    public Magicien(String nom_Perso, int nbVie, boolean comfirme) {
        super(nom_Perso, nbVie);
        this.comfirme = comfirme;
    }

    public void setComfirme(boolean comfirme) {
        this.comfirme = comfirme;
    }

    public boolean isComfirme() {
        return comfirme;
    }

    @Override
    public String toString() {
        return "nom=" + getNom() + ", age=" + comfirme + ", niveau=" + getNiveau();
    }
    
}
