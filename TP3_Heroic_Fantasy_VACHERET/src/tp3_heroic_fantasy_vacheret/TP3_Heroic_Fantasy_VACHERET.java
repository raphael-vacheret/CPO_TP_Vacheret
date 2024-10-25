/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_vacheret;
import Armes.Epee;
import java.util.ArrayList;
import Armes.Baton;



public class TP3_Heroic_Fantasy_VACHERET {
    public static void main(String[] args) {
        Epee Excalibur = new Epee(70,"Excalibur",50);
        Epee Durandal = new Epee(40,"Durandal",70);
        Baton Chene = new Baton(40,"Chene",50);
        Baton Charme = new Baton(50,"Charme",60);
        Guerrier unGuerrier = new Guerrier("Lannister", 45,true);
        Guerrier GuerrierDeux = new Guerrier("Conan", 78,false);
        Magicien unMage = new Magicien("Gandlaf",65,true);
        Magicien MageDeux = new Magicien("Garcimore",44,false);
        System.out.println("l'epee "+Excalibur.getNom()+" a un niveau de : "+Excalibur.getNiveau()+" et une finesse de "+Excalibur.getFinesse()+"");
        System.out.println("l'epee "+Durandal.getNom()+" a un niveau de : "+Durandal.getNiveau()+" et une finesse de "+Durandal.getFinesse()+"");
        System.out.println("le baton "+Chene.getNom()+" a un niveau de : "+Chene.getNiveau()+" et un age de "+Chene.getAge()+"");
        System.out.println("le baton "+Charme.getNom()+" a un niveau de : "+Charme.getNiveau()+" et une finesse de "+Charme.getAge()+"");
        ArrayList<String> TabArme = new ArrayList<String>();
        TabArme.add("Excalibur");
        TabArme.add("Durandal");
        TabArme.add("Chene");
        TabArme.add("Charme");
        ArrayList<String> TabPerso = new ArrayList<String>();
        TabPerso.add("Lannister");
        TabPerso.add("Conan");
        TabPerso.add("Gandlaf");
        TabPerso.add("Garcimore");
        for(int i=0;i<TabArme.size();i++) {
            System.out.print("il y a "+TabArme.get(i)+" a un niveau de : "+(TabArme.get(i)).getNiveau()+" et une finesse de "+TabArme.get(i).getFinesse()+" ");
        }
    }
    
}
