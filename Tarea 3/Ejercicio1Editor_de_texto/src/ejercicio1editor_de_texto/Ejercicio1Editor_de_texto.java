package ejercicio1editor_de_texto;
import java.util.Scanner;
public class Ejercicio1Editor_de_texto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PilaAccion miEditor = new PilaAccion(5);
        int opcion; 
        System.out.println("BIENVENIDO AL EDITOR DE TEXTO");
        do{
            System.out.println("1. Agregar accion");
            System.out.println("2. Desahcer la accion");
            System.out.println("3. Ver lo ultimo que hiciste");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:
                    System.out.print("Tipo de accion (Escritura/Formato/Borrado): ");
                    String tipo = teclado.nextLine();
                    System.out.print("Detalle de la accion: ");
                    String detalle = teclado.nextLine();                    
                    Accion nueva = new Accion(tipo, detalle);
                    miEditor.agregarAccion(nueva);
                    break;
                case 2:
                    Accion eliminada = miEditor.deshacer();
                    if (eliminada != null) {
                        System.out.println("Se ha deshecho: " + eliminada.tipo + " (" + eliminada.detalle + ")");
                    }
                    break;
                case 3:
                    Accion ultima = miEditor.verUltima();
                    if (ultima != null) {
                        System.out.println("Ultima accion realizada: " + ultima.tipo + " -> " + ultima.detalle);
                    }
                    break;
                case 4:
                    miEditor.mostrarHistorial();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            
        }while(opcion != 5);
    } 
}
