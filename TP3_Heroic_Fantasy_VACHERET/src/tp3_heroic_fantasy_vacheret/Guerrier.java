/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_vacheret;

/**
 *
 * @author Administrateur
 */
public class Guerrier extends Personnage {
    private boolean cheval;

     public Guerrier(String nom_Perso, int nbVie,boolean cheval) {
        super(nom_Perso, nbVie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
}
