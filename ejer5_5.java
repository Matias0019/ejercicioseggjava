/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();    
        int doble = num * 2;
        int triple = num * 3;
        double raiz =  Math.sqrt(num);
        System.out.println("resultados doble " + doble + " triple "+ triple + " raiz "+ raiz);
    }
    
}
