/**A classe de entrada é dois valores.
 * Autor: Leonardo Avila Lampert
 * Data: 12/03/2024
 */
import java.util.Scanner; 
import java.lang.Math;
public class ProgramaTudo {
    public  static void main (String args [] ) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println ("Digite dois valores inteiros"); 
    int valor1 = teclado.nextInt();
    int valor2 = teclado.nextInt();
    
    
    int soma = (valor1 + valor2);
    System.out.println ("soma: " + soma); 
    
    
    int menos = (valor1 - valor2);
     System.out.println ("diferença: " + menos);
     
     
    int média = ((valor1 + valor2) /2);
    System.out.println ("média: " + média);
    
    
    int absoluto = Math. abs(valor1 - valor2);
    System.out.println ("distância: " + absoluto);
    
    
    int maximo = Math.max (valor1,valor2);
    System.out.println ("O maior: " + maximo);
    
    
    int minimo = Math.min (valor1,valor2);
    System.out.println ("O menor: " + minimo);
    
    
    
    
    }
}