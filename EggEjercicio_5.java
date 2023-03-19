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
public class EggEjercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cont1 = 0;
      int [][] matriz={{0,-2,4}, {2,0,2}, {-4,-2,0}};
        int[][] matrizA = new int[3][3];
       int num,num2;   
        
        System.out.println("Matriz original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[j][i] = matriz[i][j] * -1;
            }
        }
        System.out.println("\nMatriz tranversa con cambio de signos");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matrizA[j][i] + " ]");
            }
            System.out.println(" ");
            

        }
        System.out.println("\n Comparacion de los datos:");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num=matriz[i][j];
                num2=matrizA[j][i];
                System.out.println("[ "+num+" ]   [ "+num2+" ]");
                if (num==num2*-1) {
                   cont1++; 
                    if (cont1==(matriz.length)*matriz.length) {
                    System.out.println("transpuesta");
                    }
                }
     
            }
        }
    }
}    
            
  
       
       /*
    public static void main(String[] args) {
   int num,num2,x=0;
   int [][] matriz={{0,-2,4}, {2,0,2}, {-40,-2,0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num=matriz[i][j];
                num2=matrizA[j][i];
                System.out.println(num+" "+num2);
                if (num==num2*-1) {
                   x++; 
                    if (x==(matriz.length)*matriz.length) {
                    System.out.println("transpuesta");
                    }
                }
     
            }
        }
    
    }
    
    
    
    */
        
         