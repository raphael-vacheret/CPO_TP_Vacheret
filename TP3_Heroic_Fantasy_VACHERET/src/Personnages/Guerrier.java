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
public class Guerrier extends Personnage  {
    private boolean cheval=false;
    public static int nbr_Guerrier=0;

     public Guerrier(String nom_Perso, int nbVie,boolean cheval) {
        super(nom_Perso, nbVie);
        this.cheval = cheval;
        nbr_combatant++;
        nbr_Guerrier++;
        this.setPoints(30);
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    public boolean isCheval() {
        return cheval;
    }
    
    public void close() {
        nbr_combatant--;
        nbr_Guerrier--;
    }

    @Override
    public String toString() {
        return "nom=" + getNom() + ",est a cheval :" + cheval + ", niveau=" + getNiveau();
    }
    
    
}