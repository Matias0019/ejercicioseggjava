/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();
        if ( num % 2 == 0) 
        {
            System.out.println("es par");
        }
        else {
            System.out.println("es impar");
        }
    }
    
}
