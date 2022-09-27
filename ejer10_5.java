/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero limite");
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("ingrese un numero");
            suma = suma + leer.nextInt();
        } while (suma <= limite);
        System.out.println(suma);
    }
    
}
