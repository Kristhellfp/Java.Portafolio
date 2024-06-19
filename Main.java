import calculadora.CalcularEdad;
import colegio.Cursos;
import colegio.Escuela;
import colegio.Estudiante;
import conversor.ConversorDeMonedas;
import conversor.Longitudes;
import interfaz_grafica.Banner;
import libros.Biblioteca;
import lista.ListaDeCompras;
import calculadora.Mate;
import mis_metodos.ListaDeOpciones;
import IMC.programaIMC;
import conversor.Conversiones;
import mis_metodos.MisMetodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "IMC","Farenheit / Celsius", "Calcular edad","Grados",
                "Lista de compras","Conversor Monedas", "Biblioteca", "Colegio", "Salir"
        };

        boolean programa = true;
        do {
            Banner.mensaje();
            MisMetodos.limpiarConsola();
            MisMetodos.imprimirLinea();

            ListaDeOpciones.cargarOpciones(listaDeOpciones);

            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            MisMetodos.imprimirLinea();

            // OPCIONES
            switch (opcion){
                case 1:
                    Mate.main();
                    programa = false;
                    break;
                case 2:
                    programaIMC.programaIMC();
                    programa = false;
                    break;
                case 3:
                    Conversiones.programaGrados();
                    programa = false;
                    break;
                case 4:
                    CalcularEdad.main();
                    break;
                case 5:
                    Longitudes.mds();
                    programa = false;
                    break;
                case 6:
                    ListaDeCompras.programa();
                    programa = false;
                    break;

                case 7:
                    ConversorDeMonedas.programa();
                    programa = false;
                    break;

                case 8:
                    Biblioteca.programa();
                    programa = false;
                    break;

                case 9:
                    Escuela.programa();
                    programa = false;
                    break;


            }
        }while (programa);
        MisMetodos.limpiarConsola();

    }
}