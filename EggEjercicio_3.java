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
public class EggEjercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int n, aux, c;
        System.out.println("Ingrese tamaño del vector: ");
        n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            /// 1 - 100000
            vector[i] = (int) (Math.random() * 10000 + 1);
        }

        for (int i = 0; i < n; i++) {
            c = 0;
            aux = vector[i];
            System.out.print(vector[i]+" ");
            while (aux > 0) {  /// 100 / 10 = aux = 10/10  aux = 1 /10
                aux = aux / 10;
                c++;
            }
            switch (c) {
                case 1:
                    System.out.println("El numero tiene 1 cifra");
                    break;
                case 2:
                    System.out.println("El numero tiene 2 cifra");
                    break;
                case 3:
                    System.out.println("El numero tiene 3 cifra");
                    break;
                case 4:
                    System.out.println("El numero tiene 4 cifra");
                    break;
                case 5:
                    System.out.println("El numero tiene 5 cifra");
                    break;
                default:
                    System.out.println("TIENE MAS DE 5 CIFRAS");
                    break;
            }
        }

    }
        
    }