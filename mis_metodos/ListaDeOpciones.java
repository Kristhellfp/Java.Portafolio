package mis_metodos;

public class ListaDeOpciones {
    public static void cargarOpciones(String[] opciones) {

        int elementoMayor = encuentraElementoMasGrande(opciones).length();

        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("[%d] %s ", i + 1, opciones[i]);

            for(int j = 0;j<(elementoMayor-opciones[i].length());j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");
            }
        }

    }

    public static String encuentraElementoMasGrande (String[] ListaDeOpciones) {
        String elementoMayor = ListaDeOpciones[0];

        for (String opcion : ListaDeOpciones) {
            if (opcion.length() > elementoMayor.length()) {
                elementoMayor = opcion;
            }
        }

        return elementoMayor;
    }
}
