/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp3_heroic_fantasy_vacheret;

import Personnages.Personnage;

/**
 *
 * @author Administrateur
 */
public interface etreVivant {
    public void seFatiguer();
    boolean estVivant();
    void estAttaqué(Personnage attaquant);
}
