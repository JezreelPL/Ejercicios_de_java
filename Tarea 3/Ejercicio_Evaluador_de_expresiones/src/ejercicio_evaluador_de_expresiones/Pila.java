package ejercicio_evaluador_de_expresiones;
public class Pila {
   char[] datos;
   int tope;
   int maximo;
   
   public Pila(int tamano) {
        this.maximo = tamano;
        this.datos = new char[maximo];
        this.tope = -1;
    }
   
    public void push(char c) {
        if (tope < maximo - 1) {
            tope++;
            datos[tope] = c;
        } else {
            System.out.println("Error: Pila llena");
        }
    }

    public char pop() {
        if (tope == -1) {
            return ' '; 
        }
        char aux = datos[tope];
        tope--;
        return aux;
    }
    
    public boolean estaVacia() {
        return (tope == -1);
    }
    
    public char verTope() {
    if (tope == -1) {
        return ' '; 
    }
    return datos[tope];
}
}
   
