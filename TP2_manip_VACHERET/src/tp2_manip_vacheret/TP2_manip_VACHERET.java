// VACHERET RAPHAEL 11/10 TP2
package tp2_manip_vacheret;
public class TP2_manip_VACHERET {
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        int change;
        change=assiette1.nbCalories;
        assiette1=assiette2;
        assiette2.nbCalories=change;
        Tartiflette assiette3 = assiette2 ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        Moussaka assiette40 = new Moussaka(100);
        Moussaka assiette50 = assiette40;
        Moussaka assiette41 = new Moussaka(200);
        Moussaka assiette51 = assiette41;
        Moussaka assiette42 = new Moussaka(300);
        Moussaka assiette52 = assiette42;
        Moussaka assiette43 = new Moussaka(400);
        Moussaka assiette53 = assiette43;
        Moussaka assiette44 = new Moussaka(500);
        Moussaka assiette54 = assiette44;
        Moussaka assiette45 = new Moussaka(600);
        Moussaka assiette55 = assiette45;
        Moussaka assiette46 = new Moussaka(700);
        Moussaka assiette56 = assiette46;
        Moussaka assiette47 = new Moussaka(800);
        Moussaka assiette57 = assiette47;
        Moussaka assiette48 = new Moussaka(900);
        Moussaka assiette58 = assiette48;
        Moussaka assiette49 = new Moussaka(1000);
        Moussaka assiette59 = assiette49;
        
        Moussaka[] tab = new Moussaka[10];
        
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Moussaka();
        }
    }
    
}
