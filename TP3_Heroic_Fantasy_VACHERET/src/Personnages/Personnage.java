package Personnages;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import tp3_heroic_fantasy_vacheret.TP3_Heroic_Fantasy_VACHERET;
import java.util.ArrayList;
import tp3_heroic_fantasy_vacheret.etreVivant;
/**
 *
 * @author Administrateur
 */
public abstract class Personnage implements etreVivant {
    private String nom_Perso;
    private int nbVie;
    int nbArme=0;
    Arme Arme_en_Main=null;
    int points=0;
    ArrayList<Arme> liste_Arme = new ArrayList<>();
    public static int nbr_combatant=0;
    public Personnage(String nom_Perso , int nbVie) {
        this.nom_Perso = nom_Perso;
        this.nbVie=nbVie;
        //nbr_combatant++;
    }

    public String getNom() {
        return nom_Perso;
    }

    public int getNiveau() {
        return nbVie;
    }

    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    

    
    
    public boolean ajouter_Arme(Arme Arme_a_ajouter) {
        Personnage perso = Arme_a_ajouter.getProprietaire();
        if (perso != null) {
            return false;
        }
        if (nbArme >= 5) {
            return false;
        }
        liste_Arme.add(Arme_a_ajouter);
        nbArme++; 
        return true;
    }
    public Arme equiper_Arme(int x) {
        Arme_en_Main=liste_Arme.get(x);
        System.out.println(nom_Perso+" equipe :["+liste_Arme.get(x)+"]" );
        return Arme_en_Main;
    }
    public String competences() {
        String competence;
        competence = "nom :"+nom_Perso+", niveau : "+nbVie+""+System.lineSeparator()
                +"il a :"+nbArme+" arme qui sont :"+liste_Arme+ System.lineSeparator()
                +"l'arme equipe par "+nom_Perso+" est :["+Arme_en_Main+"]";
        return competence;
    }
    @Override
    public void seFatiguer() {
        nbVie=nbVie-10;       
    }
    @Override
    public boolean estVivant() {
        return nbVie>0;                
    }

    public void estAttaqué(Personnage this.getPoints() {
        nbVie=nbVie-this.getPoints();
    }
}
