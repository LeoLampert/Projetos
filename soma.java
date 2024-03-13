
/**A classe de entrada é nûmeros.
 * Autor: Leonardo Avila Lampert
 * Data: 08/03/2024
 */
import java.util.Scanner;
public class soma
{
    public static void main (String args []){
        Scanner teclado = new Scanner (System.in);
        
        
        int valor1, valor2, soma;
        
        System.out.println ("digite o primeiro valor: ");
        valor1 = teclado.nextInt ();
        
        System.out.println ("digite o segundo valor: ");
        valor2 = teclado.nextInt ();
        
        soma = valor1 + valor2;
        
        System.out.println (" A soma é: " + (valor1 + valor2));
        
        
        
    }
}