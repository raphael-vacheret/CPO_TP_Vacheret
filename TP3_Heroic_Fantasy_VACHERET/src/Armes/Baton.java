/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;
import Armes.Arme;

/**
 *
 * @author Administrateur
 */
public class Baton extends Arme {
    private int age;
    public Baton(int age, String nom, int niveau) {
        super(nom, niveau);
        if (age<0 || age>100) this.age=0;
        else this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return nom "a un niveau :";
    }
    
    
    
}
