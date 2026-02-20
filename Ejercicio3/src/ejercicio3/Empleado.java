package ejercicio3;
public class Empleado {
   //atributos del empleado
    int codigo;
    String nombre;
    double salarioBase;
    int horas;
    double bonificacionFija;
    double bonificacionProductiva;
    double descuentoPrestamo;
    
    //atributos para los calculos del empleado
    public static final double horasExtras = 1.5;
    public static final double descuentosIGSS = 0.03;
    public static final double descuentosIRTRA = 0.01;
    public static final double descuentosINTECAP= 0.01;
    
    //atributos de resultados de los calculos    
    double calculoSalarioNeto;
    double pagoHorasExtras;
    double montoIgss;
    double montoIrtra;
    double montoIntecap;
    double totalDescuentos;

    
    public Empleado() {
    }

    public Empleado(int codigo, String nombre, double salarioBase, int horas, double bonificacionFija, double bonificacionProductiva, double descuetonPrestamo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horas = horas;
        this.bonificacionFija = bonificacionFija;
        this.bonificacionProductiva = bonificacionProductiva;
        this.descuentoPrestamo = descuentoPrestamo;
    }
  
//getters y setter de los atributos de entrada del empleado
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getBonificacionFija() {
        return bonificacionFija;
    }

    public void setBonificacionFija(double bonificacionFija) {
        this.bonificacionFija = bonificacionFija;
    }

    public double getBonificacionProductiva() {
        return bonificacionProductiva;
    }

    public void setBonificacionProductiva(double bonificacionProductiva) {
        this.bonificacionProductiva = bonificacionProductiva;
    }

    public double getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(double descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }
    
     //getters de los calculos de los atributos constantes
    public static double getHorasExtras() {
        return horasExtras;
    }

    public static double getDescuentosIGSS() {
        return descuentosIGSS;
    }

    public static double getDescuentosIRTRA() {
        return descuentosIRTRA;
    }

    public static double getDescuentosINTECAP() {
        return descuentosINTECAP;
    }
 
    //getters y setters de los resultados de los calculos
    public double getCalculoSalarioNeto() {
        return calculoSalarioNeto;
    }

    public void setCalculoSalarioNeto(double calculoSalarioNeto) {
        this.calculoSalarioNeto = calculoSalarioNeto;
    }

    public double getPagoHorasExtras() {
        return pagoHorasExtras;
    }

    public void setPagoHorasExtras(double pagoHorasExtras) {
        this.pagoHorasExtras = pagoHorasExtras;
    }

    public double getMontoIgss() {
        return montoIgss;
    }

    public void setMontoIgss(double montoIgss) {
        this.montoIgss = montoIgss;
    }

    public double getMontoIrtra() {
        return montoIrtra;
    }

    public void setMontoIrtra(double montoIrtra) {
        this.montoIrtra = montoIrtra;
    }

    public double getMontoIntecap() {
        return montoIntecap;
    }

    public void setMontoIntecap(double montoIntecap) {
        this.montoIntecap = montoIntecap;
    }

    public double getTotalDescuentos() {
        return totalDescuentos;
    }

    public void setTotalDescuentos(double totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }
    
}

