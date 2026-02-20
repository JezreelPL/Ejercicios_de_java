package ejercicio3sistema_de_priorización_de_pacientes;
import java.util.Scanner;
public class Ejercicio3Sistema_de_Priorización_de_Pacientes {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a la Salas de Emergencias");
        System.out.println(" Cuantos pacientes estan en espera?");
        int numeroPacientes = teclado.nextInt();
        Paciente pacientes[] = new Paciente[numeroPacientes];
        System.out.println("--------------------------------------------------------");
        System.out.println("INGRESE LOS DATOS DE LOS PACIENTES SOLICITADOS");
        System.out.println("--------------------------------------------------------");
        for(int i=0; i<pacientes.length;i++){
            System.out.println("\n--- INGRESE EL PACIENTE: " + (i + 1) + " ---");
            pacientes[i] = new Paciente();

            System.out.println("ID: ");
            pacientes[i].setId(teclado.next());
            teclado.nextLine();
            System.out.println("Nombre: ");
            pacientes[i].setNombre(teclado.nextLine());
            
            System.out.println("Edad: ");
            pacientes[i].setEdad(teclado.nextInt());

            int gravedadValida;
            do {
                System.out.println("Nivel de gravedad (1-5): ");
                gravedadValida = teclado.nextInt();
                if (gravedadValida < 1 || gravedadValida > 5) {
                    System.out.println("Invalido. Escriba un rango de 1 a 5.");
                }
            } while (gravedadValida < 1 || gravedadValida > 5);
            pacientes[i].setGravedad(gravedadValida);

            System.out.println("Ingrese el tiempo de espera en (min): ");
            pacientes[i].setTiempoEspera(teclado.nextInt());
            teclado.nextLine(); 
            
        }
        
                
        //Algoritmo bubbleSort
        int comparaciones = 0;
        int intercambios = 0;

        for (int i = 0; i < pacientes.length - 1; i++) {
            for (int j = 0; j < pacientes.length - 1 - i; j++) {
                comparaciones++;
                boolean debeIntercambiar = false;
                if (pacientes[j].getGravedad() < pacientes[j + 1].getGravedad()) {
                    debeIntercambiar = true;
                } 
                else if (pacientes[j].getGravedad() == pacientes[j + 1].getGravedad()) {
                    if (pacientes[j].getTiempoEspera() < pacientes[j + 1].getTiempoEspera()) {
                        debeIntercambiar = true;
                    } 
                    else if (pacientes[j].getTiempoEspera() == pacientes[j + 1].getTiempoEspera()) {
                        if (pacientes[j].getEdad() < pacientes[j + 1].getEdad()) {
                            debeIntercambiar = true;
                        } 
                      else if (pacientes[j].getEdad() == pacientes[j + 1].getEdad()) {
                        if (compararNombres(pacientes[j].getNombre(), pacientes[j + 1].getNombre()) > 0) {
                            debeIntercambiar = true;
                        }
                    }
                    }
                }

                if (debeIntercambiar) {
                    intercambios++;
                    Paciente temp = pacientes[j];
                    pacientes[j] = pacientes[j + 1];
                    pacientes[j + 1] = temp;
                }
            }
        }
        
        //salida de los pacientes con prioridad
        System.out.println("\n==============================================================================================");
        System.out.println("          LISTA DE PACIENTES PRIORIZADA");
        System.out.println("==============================================================================================");
        System.out.printf("%-10s | %-20s | %-10s | %-20s | %-5s\n", "ID", "Nombre", "Gravedad", "Tiempo en espera", "Edad");
        System.out.println("----------------------------------------------------------------------------------------------");

        for (int i = 0; i < pacientes.length; i++) {
            System.out.printf("%-10s | %-20s | %-10d | %-3d min             | %-5d\n", 
                pacientes[i].getId(), 
                pacientes[i].getNombre(), 
                pacientes[i].getGravedad(), 
                pacientes[i].getTiempoEspera(),
                pacientes[i].getEdad());
        }

        if (pacientes.length > 0) {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("SIGUIENTE PACIENTE A ATENDER: " + pacientes[0].getNombre());
        System.out.println("ID: " + pacientes[0].getId() + " | GRAVEDAD: " + pacientes[0].getGravedad());
        System.out.println("---------------------------------------------------------");
        }
        
        System.out.println("\n--- REPORTE TECNICO ---");
        System.out.println("Comparaciones realizadas: " + comparaciones);
        System.out.println("Intercambios realizados: " + intercambios);
        System.out.println("Complejidad Teorica: O(n^2)");
                
        
    }
    //funcion para comparar el nombre y ordenar alfabeticamente
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
                return letra1 - letra2; // Diferencia basada en la tabla ASCII
            }
        }
        return len1 - len2; 
}
    
}
