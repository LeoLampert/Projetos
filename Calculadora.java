/**Autor: Leonardo Avila Lampert
 * Data: 11/03/2024
 */
import java.util.Scanner; 
import java.lang.Math;
public class Calculadora {
     public  static void main (String args [] ) {
    Scanner teclado = new Scanner(System.in);
    int um, dois, tres, quatro;
    
    double x, y;
    
    int opcao;
    
    
    System.out.println ("Aperte 1 (somar), 2 (subtrair), 3 (multiplicar) ou 4 (dividir) "); 
    opcao = teclado.nextInt ();
    
    if (opcao == 1) { System.out.println ("digite dois numeros para somar "); 
        x = teclado.nextDouble ();
        y = teclado.nextDouble ();
        System.out.println (" A soma é: " + (x + y)); }
        
    else if (opcao == 2) { System.out.println ("digite dois numeros para subtrair "); 
        x = teclado.nextDouble ();
        y = teclado.nextDouble ();
        System.out.println (" A subtração é: " + (x - y)); }
        
    else if (opcao == 3) { System.out.println ("digite dois numeros para multiplicar "); 
        x = teclado.nextDouble ();
        y = teclado.nextDouble ();
        System.out.println (" A multiplicação é: " + (x * y)); }    
        
    else if (opcao == 4) { System.out.println ("digite dois numeros para dividir "); 
        x = teclado.nextDouble ();
        y = teclado.nextDouble ();
        System.out.println (" A divisão é: " + (x / y)); }    
        
      
       }
    }
