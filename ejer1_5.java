/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int num1 = leer.nextInt();    
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        System.out.println("la suma es " + suma);
    }
    
}
