/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa tu frase");
        String frase = leer.nextLine();
        System.out.println("frase mayuscula es " + frase.toUpperCase());
        System.out.println("frase mayuscula es " + frase.toLowerCase());
    }
    
}
