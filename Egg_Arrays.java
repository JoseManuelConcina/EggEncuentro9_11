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
public class Egg_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] Equipo = new String[9];
        System.out.println("Ingrese los nombres de los comañeros del dia:");
        for (int i = 0; i < 9; i++) {
            System.out.println((i+1)+". Ingrese el nombre: ");
               Equipo[i]=leer.next();
             
            }
            
        
        for (int i = 0; i < 9 ; i++) {
            System.out.print(Equipo[i]+" ");
            
        }
            
        System.out.println(" ");
                
        
    }
    
}
