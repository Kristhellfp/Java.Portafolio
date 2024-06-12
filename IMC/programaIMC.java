package IMC;

import java.util.Scanner;



    public class programaIMC {

        public static double CalculoIMC(double peso,double altura){
            double IMC = peso/(altura*altura);
            return IMC;
        }

        public static void programaIMC(){

            // DATOS
            Scanner intoDato = new Scanner(System.in);
            System.out.print("Peso: ");
            double peso = intoDato.nextDouble();
            System.out.print("Altura: ");
            double altura = intoDato.nextDouble();

            // PROCESO
            double IMC = CalculoIMC(peso,altura);

            // RESULTADO
            System.out.println("IMC: " + IMC);

            System.out.println("--------------------");
            if (IMC < 18.5){
                System.out.println("--> IMC Bajo");
            } else if (IMC >18.5 && IMC <24.9) {
                System.out.println("--> IMC Normal");
            } else if (IMC>25 && IMC<29.9) {
                System.out.println("--> IMC Sobre peso");
            }else if (IMC>30 && IMC<34.9) {
                System.out.println("--> IMC Obesidad I");
            }else if (IMC>35 && IMC<39.9) {
                System.out.println("--> IMC Obesidad II");
            }else if (IMC>40 && IMC<49.9) {
                System.out.println("--> IMC Obesidad III");
            }else if (IMC>50) {
                System.out.println("--> IMC Obesidad IV");
            }

        }

    }



