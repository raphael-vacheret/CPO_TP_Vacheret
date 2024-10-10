/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_vacheret;

/**
 *
 * @author Administrateur
 */
public class convertisseur {
    int nbConversions;
    public Convertisseur () {
        nbConversions = 0 ;
    }

    public double CelciusVersKelvin (double valeur) {
        double tKelvin;
        tKelvin=valeur+273;
        return tKelvin;
        nbConversions += 1 ;
    }
    public double KelvinVersCelcius (double valeur) {
        double Celcius;
        Celcius=valeur-273;
        return Celcius;
        nbConversions += 1 ;
    }
    public double FarenheitVersCelcius (double valeur) {
        double Celcius;
        Celcius=(valeur-32)*5/9;
        return Celcius;
        nbConversions += 1 ;
    }
    public double CelciusVersFarenheit (double valeur) {
        double Frn;
        Frn=(valeur*9/5)+32;
        return Frn;
        nbConversions += 1 ;
    }
    public double KelvinVersFarenheit (double valeur) {
        double Frn;
        Frn=((valeur-32)*5/9)+273;
        return Frn;
        nbConversions += 1 ;
    }
    public double FarenheitVersKelvin (double valeur) {
        double Kelvin;
        Kelvin=((valeur-273)*9/5)+32;
        return Kelvin;
        nbConversions += 1 ;
    }
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }

    
}
