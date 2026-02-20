package ejercicio2sistemaacademico;
import java.util.Scanner;
public class Ejercicio2SistemaAcademico {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Escribe el numero de estudiantes que desea ingresar al Sistema Academico");
        int numeroEstudiantes = teclado.nextInt();
        
        Estudiante estudiante[] = new Estudiante[numeroEstudiantes];
        System.out.println("----------------------------------------------------");
    
        for(int i = 0; i<estudiante.length; i++){
            System.out.println("Ingrese los datos del estudinate: " + (i+1));
            estudiante[i] = new Estudiante();
            System.out.println("----------------------------------------------------");
            System.out.println("Numero de Carnet: ");
            estudiante[i].setCarnet(teclado.next());
            teclado.nextLine();
            
            System.out.println("Nombre: ");
            estudiante[i].setNombre(teclado.nextLine());
            
            double promValido;
            do {
                System.out.println("Promedio general (1-100): ");
                promValido = teclado.nextDouble();
                if (promValido < 1 || promValido > 100) {
                    System.out.println("Valor invalido. Por favor use el rango de 1 a 100.");
                }
            } while (promValido < 1 || promValido > 100);
            estudiante[i].setPromedioGeneral(promValido);
            
            System.out.println("Numero de cursos aprobados");
            estudiante[i].setCursosAprobados(teclado.nextInt());
              
        }
        bubbleSort(estudiante);
        
        //muestra todos los estudiantes
        System.out.println("\n====================================================================");
        System.out.println("                RANKING COMPLETO DE ESTUDIANTES                     ");
        System.out.println("====================================================================");
        System.out.printf("%-15s %-20s %-10s %-10s\n", "CARNET", "NOMBRE", "PROMEDIO", "CURSOS");
        System.out.println("--------------------------------------------------------------------");

        for (Estudiante e : estudiante) {
            System.out.printf("%-15s %-20s %-10.2f%% %-10d\n", 
                e.getCarnet(), 
                e.getNombre(), 
                e.getPromedioGeneral(), 
                e.getCursosAprobados());
        }
        
        //muestra el ranking top 3
        System.out.println("\n====================================================================");
        System.out.println("             TOP 3 MEJORES PROMEDIOS (BECADOS)                ");
        System.out.println("====================================================================");

        // Determina cuantos mostrar (máximo 3)
        int limiteTop;
        if (estudiante.length < 3) {
            limiteTop = estudiante.length;
        } else {
            limiteTop = 3;
        }

        for (int i = 0; i < limiteTop; i++) {
            System.out.println((i + 1) + " Lugar: " + estudiante[i].getNombre() + " | Promedio: " + estudiante[i].getPromedioGeneral()+"%");
        }
        System.out.println("====================================================================");
    }
    
    
        //funcion para el ordenamiento borbuja
        static void bubbleSort(Estudiante[] e){
         
         int n = e.length;
         for (int p = 0; p < n - 1; p++){
             boolean cambio = false;
             for (int i = 0; i < n - 1 - p; i++){
                  boolean debeIntercambiar = false;
                  
                if (e[i].getPromedioGeneral() < e[i + 1].getPromedioGeneral()) {
                    debeIntercambiar = true;
                } 
                  else if (e[i].getPromedioGeneral() == e[i + 1].getPromedioGeneral()) {
                     if (e[i].getCursosAprobados() < e[i + 1].getCursosAprobados()) {
                         debeIntercambiar = true;
                     } else if (e[i].getCursosAprobados() == e[i + 1].getCursosAprobados()) { 
                         if (compararNombres(e[i].getNombre(), e[i + 1].getNombre()) > 0) {
                             debeIntercambiar = true;
                         }
                     }
                 }
                   if (debeIntercambiar) {
                    Estudiante aux = e[i];
                    e[i] = e[i + 1];
                    e[i + 1] = aux;
                    cambio = true;
                }
                }
             if (!cambio) break;
             }
             
         }
     
     
    //funcion para comparar los nombres de los estudiantes  
    private static int compararNombres(String nombre1, String nombre2) {
            int len1 = nombre1.length();
        int len2 = nombre2.length();
        int longitudMinima; 

        if (len1 < len2) {
            longitudMinima = len1;
        } else {
            longitudMinima = len2;
        }
        
        for (int i = 0; i < longitudMinima; i++) {
            char letra1 = nombre1.charAt(i);
            char letra2 = nombre2.charAt(i);
            
            if (letra1 != letra2) {
                return letra1 - letra2; // Retorna la diferencia ASCII
            }
        }
        return nombre1.length() - nombre2.length();
    }
    
}
