/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer16_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño de vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print(vector[i] + " ");
        }

        System.out.println("\nIngrese un valor a buscar entre 0 y 9\n");
        int valor = leer.nextInt();
        int contador = 0;

        for (int i = 0; i < N; i++) {
            if (vector[i] == valor) {
                contador++;

                System.out.println(" Se encontro el número en " + i);

            }     
                   }
         System.out.println("Se repitió " + contador);
        if (contador<1){
                System.out.println("No se encontro ningun valor");
        }
  
            
        }
    }


    

