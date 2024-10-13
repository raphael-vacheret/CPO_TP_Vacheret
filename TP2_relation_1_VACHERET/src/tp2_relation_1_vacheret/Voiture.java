
package tp2_relation_1_vacheret;
public class Voiture {
    String modele;
    String marque ;
    int puissanceCV;
    public Voiture(String Unmodele, String Unemarque, int Unepuissance) {
        modele=Unmodele;
        marque= Unemarque;
        puissanceCV= Unepuissance;
        Voiture liste_voitures;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "la voiture est une "+modele+" "+marque+" avec une puissance de "+puissanceCV+"";
        return chaine_a_retourner ;
    }
}
