/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor.a.pkg25;
import java.util.Scanner;
/**
 *
 * @author Javier
 */
public class MayorA25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);   
        System.out.println("ingrese dos numero enteros");
       int numero1 = leer.nextInt();
       int numero2 = leer.nextInt();
       if (numero1>25 && numero2 >25) {
           System.out.println("Ambos son mayor a 25");
       }else if (numero1>25){
        System.out.println("numero 1 es mayor a 25");
        } else if (numero2>25){
            System.out.println("numero 2 es mayor");
           
       }else {
            System.out.println("ninguno es mayor");
        }
           
    }
    
}
