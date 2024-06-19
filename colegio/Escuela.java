package colegio;

public class Escuela {

    public static void programa() {
        // Crear 5 estudiantes
        Estudiante estudiante1 = new Estudiante("Diego García", "dg@scl.edu.gt", "A", 8, true);
        Estudiante estudiante2 = new Estudiante("Alejandra Guerra", "ag@scl.edu.gt", "B", 8, true);
        Estudiante estudiante3 = new Estudiante("María José Estrada", "mje@scl.edu.gt", "A", 9, true);
        Estudiante estudiante4 = new Estudiante("Samantha Ovando", "so@scl.edu.gt", "B", 8, true);
        Estudiante estudiante5 = new Estudiante("Carlos Méndez", "cm@scl.edu.gt", "A", 8, true);

        // Crear 4 cursos
        Cursos curso1 = new Cursos("Matemática");
        Cursos curso2 = new Cursos("Lenguaje");
        Cursos curso3 = new Cursos("Lectura");
        Cursos curso4 = new Cursos("Sociales");

        // Imprimir listado de alumnos (nombre, correo)
        System.out.println("Listado de alumnos y correos:");
        System.out.println(estudiante1.getNombre() + ", " + estudiante1.getCorreo());
        System.out.println(estudiante2.getNombre() + ", " + estudiante2.getCorreo());
        System.out.println(estudiante3.getNombre() + ", " + estudiante3.getCorreo());
        System.out.println(estudiante4.getNombre() + ", " + estudiante4.getCorreo());
        System.out.println(estudiante5.getNombre() + ", " + estudiante5.getCorreo());

        // Imprimir listado de cursos
        System.out.println("\nListado de cursos:");
        System.out.println(curso1.getNombreCurso());
        System.out.println(curso2.getNombreCurso());
        System.out.println(curso3.getNombreCurso());
        System.out.println(curso4.getNombreCurso());
    }

    public static void main(String[] args) {
        programa();
    }
}
