/** A classe de entrada é a Fahrenheit.
 * Autor: Leonardo Avila Lampert
 * Data: 08/03/2024
 */

import java.util.Scanner; 
import java.lang.Math;
public class fahrenheit {
    public  static void main (String args [] ) {
    
        double celsius;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println ("Digite o valor do fahrenheit "); 
        double fah = teclado.nextDouble();
        
        celsius = (5 * (fah - 32) /9);
        
        System.out.println ("Celcius: " + celsius ); 
        
    }
}