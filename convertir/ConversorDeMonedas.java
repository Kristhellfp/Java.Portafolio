package convertir;

import opciones.ListaDeOpciones;
import java.util.Scanner;

public class ConversorDeMonedas {
    private static String[] OpcionesMonedas = {
            "Quetzales/Dólares", "Dólares/Quetzales",
            "Quetzales/ Peso Mexicano", "Peso Mexicano/Quetzalez"

    };


    public static void programa() {
        ListaDeOpciones.cargarOpciones(OpcionesMonedas);

        Scanner scanner = new Scanner(System.in);
        System.out.println("[?]");
        String rScanner = scanner.nextLine();

        switch (rScanner) {
            case "1":
                System.out.println("[Q:]");
                double rQ= scanner.nextDouble();
                System.out.println("[$] Respuesta" + rQ);

                break;

            case "2":
                System.out.println("[$:]");
                double rD = scanner.nextDouble();
                System.out.println("[Q] Respuesta" + rD);

            case "3":
                System.out.println("[Q:]");
                double RQ = scanner.nextDouble();
                System.out.println("[MX] Respuesta" + RQ);

            case "4":
                System.out.println("[MX:]");
                double mX = scanner.nextDouble();
                System.out.println("[Q] Respuesta" + mX);


        }

    }

    public static double rD(double quetzales) {
        double dolares = quetzales * (1 / 7.5);
        return dolares;
    }

    public static double rQ(double dolares) {
        double quetzales = dolares * (1 / 0.13);
        return quetzales;
    }

    public static double RQ(double quetzal) {
        double peso = quetzal * (1 / 2.37);
        return peso;
    }

    public static double mX(double peso) {
        double quetzal = peso * (1 / 0.42);
        return quetzal;

    }
}



