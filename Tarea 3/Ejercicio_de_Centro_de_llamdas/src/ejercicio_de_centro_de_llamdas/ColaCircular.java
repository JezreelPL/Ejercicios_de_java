package ejercicio_de_centro_de_llamdas;
public class ColaCircular {
    private Ticket[] tickets;
    int frente;
    int finalCola;
    int maximo;
    int cantidadActual;
    
    public ColaCircular(int tamano) {
        this.maximo = tamano;
        this.tickets = new Ticket[maximo];
        this.frente = 0;
        this.finalCola = -1;
        this.cantidadActual = 0;
    }
    
    public void encolar(Ticket nuevo) {
        if (cantidadActual == maximo) {
            System.out.println("La cola esta llena. No se puede agregar el ticket ID: " + nuevo.id);
        } else {
            finalCola = (finalCola + 1) % maximo;
            tickets[finalCola] = nuevo;
            cantidadActual++;
            System.out.println("Ticket ID " + nuevo.id + " encolado en posicion " + finalCola);
        }
    }
    
        int tiempoTotalEspera = 0; 
        int tiempo_por_ticket = 15;
        int totalAtendidos = 0;

        public Ticket atenderTicket() {
            if (cantidadActual == 0) {
                System.out.println("No hay tickets pendientes.");
                return null;
            } else {
                Ticket atendido = tickets[frente];
                tiempoTotalEspera += (totalAtendidos * tiempo_por_ticket);

                tickets[frente] = null;
                frente = (frente + 1) % maximo;
                cantidadActual--;    
                totalAtendidos++;
                return atendido;
            }
        }

        public void reporteTiempoPromedio() {
            if (totalAtendidos == 0) {
                System.out.println("Aun no se han atendido tickets en esta prioridad.");
            } else {
                double promedio = (double) tiempoTotalEspera / totalAtendidos; 

                System.out.println("REPORTE DE CALL CENTER");
                System.out.println("Total de tickets atendidos: " + totalAtendidos);
                System.out.println("Tiempo promedio de espera: " + promedio + " minutos.");
                System.out.println("-------------------------------------------");
            }
        }
    //getters
    public int getCantidadActual() {
        return cantidadActual;
    }
    public int getTotalAtendidos() {
        return totalAtendidos;
    }    
}
