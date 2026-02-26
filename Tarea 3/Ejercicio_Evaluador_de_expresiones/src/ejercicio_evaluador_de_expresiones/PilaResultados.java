package ejercicio_evaluador_de_expresiones;
public class PilaResultados {
    
   double[] datos;
   int tope;
   int maximo;
   
   public PilaResultados(int tamano) {
        this.maximo = tamano;
        this.datos = new double[maximo];
        this.tope = -1;
    }
   
    public void push(double valor) {
        if (tope < maximo - 1) {
            tope++;
            datos[tope] = valor;
        } else {
            System.out.println("Error: Pila llena");
        }
    }

    public double pop() {
        if (tope == -1) {
            return ' '; 
        }
        double aux = datos[tope];
        tope--;
        return aux;
    }
    
    public boolean estaVacia() {
        return (tope == -1);
    }
    
}
