// VACHERET RAPHHAEL 13/10 TP2 EXO 4
package tp2_relation_1_vacheret;
public class TP2_relation_1_VACHERET {
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Voiture unepouma = new Voiture ("pouma", "coupra", 10 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        bob.liste_voitures[0] = uneClio ;
        bob.nbvoitures++ ;
        uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de "+bob.prenom+" est " +bob.liste_voitures[0] ) ;
        bob.liste_voitures[1] = une2008 ;
        bob.nbvoitures++ ;
        une2008.Proprietaire = bob ;
        System.out.println("la deuxieme voiture de "+bob.prenom+" est " +bob.liste_voitures[1] ) ;
        reno.liste_voitures[0] = uneAutreClio ;
        reno.nbvoitures++ ;
        uneAutreClio.Proprietaire = reno ;
        System.out.println("la premiere voiture de "+reno.prenom+" est " +reno.liste_voitures[0] ) ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbvoitures++ ;
        uneMicra.Proprietaire = reno ;
        System.out.println("la deuxieme voiture de "+reno.prenom+" est " +reno.liste_voitures[1] ) ;
        reno.ajouter_voiture(unepouma);
        bob.ajouter_voiture(unepouma);
        System.out.println("la troisieme voiture de "+reno.prenom+" est " +reno.liste_voitures[2] ) ;
        System.out.println("la troisieme voiture de "+bob.prenom+" est " +bob.liste_voitures[2] ) ;
    }
    
}
