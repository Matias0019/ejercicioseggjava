/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer19_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][] matriz2 = new int[3][3];
        int aux = 0;
        
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = matriz[j][i];
                System.out.print(matriz2[i][j]);
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz2[i][j] == -matriz[i][j]) {
                    aux+=1;
                }
 
            }
        }
        if (aux==9) {
            System.out.println("La matriz es anti simetrica");
        }else{
            System.out.println("La matriz no es anti simetrica");
        }
    }

}

