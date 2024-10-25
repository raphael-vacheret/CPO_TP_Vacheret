/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_vacheret;

/**
 *
 * @author Administrateur
 */
public class Magicien extends Personnage {
    private boolean comfirme;

    public Magicien(String nom_Perso, int nbVie, boolean comfirme) {
        super(nom_Perso, nbVie);
        this.comfirme = comfirme;
    }

    public void setComfirme(boolean comfirme) {
        this.comfirme = comfirme;
    }
    
}
