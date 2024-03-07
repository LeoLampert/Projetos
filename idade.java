/* A classe de entrada é a idade.
 * Autor: Leonardo Avila Lampert
 * Data: 05/03/2024
 */
import java.util.Scanner;
public class idade {
    public  static void main (String args [] ) {
        int idade;
        final int DIAS = 365;
        while (true){
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Para saber quantos dias de idade você tem informe a sua idade:");
        idade = teclado.nextInt (); 
        int resultado = (idade * DIAS); 
         System.out.println ("resultado: " + (idade * DIAS)); 
        }
    }
}