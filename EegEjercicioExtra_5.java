package egg_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class EegEjercicioExtra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que llene una matriz de tamaño NxM con valores 
        aleatorios y muestre la suma de sus elementos.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las dos dimenciones de la Matriz:");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        int[][] retorno = llenarMatriz(matriz, n, m);
        int[][] retorno2 = mostrarMatriz(matriz, n, m);
        int retorno3 = sumaMatriz(matriz, n, m);
       
        System.out.println(Arrays.toString(retorno2));
        System.out.println("La suma de todos los elemntos de la matriz es:" + retorno3);

    }

    public static int[][] llenarMatriz(int[][] matriz, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                matriz[i][j] = (int) (Math.random() * 10);

            }

        }
        return matriz;
    }

    public static int[][] mostrarMatriz(int[][] matriz, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");
        }
        return matriz;
    }

    public static int sumaMatriz(int[][] matriz, int n, int m) {
        int sumador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumador += matriz[i][j];

            }

        }
        return sumador;
    }

}
