// VACHERET RAPHAEL 25/09 
package tp1_guessmynumber_vacheret;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class TP1_guessMyNumber_VACHERET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int valeur;
        int i=0;
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        while (i<100) {
            System.out.println("\n entrer une valeur :");
            valeur=sc.nextInt();
            if (valeur==n) {
                System.out.println("\n gagné");
                System.out.println("vous avez utiliser :"+i+" coups");
                break;
            }
            else if (valeur<n) {
                System.out.println("\n trop petit");
                i+=1;
            }
            else if (valeur>n) {
                System.out.println("\n tros grand");
                i+=1;
            }
        }
    }
    
}
