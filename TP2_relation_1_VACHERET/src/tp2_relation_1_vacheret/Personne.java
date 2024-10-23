
package tp2_relation_1_vacheret;
public class Personne {
    String nom;
    String prenom;
    int nbvoitures=0;
    Voiture [] liste_voitures = new Voiture [3] ;
    
    public Personne(String unNom, String Unprenom) {
        nom = unNom;
        prenom = Unprenom;
    }
    public boolean ajouter_voiture (Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) {
            return false;
        }
         if (nbvoitures >= 3) {
            return false;
        }
        liste_voitures[nbvoitures] = voiture_a_ajouter;
        nbvoitures++;
        voiture_a_ajouter.Proprietaire = this ; 
        return true;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + prenom + "a une voiture";
        return chaine_a_retourner ;
    }
}
