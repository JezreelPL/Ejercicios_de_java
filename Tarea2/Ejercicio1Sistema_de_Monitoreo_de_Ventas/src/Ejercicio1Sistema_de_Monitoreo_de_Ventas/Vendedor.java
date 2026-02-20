package Ejercicio1Sistema_de_Monitoreo_de_Ventas;

public class Vendedor {
    String codigo;
    String nombre;
    float TotalVentasAlDia;
    int NumeroProductosVendidos;

    public Vendedor() {
    }

    public Vendedor(String codigo, String nombre, float TotalVentasAlDia, int NumeroProductosVendidos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.TotalVentasAlDia = TotalVentasAlDia;
        this.NumeroProductosVendidos = NumeroProductosVendidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTotalVentasAlDia() {
        return TotalVentasAlDia;
    }

    public void setTotalVentasAlDia(float TotalVentasAlDia) {
        this.TotalVentasAlDia = TotalVentasAlDia;
    }

    public int getNumeroProductosVendidos() {
        return NumeroProductosVendidos;
    }

    public void setNumeroProductosVendidos(int NumeroProductosVendidos) {
        this.NumeroProductosVendidos = NumeroProductosVendidos;
    }
    
}
