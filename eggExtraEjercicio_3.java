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
public class eggExtraEjercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear una función rellene un vector con números aleatorios, pasándole
        un arreglo por parámetro. Después haremos otra función o procedimiento 
        que imprima el vector.
         */
        int[] array = new int[5]; // declarar el vector
        int [] retorno = llenarVector(array); 
        mostrarVector(array);

    }

    public static int [] llenarVector(int[] vector) { 

        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 10);

        }
        return vector;
    }

    public static void mostrarVector(int[] vector) {

        for (int i = 0; i < 5; i++) {
            System.out.print("[ " + vector[i] + " ]" + " ");
           
        }
         System.out.println(" ");
    }
}

