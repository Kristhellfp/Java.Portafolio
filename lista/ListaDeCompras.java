package lista;


import mis_metodos.ListaDeOpciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    public static String[] opciones6 = {"Lista de compras","Salir"};


    public static void programa(){

        ListaDeOpciones.cargarOpciones(opciones6);

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();


        switch (r){
            case 1:
                crearLista();
                break;
            case 2:
                System.out.println("Salir");
                break;
        }

    }


    public static void crearLista(){
        // CREAR UNA LISTA VACÍA
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();


        String rP;
        double rPc;

        for (int i = 1; i<=3;i++){
            Scanner item = new Scanner(System.in);
            System.out.print("Producto: ");
            rP = item.nextLine();
            System.out.print("Precio: ");
            rPc = item.nextDouble();

            // AGREGAR A LA LISTA VACÍA
            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }

        System.out.println(listaNombre + "-->" + listaPrecio);
    }

}

