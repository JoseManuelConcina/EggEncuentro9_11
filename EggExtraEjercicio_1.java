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
public class EggExtraEjercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos de 
        un vector de tamaño N, con los valores ingresados por el usuario.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n =leer.nextInt();
        int[] vector = new int[n] ;  
        int num;
        int aux=0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero para el subindice: "+i);
            num=leer.nextInt();
            vector[i]=num;
        }
         for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
            
        }
         for (int i = 0; i < n; i++) {
           aux += vector[i];
            
        }
        System.out.println("La suma de todos los datos es: "+aux );
    }
    
}
