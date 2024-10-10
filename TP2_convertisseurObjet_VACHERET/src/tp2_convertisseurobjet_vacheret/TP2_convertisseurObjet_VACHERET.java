//" raphael vacheret  tp2 10/10"
package tp2_convertisseurobjet_vacheret;

import java.util.Scanner;

public class TP2_convertisseurObjet_VACHERET {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valeur=0;
        System.out.println("\n entrer votre premiere valeur :");
        valeur=sc.nextDouble();
        convertisseur un = new convertisseur();
        un.CelciusVersFarenheit(valeur);
        un.CelciusVersKelvin(valeur);
         System.out.println(un);
        convertisseur deux = new convertisseur();
        deux.FarenheitVersCelcius(valeur);
        deux.FarenheitVersKelvin(valeur);
         System.out.println(deux);
    }
    
}
