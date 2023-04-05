 
package ejercicio9;
import java.util.Scanner;
 
public class Ejercicio9 {


    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          int numero;
          int sumatoria1 = 0;
          int sumatoria2 = 0;
           do {
              System.out.println("ingrese un numero");
              numero = leer.nextInt();
              sumatoria1 = sumatoria1 + numero;
              sumatoria2 = sumatoria2++;
          } while (numero !=0);
            System.out.println(" se capturo el numero 0 ");
            System.out.println(" la suma de los numero leidos es " + sumatoria1);
          
    }
    }
    

    