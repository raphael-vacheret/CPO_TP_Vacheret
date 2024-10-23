/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_vacheret;

/**
 *
 * @author Administrateur
 */
public class Epee extends Arme {
    private int finesse;
    public Epee(int finesse, String nom, int niveau) {
        super(nom, niveau);
        if (finesse<0 || finesse>100) this.finesse=0;
        else this.finesse = finesse;
    }

    public int getFinesse() {
        return finesse;
    }
    
}
