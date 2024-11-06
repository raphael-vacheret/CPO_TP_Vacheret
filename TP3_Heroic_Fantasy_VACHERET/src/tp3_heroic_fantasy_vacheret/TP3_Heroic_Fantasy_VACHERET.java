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
        Baton Che = new Baton(40,"Chene",50);
        Baton Char = new Baton(50,"Charme",60);
        Guerrier unGuerrier = new Guerrier("Lannister", 45,true);
        Guerrier GuerrierDeux = new Guerrier("Conan", 78,false);
        Magicien unMage = new Magicien("Gandlaf",65,true);
        Magicien MageDeux = new Magicien("Garcimore",44,false);
        System.out.println("l'epee "+Exca.getNom()+" a un niveau de : "+Exca.getNiveau()+" et une finesse de "+Exca.getFinesse()+"");
        System.out.println("l'epee "+Duran.getNom()+" a un niveau de : "+Duran.getNiveau()+" et une finesse de "+Duran.getFinesse()+"");
        System.out.println("le baton "+Che.getNom()+" a un niveau de : "+Che.getNiveau()+" et un age de "+Che.getAge()+"");
        System.out.println("le baton "+Char.getNom()+" a un niveau de : "+Char.getNiveau()+" et une finesse de "+Char.getAge()+"");
        ArrayList<Arme> TabArme = new ArrayList<Arme>();
        TabArme.add(Exca);
        TabArme.add(Duran);
        ArrayList<Baton> TabBaton = new ArrayList<>();
        TabBaton.add(Che);
        TabBaton.add(Char);
        ArrayList<Guerrier> TabGuerrier = new ArrayList<>();
        TabGuerrier.add(unGuerrier);
        TabGuerrier.add(GuerrierDeux);
        ArrayList<Magicien> TabMage = new ArrayList<>();
        TabMage.add(unMage);
        TabMage.add(MageDeux);
        for(int i=0;i<TabArme.size();i++) {
            System.out.println(TabArme.get(i)+" et une finesse);
        }
        for(int i=0;i<TabBaton.size();i++) {
            System.out.println(TabBaton.get(i)+" et un age de :"+TabBaton.get(i).getAge());
        }
        for(int i=0;i<TabGuerrier.size();i++) {
            if (TabGuerrier.get(i).isCheval()==true) {
                System.out.println(TabGuerrier.get(i)+", il a un cheval");                
            }
            else System.out.println(TabGuerrier.get(i)+", il n'a pas de cheval");
        }
        for(int i=0;i<TabMage.size();i++) {
            if (TabMage.get(i).isComfirme()==true) {
                System.out.println(TabMage.get(i)+", il est confirme");                
            }
            else System.out.println(TabMage.get(i)+", il n'est pas confirme");
        }
    }
    
}
