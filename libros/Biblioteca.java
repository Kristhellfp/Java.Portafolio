package libros;

import java.util.Scanner;

public class Biblioteca {

    public static void programa(){
        System.out.println("Bibliteca");

        Libro libro1 = new Libro("La tregua", "Mario Benedetti", "1960");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "1967");
        Libro libro3 = new Libro("Rayuela", "Julio Cortázar", "1963");
        Libro libro4 = new Libro("La casa de los espíritus", "Isabel Allende", "1982");
        Libro libro5 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", "1985");
        Libro libro6 = new Libro("Los funerales de la Mamá Grande", "Gabriel García Márquez", "1962");
        Libro libro7 = new Libro("La invención de Morel", "Adolfo Bioy Casares", "1940");  // Bioy Casares, amigo de Borges y también influyente
        Libro libro8 = new Libro("La ciudad y los perros", "Mario Vargas Llosa", "1963");  // Incluyo a Mario Vargas Llosa por su importancia literaria
        Libro libro9 = new Libro("El otoño del patriarca", "Gabriel García Márquez", "1975");
        Libro libro10 = new Libro("La casa de los espíritus", "Isabel Allende", "1982");




        Scanner scr = new Scanner(System.in);


        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());

        //AUTORES
        libro1.setAutor("Kriss");
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        //FECHAS
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());


        System.out.println(libro1.toString());
    }
}
