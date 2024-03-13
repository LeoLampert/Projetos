/**A classe de entrada são 3 números.
 * Autor: Leonardo Avila Lampert
 * Data: 11/03/2024
 */
import java.util.Scanner; 
import java.lang.Math;
public class media3 {
    public  static void main (String args [] ) {
        
double media3, h;

Scanner teclado = new Scanner(System.in);

System.out.println ("De o valor de a, b, c"); 
double a = teclado.nextDouble();
double b = teclado.nextDouble(); 
double c = teclado.nextDouble();

media3 = ((a + b + c)/3);

System.out.println ("média " + media3); 


  h = (3/(1/a + 1/b + 1/c));
  
  System.out.println ("média Harmônica " + h); 

    }
}