package ejercicio1editor_de_texto;

public class PilaAccion {
    private Accion[] acciones;
    private int tope;
    private int maximo;

    public PilaAccion(int tamano) {
        this.maximo = tamano;
        this.acciones = new Accion[maximo];
        this.tope = -1; // pila vacia
    }
    
    
    public void agregarAccion(Accion nueva) {
       if (tope < maximo - 1) {
           tope++;
           acciones[tope] = nueva; 
           System.out.println("Accion guardada: " + nueva.tipo);
       } else {
           System.out.println("Error: La pila está llena (Stack Overflow)"); 
       }
   }
    
    public Accion deshacer() {
        if (tope == -1) {
            System.out.println("No hay nada que deshacer.");
            return null;
        } else {
            Accion eliminada = acciones[tope];
            acciones[tope] = null;
            tope--;
            return eliminada;
        }
}
    
    
    public Accion verUltima(){
        if (tope == -1) {
        System.out.println("La pila está vacia, no hay ultima accion.");
        return null;
        }
        return acciones[tope];
    }
    
    public void mostrarHistorial() {
    if (tope == -1) {
        System.out.println("El historial esta vacio.");
    } else {
        System.out.println("HISTORIAL DE ACCIONES");
        for (int i = tope; i >= 0; i--) {
            System.out.println("- " + acciones[i].tipo + ": " + acciones[i].detalle);
        }
    }
}  
}
