/**A classe de entrada é um número.
 * Autor: Leonardo Avila Lampert
 * Data: 11/03/2024
 */
import java.util.Scanner; 
import java.lang.Math;
public class Potencia {
    public  static void main (String args [] ) {
        
     double n2,n3,n4;
     
    Scanner teclado = new Scanner(System.in);

    System.out.println ("De o valor de n"); 
    double n = teclado.nextDouble();
    
    n2 = (Math.pow(n,2));
    n3 = (Math.pow(n,3));
    n4=  (Math.pow(n,4));
    
    System.out.println ("n² " + n2); 
    System.out.println ("n³ " + n3); 
    System.out.println ("n4 " + n4); 
    }
}
