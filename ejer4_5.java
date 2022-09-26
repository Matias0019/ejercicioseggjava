/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese grados centigrados");
        float centigrados = leer.nextFloat();    
        
        
        float fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("equivalente en grados es " + fahrenheit);
    }
    
}
