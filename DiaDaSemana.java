/**A classe de entrada são 7 números, cada um representando um dia da semana.
 * Autor: Leonardo Avila Lampert
 * Data: 18/03/2024
 */
import java.util.Scanner; 
import java.lang.Math;
public class DiaDaSemana {
     public  static void main (String args [] ) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println ("insira um número de 1 a 7 ");
    
    while (true){
    int numero = teclado.nextInt();
    
    switch (numero) {
     case 1:
         System.out.println (" Segunda-feira ");
         break;
     case 2:
         System.out.println (" Terça-feira ");
         break;
     case 3:
         System.out.println (" Quarta-feira ");
         break;
     case 4:
         System.out.println (" Quinta-feira ");
         break;
     case 5:
         System.out.println (" Sexta-feira ");
         break;
     case 6:
         System.out.println (" Sábado ");
         break;    
     case 7:
         System.out.println (" Domingo ");
         break;
     default:
         System.out.println (" Opção Inválida");
         break;   
                }      
            }
        }  
    }


