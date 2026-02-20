package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      Operaciones operacion = new Operaciones();
        int[][] resultadoSuma = new int[3][3];
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        System.out.println("Escribe los datos de 2 Matrices 3X3");
       System.out.println("ESCRIBE LOS DATOS DE LA MATRIZ 1");
       for(int f = 0; f < 3; f++){
           for(int c = 0; c < 3; c++){   
               System.out.println("Escribe el numero para pocision: " + " fila: " + (f+1) + " columna: " + (c+1));
               matriz1[f][c] = teclado.nextInt();
           } 
       }
        System.out.println("PRIMERA MATRIZ");
        for(int f = 0; f < 3; f++){
           for(int c = 0; c < 3; c++){   
               System.out.print(matriz1[f][c] + "\t");
           } 
            System.out.println();
       }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ESCRIBE LOS DATOS DE LA MATRIZ 2");
       for(int f2 = 0; f2 < 3; f2++){
           for (int c2 = 0; c2 < 3;c2++){
               System.out.println("Escribe un numero para la pocision: " + " fila: " + (f2+1) + " columna: " + (c2+1));
               matriz2[f2][c2] = teclado.nextInt();
           }
       }
       
         System.out.println("MATRIZ 2");
       for(int f2 = 0; f2 < 3; f2++){
           for (int c2 = 0; c2 < 3;c2++){
               System.out.print(matriz2[f2][c2] + "\t");
           }
           System.out.println();
       }
       
     int opcion;
      
      do{
          System.out.println("1. Suma de matrices");
          System.out.println("2. Resta de matrices");
          System.out.println("3. Multiplicacion de matrices");
          System.out.println("4. Determinar si la matriz resultante de la suma es simetrica");
          System.out.println("5. Salir");
          opcion = teclado.nextInt();
          
          
          switch(opcion){
              case 1:
                  resultadoSuma = operacion.suma(matriz1, matriz2);
                  break;
              case 2:
                  operacion.resta(matriz1, matriz2);
                  break;
              case 3:
                  operacion.multiplicacion(matriz1, matriz2);
                  break;
              case 4:
                  operacion.comprobarSimetria(resultadoSuma);
                  break;
              case 5:
                  System.out.println("Saliendo del programa...");
                  break;
              default:
                  System.out.println("Opcion incorrecta");
                  break;
          }
          
      }while(opcion != 5);
 
    }
    
}
