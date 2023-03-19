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
public class egg_EctraEjercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que averigüe si dos vectores de N enteros son 
        iguales (la comparación deberá detenerse en cuanto se detecte alguna
        diferencia entre los elementos).
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector A :");
        int a = leer.nextInt();
        int[] vectorA = new int[a];
        System.out.println("Ingrese el tamaño del vector B :");
        int b = leer.nextInt();
        int[] vectorB = new int[b];

        for (int i = 0; i < a; i++) {
            vectorA[i] = (int) (Math.random() * 10);
            System.out.print(vectorA[i] + " ");

        }
        System.out.println(" ");
        for (int i = 0; i < b; i++) {
            vectorB[i] =(int) (Math.random() * 10);
            System.out.print(vectorB[i] + " ");
        }
        System.out.println(" ");
        if (vectorA.length != vectorB.length) {
            System.out.println("Los vectores son distintos dado a su longitud diferente");
        } else {
            for (int i = 0; i < a; i++) {
                if (vectorA[i] != vectorB[i]) {
                    System.out.println("Los vectores tienen distintos dato en el subindice" + i);
                } else {
                    System.out.println("Los vectores A y B son iguales");
                }
            }

        }

    }

}


