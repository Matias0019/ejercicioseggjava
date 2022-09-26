/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("su nombre es " + nombre);
    }

}
