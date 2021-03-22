package ListaPuntos;

import java.util.Scanner;

public class Lista {

    private Nodo primero;

    public Lista(){
        primero=null;
    }

    private int leerEntero(){

        System.out.println("Ingrese Valor, -1 para finalizar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    public Lista crearLista(){
        int x;
        primero=null;

        do
        {
            x=leerEntero();
            if (x!=-1){
                primero = new Nodo(x,primero);
            }
        }while (x!= -1);
        return this;
    }




}
