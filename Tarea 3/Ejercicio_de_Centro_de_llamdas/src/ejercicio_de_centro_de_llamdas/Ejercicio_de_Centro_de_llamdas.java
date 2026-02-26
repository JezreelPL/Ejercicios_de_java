package ejercicio_de_centro_de_llamdas;
import java.util.Scanner;
public class Ejercicio_de_Centro_de_llamdas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorId = 1;
        int opcion;
        ColaCircular colaAlta = new ColaCircular(5);   //alta 1
        ColaCircular colaMedia = new ColaCircular(5);  //media 3
        ColaCircular colaBaja = new ColaCircular(5);   //baja 5
        
        System.out.println("BIENVENIDO AL CALL CENTER");
        do{
            System.out.println("1. Atender Tickets");
            System.out.println("2. Atender siguiente Ticket");
            System.out.println("3. Reporte de tiempo de espera");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    System.out.print("Asunto del ticket: ");
                    String asunto = teclado.nextLine();
                    System.out.print("Prioridad (1-Alta, 3-Media, 5-Baja): ");
                    int prioridad = teclado.nextInt();               
                    Ticket nuevo = new Ticket(contadorId++, asunto, prioridad);
                    
                    if (prioridad <= 2){
                        colaAlta.encolar(nuevo);
                    }
                    else if (prioridad == 3){
                        colaMedia.encolar(nuevo);
                    }
                    else {
                        colaBaja.encolar(nuevo);
                    }
                    break;
                case 2:
                    Ticket atendido = null;
                    if (colaAlta.getCantidadActual() > 0) {
                        atendido = colaAlta.atenderTicket();
                    } else if (colaMedia.getCantidadActual() > 0) {
                        atendido = colaMedia.atenderTicket();
                    } else if (colaBaja.getCantidadActual() > 0) {
                        atendido = colaBaja.atenderTicket();
                    }
                    if (atendido != null) {
                        System.out.println("Atendiendo ahora: " + atendido.asunto + " (ID: " + atendido.id + ")");
                    } else {
                        System.out.println("No hay tickets en ninguna cola.");
                    }
                    break;
                case 3:
                    System.out.println("--- Reportes Individuales ---");
                    colaAlta.reporteTiempoPromedio();
                    colaMedia.reporteTiempoPromedio();
                    colaBaja.reporteTiempoPromedio();
                    break;
                case 4:
                    System.out.println("Saliedo del programa...");
                    break;
                default:
                    break;
            }
                
        }while(opcion != 4);     
    }  
}
