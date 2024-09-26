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
        int calcul;
        int valeur;
        int i=0;
        Random generateurAleat = new Random();
        System.out.println("choissise un mode de difficulté" );
        System.out.println("1) mode facile" );
        System.out.println("2) mode normal" );
        System.out.println("3) mode difficile" );
        calcul=sc.nextInt();
        if (calcul==1) {
            int n = generateurAleat.nextInt(50);
            while (i<100) {
                System.out.println("\n entrer une valeur :");
                valeur=sc.nextInt();
                if (valeur==n) {
                    System.out.println("\n gagné");
                    System.out.println("vous avez utiliser :"+i+" coups");
                    break;
                }
                else if (valeur<n-10) {
                    System.out.println("\n vraiment trop petit");
                    i+=1;
                }
                else if (valeur>n+10) {
                    System.out.println("\n vraiment trop grand");
                    i+=1;
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
        else if (calcul==2) {
            int n = generateurAleat.nextInt(100);
            while (i<20) {
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
        else if (calcul==3) {
            int n = generateurAleat.nextInt(500);
            while (i<11) {
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
}
