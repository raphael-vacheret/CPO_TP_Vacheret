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
    public convertisseur () {
        nbConversions = 0 ;
    }

    public double CelciusVersKelvin (double valeur) {
        double tKelvin;
        tKelvin=valeur+273;
        nbConversions += 1 ;
        return tKelvin;
    }
    public double KelvinVersCelcius (double valeur) {
        double Celcius;
        Celcius=valeur-273;
        nbConversions += 1 ;
        return Celcius;
    }
    public double FarenheitVersCelcius (double valeur) {
        double Celcius;
        Celcius=(valeur-32)*5/9;
        nbConversions += 1 ;
        return Celcius;
    }
    public double CelciusVersFarenheit (double valeur) {
        double Frn;
        Frn=(valeur*9/5)+32;
        nbConversions += 1 ;
        return Frn;
    }
    public double KelvinVersFarenheit (double valeur) {
        double Frn;
        Frn=((valeur-32)*5/9)+273;
        nbConversions += 1 ;
        return Frn;
    }
    public double FarenheitVersKelvin (double valeur) {
        double Kelvin;
        Kelvin=((valeur-273)*9/5)+32;
        nbConversions += 1 ;
        return Kelvin;
    }
    @Override
    public String toString () {
        return "nb de conversions" + nbConversions;
    }

    
}
