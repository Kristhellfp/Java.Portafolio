import conversor.ConversorDeMonedas;
import interfaz_grafica.Banner;
import lista.ListaDeCompras;
import calculadora.Mate;
import mis_metodos.ListaDeOpciones;
import IMC.programaIMC;
import conversor.Conversiones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // LISTA DE OPCIONES
        String[] listaDeOpciones = {
                "Calculadora", "IMC","Farenheit / Celsius", "Calcular edad","Grados",
                "Lista de compras","Opción_7", "Opción_8", "Opción_9", "Salir"
        };

        boolean programa = true;
        do {
            Banner.mensaje();

            ListaDeOpciones.cargarOpciones(listaDeOpciones);

            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            System.out.println("----------------------------------------------");

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
                    break;
                case 5:
                    break;
                case 6:
                    ListaDeCompras.programa();
                    programa = false;
                    break;

                case 7:
                    ConversorDeMonedas.programa();
                    programa = false;
                    break;

                case 10:
                    programa = false;
                    break;
            }
        }while (programa);

    }
}