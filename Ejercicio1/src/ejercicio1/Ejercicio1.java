package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      Tareas tarea = new Tareas();
      
      int opcion;  
       String oracion;
       System.out.println("Escribe una frase");
       oracion = teclado.nextLine();
           
      do{
          System.out.println("Elija la opcion");
          System.out.println("1. convertir una oracion en MAYUSCULAS");
          System.out.println("2. contar cuatas palabras tiene la oracion");
          System.out.println("3. invertir la oracion");
          System.out.println("4. contar cuantas vocales tiene la oracion");
          System.out.println("5. Salir");
          opcion = teclado.nextInt();
          
          switch(opcion){
              case 1:
                  tarea.convertir(oracion);
                  break;
              case 2:
                  tarea.contarPalabras(oracion);
                  break;
              case 3:
                  tarea.oracionIvertida(oracion);
                  break;
              case 4:
                  tarea.contarVocales(oracion);
                  break;
              case 5:
                  System.out.println("Saliendo del programa...");
                  break;
              default:
                  System.out.println("opcion equivoaca");
                  break;                  
          }            
      }while(opcion != 5); 
    }   
}
