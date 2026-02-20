package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empleado empleado = new Empleado();
        Operaciones operacion = new Operaciones();
        
        Empleado lista[] = new Empleado[1];
        for(int i = 0; i<lista.length; i++){
            lista[i] = new Empleado();
            System.out.println("Escribe los datos del Empleado "  + (i+1));
            
            System.out.println("Escribe el codigo del empleado");
            lista[i].setCodigo(teclado.nextInt());
            
            teclado.nextLine();
            
            System.out.println("Escribe el nombre del Empleado");
            lista[i].setNombre(teclado.nextLine());
            
            System.out.println("Ingrese su 'Salario base'");
            lista[i].setSalarioBase(teclado.nextDouble());
            
            System.out.println("Ingrese sus 'Horas extras trabajadas'");
            lista[i].setHoras(teclado.nextInt());
            
            System.out.println("Ingrese la 'Bonificacion fija'");
            lista[i].setBonificacionFija(teclado.nextDouble());
            
            System.out.println("Ingrese la 'Bonificacion por Productividad'");
            lista[i].setBonificacionProductiva(teclado.nextDouble());
            
            System.out.println("Ingrese el 'Descuento por prestamo'");
            lista[i].setDescuentoPrestamo(teclado.nextDouble());
            
            //Operaciones para cada empleado ingresado 
            operacion.pagoPorHorasExtras(lista[i]);
            operacion.calculoDeIGSS(lista[i]);
            operacion.calculoDeIRTRA(lista[i]);
            operacion.calculoDeINTECAP(lista[i]);
            operacion.descuentosTotales(lista[i]);
            operacion.salarioNeto(lista[i]);
        }
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\n%-7s %-15s %-14s %-14s %-16s %-10s %-10s %-10s %-18s %-12s\n", 
        "Codigo", "Nombre", "Salario Base", "Horas Extras", "Bonificaciones", "IGSS", "IRTRA", "INTECAP", "Tot. Descuentos", "Neto");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for(int j = 0; j < lista.length; j++){
        System.out.printf("%-7d %-15s %-14.2f %-14.2f %-16.2f %-10.2f %-10.2f %-10.2f %-18.2f %-12.2f\n", 
        lista[j].getCodigo(), 
        lista[j].getNombre(), 
        lista[j].getSalarioBase(),  
        lista[j].getPagoHorasExtras(), 
        lista[j].getBonificacionFija() + lista[j].getBonificacionProductiva(),
        lista[j].getMontoIgss(),
        lista[j].getMontoIrtra(),
        lista[j].getMontoIntecap(),
        lista[j].getTotalDescuentos(),
        lista[j].getCalculoSalarioNeto());   
        }
    }
    
}
