
package tp2_relation_1_vacheret;
public class Personne {
    String nom;
    String prenom;
    int nbvoitures;
    Personne proprietaire;
    public Personne(String unNom, String Unprenom) {
        nom = unNom;
        prenom = Unprenom;
    }
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + prenom + "a une voiture";
    return chaine_a_retourner ;
    }
}
