 /** Autor: Leonardo Avila Lampert
 * Data: 18/03/2024
 */
import java.util.Scanner; 
import java.lang.Math;
public class CalculadoraSwitch {
     public  static void main (String args [] ) {
    Scanner teclado = new Scanner(System.in);
    
    double x, y;
    
    int numero;
    
    
    System.out.println ("Aperte 1 (somar), 2 (subtrair), 3 (multiplicar) ou 4 (dividir) "); 
    
    numero = teclado.nextInt ();
    
    
    System.out.println (" Digite os números de x e y ");
    
    x = teclado.nextDouble ();
    
    y = teclado.nextDouble ();
    
    
    switch (numero) {
    case 1: System.out.println (" A soma é: " + (x + y)); 
    
       break;
       
    case 2: System.out.println (" A subtração é: " + (x - y)); 
    
       break;
       
    case 3: System.out.println (" A multiplicação é: " + (x * y)); 
       
       break;
       
    case 4: System.out.println (" A divisão é: " + (x / y)); 
       break;
       
    default:
        System.out.println (" Opção Inválida");
    break;  
         }
        }
       }