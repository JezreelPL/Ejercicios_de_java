package ejercicio3sistema_de_priorización_de_pacientes;
public class Paciente {
    String id;
    String nombre;
    int edad;
    int gravedad;
    int tiempoEspera;   

    public Paciente() {
    }

    public Paciente(String id, String nombre, int edad, int gravedad, int tiempoEspera) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.gravedad = gravedad;
        this.tiempoEspera = tiempoEspera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }
}
