package colegio;

public class Cursos {
    private String nombreCurso;

    // Constructor
    public Cursos(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    // GET
    public String getNombreCurso() {
        return nombreCurso;
    }

    // SET
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Override
    public String toString() {
        return "Curso: " + nombreCurso;
    }
}
