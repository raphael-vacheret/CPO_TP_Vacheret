/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_vacheret;
public class TP3_Heroic_Fantasy_VACHERET {
    public static void main(String[] args) {
        Epee UneEpee = new Epee(70,"Excalibur",50);
        Epee EpeeDeux = new Epee(40,"Excalibur",70);
        Baton UnBaton = new Baton(40,"Chene",50);
        Baton BatonDeux = new Baton(50,"Charme",60);
        System.out.println("l'epee "+UneEpee.getNom()+" a un niveau de : "+UneEpee.getNiveau()+" et une finesse de "+UneEpee.getFinesse()+"");
        System.out.println("l'epee "+EpeeDeux.getNom()+" a un niveau de : "+EpeeDeux.getNiveau()+" et une finesse de "+EpeeDeux.getFinesse()+"");
        System.out.println("le baton "+UnBaton.getNom()+" a un niveau de : "+UnBaton.getNiveau()+" et un age de "+UnBaton.getAge()+"");
        System.out.println("le baton "+BatonDeux.getNom()+" a un niveau de : "+BatonDeux.getNiveau()+" et une finesse de "+BatonDeux.getAge()+"");
    }
    
}
