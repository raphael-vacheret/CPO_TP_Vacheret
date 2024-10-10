// RAPHAEL VACHERET 07/10 tp2
package tp2_bieres_vacheret;

/**
 *
 * @author Administrateur
 */
public class TP2_Bieres_VACHERET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        System.out.println(uneBiere) ;
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        BouteilleBiere demeBiere = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe") ;
        demeBiere.lireEtiquette();
        demeBiere.Décapsuler();
        System.out.println(demeBiere);
        BouteilleBiere troisieme = new BouteilleBiere("trois",3.0 ,"3eme") ;
        System.out.println(troisieme);
        troisieme.lireEtiquette();
        troisieme.Décapsuler();
        BouteilleBiere quatrieme = new BouteilleBiere("quatre",4.0 ,"4eme") ;
        quatrieme.lireEtiquette();
        quatrieme.Décapsuler();
        System.out.println(quatrieme);
        BouteilleBiere cinquieme = new BouteilleBiere("cinq",5.0 ,"5eme") ;
        cinquieme.lireEtiquette();
        cinquieme.Décapsuler();
        System.out.println(cinquieme);
    }
    
}
