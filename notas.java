/**A classe de entrada é as notas.
 * Autor: Leonardo Avila Lampert
 * Data: 13/03/2024
 */

import java.util.Scanner; 
import java.lang.Math;
public class notas {
  public  static void main (String args [] ) {
       
      Scanner teclado = new Scanner(System.in);
      
      long n100, n50, n20, n10, n5, n2, n1;
      
      
      System.out.println ("Digite um valor"); 
      long n = teclado.nextLong();
      
      
      n100 = n/100;
      n = n%100;
      System.out.println ("notas de 100: " + n100); 
      
      
      n50 = n/50;
        n = n%50;
      System.out.println ("notas de 50: " + n50); 
      
      
       n20 = n/20;
       n = n%20;
      System.out.println ("notas de 20 " + n20); 
      
      
       n10 = n/10;
       n = n%10;
      System.out.println ("notas de 10: " + n10); 
      
      
       n5 = n/5;
       n = n%5;
      System.out.println ("notas de 5: " + n5); 
      
      
       n2 = n/2;
       n = n%2;
      System.out.println ("notas de 2: " + n2); 
      
      
       n1 = n;
      System.out.println ("notas de 1: " + n1); 
      
      
      
    }
}
