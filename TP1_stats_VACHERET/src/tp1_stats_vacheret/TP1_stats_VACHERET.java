// vacheret raphael 27/09 tp1 stat
package tp1_stats_vacheret;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class TP1_stats_VACHERET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tab[]=new double[6];
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.println("\n entrer une valeur :");
        m=sc.nextInt();
        for (int i=0 ; i<=m ; i++ ) {
            n = generateurAleat.nextInt(0,6);
            tab[n]+=1;
        }
        tab[0]=(tab[0]/m)*100;
        tab[0]=(tab[1]/m)*100;
        tab[0]=(tab[2]/m)*100;
        tab[0]=(tab[3]/m)*100;
        tab[0]=(tab[4]/m)*100;
        tab[0]=(tab[5]/m)*100;
        System.out.println("tableau 0 egale a "+tab[0]+"%");
        System.out.println("tableau 1 egale a "+tab[1]+"%");
        System.out.println("tableau 2 egale a "+tab[2]+"%");
        System.out.println("tableau 3 egale a "+tab[3]+"%");
        System.out.println("tableau 4 egale a "+tab[4]+"%");
        System.out.println("tableau 5 egale a "+tab[5]+"%");
    }
    
}
