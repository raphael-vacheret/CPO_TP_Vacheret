// raphael vacheret convertisseur 23/09
package tp1_convertisseur_vacheret;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class TP1_convertisseur_VACHERET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double valeur=0;
        int calcul;
        double valeurfin;
        System.out.println("\n entrer votre premiere valeur :");
        valeur=sc.nextDouble();
        System.out.println("1) convertion de celcius vers kelvin" );
        System.out.println("2) convertion de kelvin vers celcius" );
        System.out.println("3) convertion de Farenheit vers celcius" );
        System.out.println("4) convertion de celcius vers farenheit" );
        System.out.println("5) convertion de kelvin vers farenheit" );
        System.out.println("5) convertion de farenheit vers kelvin" );
        calcul=sc.nextInt();
        
        if(calcul==1) {
            valeurfin=CelciusVersKelvin (valeur);
            System.out.println("\n votre valeur en kelvin est :"+valeurfin+"");
        }
        else if (calcul==2) {
            valeurfin=KelvinVersCelcius (valeur);
            System.out.println("\n votre valeur en Celcius est :"+valeurfin+"");
        }
        else if (calcul==3) {
            valeurfin=FarenheitVersCelcius (valeur);
            System.out.println("\n votre valeur en Celcius est :"+valeurfin+"");
        }
        else if (calcul==4) {
            valeurfin=CelciusVersFarenheit (valeur);
            System.out.println("\n votre valeur en farenheit est :"+valeurfin+"");
        }
        else if (calcul==5) {
            valeurfin=KelvinVersFarenheit (valeur);
            System.out.println("\n votre valeur en farenheit est :"+valeurfin+"");
        }
        else if (calcul==6) {
            valeurfin=FarenheitVersKelvin (valeur);
            System.out.println("\n votre valeur en kelvin est :"+valeurfin+"");
        }
        
        
        
        
    }
    public static double CelciusVersKelvin (double valeur) {
        double tKelvin;
        tKelvin=valeur+273;
        return tKelvin;
    }
    public static double KelvinVersCelcius (double valeur) {
        double Celcius;
        Celcius=valeur-273;
        return Celcius;
    }
    public static double FarenheitVersCelcius (double valeur) {
        double Celcius;
        Celcius=(valeur-32)*5/9;
        return Celcius;
    }
    public static double CelciusVersFarenheit (double valeur) {
        double Frn;
        Frn=(valeur*9/5)+32;
        return Frn;
    }
    public static double KelvinVersFarenheit (double valeur) {
        double Frn;
        Frn=((valeur-32)*5/9)+273;
        return Frn;
    }
    public static double FarenheitVersKelvin (double valeur) {
        double Kelvin;
        Kelvin=((valeur-273)*9/5)+32;
        return Kelvin;
    }
}
