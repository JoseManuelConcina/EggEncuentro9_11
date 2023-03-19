/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_arrays;

import java.util.Scanner;

/**
 *
 * @author Anabela
 */
public class EggEjercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios
        y le pida al usuario un numero a buscar en el vector. El programa mostrará donde
        se encuentra el numero y si se encuentra repetido
         */
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese le tamaño del arreglo: ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
              System.out.print(vector[i]+" ");
        }
        System.out.println("\nIngrese un numero a buscar");
        int numAbuscar = leer.nextInt();
        int contador = 0, conaux = 0;
        for (int i = 0; i < n; i++) {
            contador++;
            
            if (vector[i] == numAbuscar) {
                conaux++;

            }
        }
        if (conaux == 1) {
            System.out.println("El numero se encuentra una sola vez y esta en el sub indice: " + contador);
        } else if (conaux > 1) {
            System.out.println("En numero se encuentra repetido: " + conaux+" veces.");
        } else {
            System.out.println("El numero no se encuentra");
        }
    }

}
