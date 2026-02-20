package ejercicio2sistemaacademico;
public class Estudiante {
    String carnet;
    String nombre;
    double promedioGeneral;
    int cursosAprobados;

    public Estudiante() {
    }

    public Estudiante(String carnet, String nombre, double promedioGeneral, int cursosAprobados) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.promedioGeneral = promedioGeneral;
        this.cursosAprobados = cursosAprobados;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    public int getCursosAprobados() {
        return cursosAprobados;
    }

    public void setCursosAprobados(int cursosAprobados) {
        this.cursosAprobados = cursosAprobados;
    }
}
