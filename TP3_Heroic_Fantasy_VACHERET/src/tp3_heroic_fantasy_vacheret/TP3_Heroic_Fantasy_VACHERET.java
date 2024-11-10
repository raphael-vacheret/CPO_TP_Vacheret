/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_vacheret;
import Personnages.Guerrier;
import Personnages.Magicien;
import Armes.Epee;
import java.util.ArrayList;
import Armes.Baton;
import Armes.Arme;
import Personnages.Personnage;



public class TP3_Heroic_Fantasy_VACHERET {
    public static void main(String[] args) {
        Epee Exca = new Epee(70,"Excalibur",50);
        Epee Duran = new Epee(40,"Durandal",70);
        Epee Gram = new Epee(60,"Gram",60);
        Baton Che = new Baton(40,"Chene",50);
        Baton Char = new Baton(50,"Charme",60);
        Baton Sur = new Baton(80,"baguette de sureau",70);
        Guerrier unGuerrier = new Guerrier("Lannister", 45,true);
        Guerrier GuerrierDeux = new Guerrier("Conan", 78,false);
        Magicien unMage = new Magicien("Gandlaf",65,true);
        Magicien MageDeux = new Magicien("Garcimore",44,false);
        //System.out.println("l'epee "+Exca.getNom()+" a un niveau de : "+Exca.getNiveau()+" et une finesse de "+Exca.getFinesse()+"");
        //System.out.println("l'epee "+Duran.getNom()+" a un niveau de : "+Duran.getNiveau()+" et une finesse de "+Duran.getFinesse()+"");
        //System.out.println("le baton "+Che.getNom()+" a un niveau de : "+Che.getNiveau()+" et un age de "+Che.getAge()+"");
        //System.out.println("le baton "+Char.getNom()+" a un niveau de : "+Char.getNiveau()+" et une finesse de "+Char.getAge()+"");
        ArrayList<Arme> TabArme = new ArrayList<>();
        TabArme.add(Exca);
        TabArme.add(Duran);
        TabArme.add(Che);
        TabArme.add(Char);
        TabArme.add(Gram);
        TabArme.add(Sur);
        ArrayList<Personnage> TabPersonnage = new ArrayList<>();
        TabPersonnage.add(unGuerrier);
        TabPersonnage.add(GuerrierDeux);
        TabPersonnage.add(unMage);
        TabPersonnage.add(MageDeux);
        //System.out.println(TabArme.toString());
        //System.out.println(TabPersonnage.toString());
        unGuerrier.ajouter_Arme(Exca);
        unGuerrier.ajouter_Arme(Duran);
        unGuerrier.ajouter_Arme(Che);
        unGuerrier.equiper_Arme(0);
        unMage.ajouter_Arme(Gram);
        unMage.ajouter_Arme(Char);
        unMage.ajouter_Arme(Sur);       
        //System.out.println(unGuerrier.getArme_en_Main());
        //System.out.println(GuerrierDeux.getArme_en_Main());
        //GuerrierDeux.getArme_en_Main();
        System.out.println(unMage.competences());
        System.out.println("il y a :"+Personnage.nbr_combatant+" personnage present dans le jeu");
        System.out.println("il y a :"+Guerrier.nbr_Guerrier+" guerrier present dans le jeu");
        System.out.println("il y a :"+Magicien.nbr_Magicien+" magicien present dans le jeu");
        MageDeux.close();
        System.out.println("il y a :"+Magicien.nbr_Magicien+" magicien present dans le jeu");
        System.out.println(MageDeux.toString());
        System.out.println(unMage.toString());
    }
    
}
