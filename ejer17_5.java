/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package test;

import java.util.Scanner;

/**
 *
 * @author admin1
 */
public class ejer17_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a usar");
        int n = leer.nextInt();

        int a, b, c, d, e;
        a = b = c = d = e = 0;
        int[] vector = new int[n];

        for (int j = 0; j < n; j++) {
            vector[j] = (int) (Math.random() * 99999);
        }
        for (int j = 0; j < n; j++) {
            System.out.println(vector[j]);

        }
        
        for (int j = 0; j < n; j++) {
            if (vector[j] < 9) {
                a++;
            } else if (vector[j] >= 10 & vector[j] < 99) {
                b++;
            }
            else if (vector[j] >= 100 & vector[j] < 999) {
                c++;
            }
             else if (vector[j] >= 1000 & vector[j] < 9999) {
                d++;
            }
            else if (vector[j] >= 10000 & vector[j] < 99999) {
                e++;
            }
        }
        System.out.println("la cantidad de numeros de 1 cifra son" + a );
System.out.println("la cantidad de numeros de 2 cifras son" + b );
        System.out.println("la cantidad de numeros de 3 cifras son" + c );
        System.out.println("la cantidad de numeros de 4 cifras son" + d );
        System.out.println("la cantidad de numeros de 5 cifras son" + e );
    }
    }

    
    

