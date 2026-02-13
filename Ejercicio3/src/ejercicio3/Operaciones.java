package ejercicio3;
public class Operaciones {
        //calculo de las horas extras del empleado
    public void pagoPorHorasExtras(Empleado empleado){
        double valorHora;
        valorHora = (empleado.getSalarioBase() / 30) / 8;
        empleado.setPagoHorasExtras((valorHora * Empleado.horasExtras) * empleado.getHoras());
    }
    //calculo del descuento del IGSS
    public void calculoDeIGSS(Empleado empleado){
        empleado.setMontoIgss(empleado.getSalarioBase() * Empleado.getDescuentosIGSS());
    }
    //calculo del descuento del IRTRA
    public void calculoDeIRTRA(Empleado empleado){
        empleado.setMontoIrtra(empleado.getSalarioBase() * Empleado.getDescuentosIRTRA());
    }
    //calculo del descuento del INTECAP
    public void calculoDeINTECAP(Empleado empleado){
        empleado.setMontoIntecap(empleado.getSalarioBase()* Empleado.getDescuentosINTECAP());
    }
    //calculo de los descuentos totales
    public void descuentosTotales(Empleado empleado){
     empleado.setTotalDescuentos(empleado.getMontoIgss() + empleado.getMontoIrtra() + empleado.getMontoIntecap() + empleado.getDescuentoPrestamo());
    }
    //calculo del salario neto con todos los calculos acumulados y restados
    public void salarioNeto(Empleado empleado){
        empleado.setCalculoSalarioNeto(empleado.getSalarioBase() + empleado.getBonificacionFija() + empleado.getBonificacionProductiva() + empleado.getPagoHorasExtras() - empleado.getMontoIgss() - empleado.getMontoIrtra() - empleado.getMontoIntecap() - empleado.getDescuentoPrestamo() );
    }
    
}
