package conversor;
import mis_metodos.ListaDeOpciones;

import java.util.Scanner;

public class Conversiones {
    private static String[] opciones = {
            "Fahrenheit/Celsius",
            "Celsius/Fahrenheit"
    };

    public static double cAf(double gradosC) {
        return (gradosC - 32) * 5 / 9;
    }

    public static double fAc(double gradosF) {
        return (gradosF * 9 / 5) + 32;
    }

    public static void programaGrados() {
        ListaDeOpciones.cargarOpciones(opciones);

        Scanner intDato = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = intDato.nextInt();

        if (opcion == 1) {
            System.out.print("Fahrenheit: ");
        } else if (opcion == 2) {
            System.out.print("Celcius: ");
        } else {
            System.out.println("Opción no disponible");
        }

        double grados = intDato.nextDouble();
        double cAf = opcion == 1 ? fAc(grados) : cAf(grados);

        System.out.print("Conversión: " + cAf + "\n");

        intDato.close();

    }
}


