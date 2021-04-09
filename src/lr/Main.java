package lr;


import Ejemplos.ClsEjemplos;
import Graficos.clsReproductor;
import objListaOrdenada.ListaOrdenada;

import java.util.Random;

public class Main {

    public static void main(String[] args)  {
	// write your code here
       //new ClsEjemplos().ejemplo1();
       // new clsDAO().mostrarGanadores();
     //   int pausa;
      //  pausa =0;

        /*new ClsEjemplos().pruebaArreglo();
        Lista lst = new Lista().crearLista();
        int pausa;
        pausa =0;*/

        /*Scanner sc = new Scanner(System.in);
        int opcion =0;

        do
        {

        }while (opcion!=5);

        new ConexionMySQL().conectar();*/

        new ClsEjemplos().ganadores();

        ListaOrdenada lista;
       lista=new ListaOrdenada();

        Random random = new Random();
        //limitado a 10 ganadores
         for (int i=0; i<10;i++){
             int x=random.nextInt(200)*1;

            lista.insertaOrden(x);
        }

       /* lista.insertaOrden(85);
        lista.insertaOrden(2);
        lista.insertaOrden(6);
        lista.insertaOrden(1);
        lista.insertaOrden(15);
        lista.insertaOrden(7);*/


        System.out.println("Elementos de la lista: ");
        lista.visualizar();

        clsReproductor rep = new clsReproductor();

        int pausa;
        pausa =0;
    }
}
