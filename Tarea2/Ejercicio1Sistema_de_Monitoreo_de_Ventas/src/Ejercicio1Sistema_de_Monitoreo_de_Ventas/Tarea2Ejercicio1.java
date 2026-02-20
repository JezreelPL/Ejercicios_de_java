package Ejercicio1Sistema_de_Monitoreo_de_Ventas;
import java.util.Scanner;
public class Tarea2Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanioArreglo;
        System.out.println("Bienvenido");
        
        // Validación para que el usuario coloque mas de 5 vendedores
        do {
            System.out.print("Ingrese el numero de vendedores (minimo 5): ");
            tamanioArreglo = teclado.nextInt();
            if (tamanioArreglo < 5) {
                System.out.println("Error: El numero debe ser mayor o igual a 5.");
            }
        } while (tamanioArreglo < 5);
        
        Vendedor vendedores[] = new Vendedor[tamanioArreglo];
        
        System.out.println("----------------------------------------------------");
        System.out.println("INGRESE LOS DATOS DE LOS VENDEDORES");
        for(int i=0; i<vendedores.length; i++){
            System.out.println("----------------------------------------------------");
            System.out.println("Ingrese los datos del vendedor " + (i+1));
            vendedores[i] = new Vendedor();
            
            System.out.println("Codigo");
            vendedores[i].setCodigo(teclado.next());
            teclado.nextLine();
            System.out.println("Nombre");
            vendedores[i].setNombre(teclado.nextLine());
            
            System.out.println("Total de ventas");
            vendedores[i].setTotalVentasAlDia(teclado.nextFloat());
            
            System.out.println("Numero de productos vendidos");
            vendedores[i].setNumeroProductosVendidos(teclado.nextInt());
        }
         bubbleSort(vendedores);
        
        System.out.println("\n====================================================================");
        System.out.printf("%-12s %-20s %-15s %-10s\n", "CODIGO", "NOMBRE", "TOTAL VENTAS", "NO. PRODUCTOS");
        System.out.println("--------------------------------------------------------------------");

        for (Vendedor v : vendedores) {
            System.out.printf("%-12s %-20s %-15.2f %-10d\n", 
                v.getCodigo(), 
                v.getNombre(), 
                v.getTotalVentasAlDia(), 
                v.getNumeroProductosVendidos());
        }
        System.out.println("====================================================================");
        
    }
    
    
        //funcion para el ordenamiento borbuja
        public static void bubbleSort(Vendedor[] v) {
        int n = v.length;
        for (int p = 0; p < n - 1; p++) {
            boolean cambio = false;
            for (int i = 0; i < n - 1 - p; i++) {       
                boolean debeIntercambiar = false;
                if (v[i].getTotalVentasAlDia() < v[i + 1].getTotalVentasAlDia()) {
                    debeIntercambiar = true;
                } 
                else if (v[i].getTotalVentasAlDia() == v[i + 1].getTotalVentasAlDia()) {
                    if (v[i].getNumeroProductosVendidos() < v[i + 1].getNumeroProductosVendidos()) {
                        debeIntercambiar = true;
                    }
                }
                if (debeIntercambiar) {
                    Vendedor aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    cambio = true;
                }
            }
            if (!cambio) break;
        }
    }
    
}
