
package tp2_relation_1_vacheret;
public class Voiture {
    String modele;
    String marque ;
    int puissanceCV;
    Personne Proprietaire=null;
    Voiture liste_voitures;
    public Voiture(String Unmodele, String Unemarque, int Unepuissance) {
        modele=Unmodele;
        marque= Unemarque;
        puissanceCV= Unepuissance;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "une "+modele+" "+marque+" avec une puissance de "+puissanceCV+"";
        return chaine_a_retourner ;
    }
}
