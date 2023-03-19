/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_arrays;

/**
 *
 * @author Anabela
 */
public class eggEjercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                /*
         Realizar un algoritmo que rellene un vector con los 100 primeros números
        enteros y los muestre por pantalla en orden descendente.

         */
        System.out.println("Carga de vector orden acendente: ");

    
        int[] vector = new int[100];

    
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
            System.out.print(vector[i] + " ");
        }
        
        System.out.println("\n Vector en orden decendente:");

        for (int i = 99; i >= 0; i--) {
            System.out.print(vector[i]+ " ");
        }
        System.out.println(" ");
    }

}

    

