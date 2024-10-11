//" raphael vacheret  tp2 10/10"
package tp2_convertisseurobjet_vacheret;

import java.util.Scanner;

public class TP2_convertisseurObjet_VACHERET {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valeur=0;
        System.out.println("\n entrer votre premiere valeur :");
        valeur=sc.nextDouble();
        int calcul;
        System.out.println("\n entrer votre premiere valeur :");
        System.out.println("1) convertion de celcius vers kelvin" );
        System.out.println("2) convertion de kelvin vers celcius" );
        System.out.println("3) convertion de Farenheit vers celcius" );
        System.out.println("4) convertion de celcius vers farenheit" );
        System.out.println("5) convertion de kelvin vers farenheit" );
        System.out.println("5) convertion de farenheit vers kelvin" );
        calcul=sc.nextInt();
        convertisseur KC = new convertisseur();
        convertisseur CF = new convertisseur();
        convertisseur CK = new convertisseur();
        convertisseur FC = new convertisseur();
        convertisseur FK = new convertisseur();
        convertisseur KF = new convertisseur();
        while (calcul!=0) {
            if (calcul==1) {
                
                CF.CelciusVersFarenheit(valeur);
                System.out.println(CF);
            }
            if (calcul==2) {
                
                CK.CelciusVersKelvin(valeur);
                System.out.println(CK);
            }
            if (calcul==3) {
                
                FC.FarenheitVersCelcius(valeur);
                System.out.println(FC);
            }
            if (calcul==4) {
                
                FK.FarenheitVersKelvin(valeur);
                System.out.println(FK);
            }
            if (calcul==5) {
                
                KF.KelvinVersFarenheit(valeur);
                System.out.println(KF);
            }
            if (calcul==6) {
                
                KC.FarenheitVersKelvin(valeur);
                System.out.println(KC);
            }
            System.out.println("\n choisir une nouvelle convertions  :");
            calcul=sc.nextInt();
        }
    }
    
}
