package colegio;

public class Estudiante {
    private final String nombre;
    private String correo;
    private String carrera;
    private int edad;
    private boolean solvencia;

    public Estudiante(String nombre, String correo, String carrera, int edad, boolean solvencia) {
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
        this.solvencia = solvencia;
    }

    // GET
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isSolvencia() {
        return solvencia;
    }

    // SET
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSolvencia(boolean solvencia) {
        this.solvencia = solvencia;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Correo: %s, Carrera: %s, Edad: %d, Solvencia: %b",
                nombre, correo, carrera, edad, solvencia);
    }
}
