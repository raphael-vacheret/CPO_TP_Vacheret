/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_vacheret;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class TP1_manipNombresInt_VACHERET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int valeur1=0;
        int valeur2=0;
        int calcul1=0;
        int calcul2=0;
        int calcul3=0;
        int calcul4=0;
        int calcul5=0;
        System.out.println("\n entrer votre premiere valeur :");
        valeur1=sc.nextInt();
        System.out.println("\n entrer votre deuxieme valeur :");
        valeur2=sc.nextInt();
        calcul1=valeur1+valeur2;
        calcul2=valeur1-valeur2;
        calcul3=valeur1*valeur2;
        calcul4=valeur1/valeur2;
        calcul5=valeur1%valeur2;
        System.out.println("\n la somme des deux valeur est :"+calcul1+"");
        System.out.println("\n la differance des deux valeur est :"+calcul2+"");
        System.out.println("\n le produit des deux valeur est :"+calcul3+"");
        System.out.println("\n le quotient des deux valeur est :"+calcul4+"");
        System.out.println("\n le reste de la division des deux valeur est :"+calcul5+"");

        
    }
    
}
