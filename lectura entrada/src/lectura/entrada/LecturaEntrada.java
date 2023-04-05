
package lectura.entrada;
import java.util.Scanner;

public class LecturaEntrada {

  
  public static void main(String[] args) {       
   Scanner leer = new Scanner(System.in);          
   System.out.println("Ingresa tu edad"); 
   int edad = leer.nextInt(); 
         
   System.out.println("Ingresa tu nombre"); 
   String nombre = leer.next();
   System.out.println("Tu nombre es " + nombre + " y tu edad es "+ edad ); 
  } 
} 