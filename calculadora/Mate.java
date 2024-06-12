package calculadora;
import java.util.Scanner;

public class Mate {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dato1: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Dato2: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado suma: " + sumar(numero1, numero2));
                break;
            case 2:
                System.out.println("Resultado resta: " + restar(numero1, numero2));
                break;
            case 3:
                System.out.println("Resultado multiplicación: " + multiplicar(numero1, numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado división: " + dividir(numero1, numero2));
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}


