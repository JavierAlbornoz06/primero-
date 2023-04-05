
package ejercicio.pkg10;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int numero;
         for (int i = 0; i < 4; i++) {
          System.out.println("ingrese un numero entre 1 y 20");
             numero = leer.nextInt();
             System.out.print(numero);
         
             for (int y = 0; y < numero; y++) {
             System.out.print("*" );
         }    
             
             
        }
 
       
    }
    
}