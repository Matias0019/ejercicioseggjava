/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author leona
 */
public class ejer20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaDiagP = 0;
        int sumaDiagS = 0;
        int[] sumaF = new int[3];
        int[] sumaC = new int[3];
        int contadorF = 0;
        int contadorC = 0;
        System.out.println("Ingrese 9 numeros entre 1  y 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int aux = leer.nextInt();
                if (aux > 0 && aux < 10) {
                    matriz[i][j] = aux;
                } else {
                    j = j - 1;
                }

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaDiagP = sumaDiagP + matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diag principal es: " + sumaDiagP);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    sumaDiagS = sumaDiagS + matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diag secundaria es: " + sumaDiagS);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaF[i] = sumaF[i] + matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es " + sumaF[i]);
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaC[j] = sumaC[j] + matriz[i][j];
            }
            System.out.println("La suma de la fila " + j + " es " + sumaC[j]);
        }
        if (sumaDiagP==sumaDiagS) {
            for (int i = 0; i < 3; i++) {
                if (sumaF[i]==sumaDiagP){
                    contadorF += 1;
                }
                if (sumaC[i]==sumaDiagP){
                    contadorC += 1;
                }
            }
        }
        if (contadorF == 3 && contadorC == 3 ){
            System.out.println("Es magica");
        }else{
            System.out.println("No es magica");
        }
    }
}
