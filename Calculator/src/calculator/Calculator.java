// VACHERET RAPHAEL CALCULATOR 20/09
package calculator;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operande1=0;
        int operande2=0;
        int calcul=0;
        int result=0;
        System.out.println("Please enter the operator:");
        System.out.println("1) add" );
        System.out.println("2) substract" );
        System.out.println("3) Multiply" );
        System.out.println("4) divide" );
        System.out.println("5) modulo" );
        Scanner sc = new Scanner(System.in);
        System.out.println("\n quel type de calcul veut tu faire ?:");
        calcul=sc.nextInt();
        if(calcul<1 || calcul>5) {
            System.out.println("\n veuillez rentrer une valeur entre 1 et 5 Merci");
            System.exit(0);
        }
        else {
            System.out.println("\n entrer votre premiere valeur :");
            operande1=sc.nextInt();
            System.out.println("\n entrer votre deuxieme valeur :");
            operande2=sc.nextInt();
            if(calcul==1) {
                result=operande1+operande2;
            }
            else if (calcul==2) {
                result=operande1-operande2;
            }
            else if (calcul==3) {
                result=operande1*operande2;
            }
            else if (calcul==4) {
                result=operande1/operande2;
            }
            else if (calcul==5) {
                result=operande1%operande2;
            } 
        }
        System.out.println("\n le resultat est :"+result+"");// TODO code application logic here
    }
    
}
