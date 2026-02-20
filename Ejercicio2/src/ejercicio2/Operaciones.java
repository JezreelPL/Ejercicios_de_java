package ejercicio2;
import java.util.Scanner;
public class Operaciones {
    Scanner teclado = new Scanner(System.in);
    
    //suma de las matrices 
    public int[][] suma(int[][] matriz1, int[][] matriz2) {     
        int suma[][] = new int[3][3];

        // Proceso de suma
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("RESULTADO DE LA SUMA DE LAS MATRICES");
        for(int i=0; i<3; i++){
           for(int j=0;j<3;j++){
               System.out.print(suma[i][j] + "\t");
           }
            System.out.println();
       }
        return suma;
    }
    
    //Comprobacion si la matriz es simetrica
    public void comprobarSimetria(int[][] matrizResultante) {
    boolean Simetrica = true;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            // Comparamos el original con su espejo
            if (matrizResultante[i][j] != matrizResultante[j][i]) {
                Simetrica = false;
                break; 
            }
        }
    }

    if (Simetrica) {
        System.out.println("La matriz es simetrica.");
    } else {
        System.out.println("La matriz NO es simetrica.");
    }
}   
  //Resta de las matrices
    public void resta(int[][] matriz1, int[][] matriz2){
        int resta[][] = new int[3][3]; 
        //resta de matrices
         for(int i=0; i<3; i++){
           for(int j=0;j<3;j++){
               resta[i][j] = matriz1[i][j] - matriz2[i][j];
           }
       }
        
        System.out.println("---------------------------------------------");
        System.out.println("RESULTADO DE LA RESTA DE LAS MATRICES");
        for(int i=0; i<3; i++){
           for(int j=0;j<3;j++){
               System.out.print(resta[i][j] + "\t");
           }
            System.out.println();
       }   
    }
    
    //multiplicacion de las matrices
    public void multiplicacion(int[][] matriz1, int[][] matriz2){
       int multiplicacion[][] = new int [3][3]; 
       
       for(int i=0; i<3; i++){
           for(int j=0;j<3;j++){
               for(int k=0;k<3;k++){
                   multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j]; //Fila por columna, suma todo.
               }
           }
       }
       System.out.println("-------------------------------------------");
        System.out.println("RESULTADO DE LA MULTIPLICACION DE LAS MATRICES");
        for(int i=0; i<3; i++){
           for(int j=0;j<3;j++){
               System.out.print(multiplicacion[i][j] + "\t");
           }
            System.out.println();
       } 
    }

    
}
