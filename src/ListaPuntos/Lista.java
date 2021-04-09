package ListaPuntos;

import java.util.List;
import java.util.Scanner;

public class Lista {

    public Nodo primero;

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
    //NUEVOS METODOS

    //buscar posicion
    public Nodo buscarPosicion(int posision){
        Nodo indice;
        int i;
        if (posision < 0){
            return null;

        }
        indice = primero;
        for (i=1; (i<posision)&&(indice!=null);i++){
            indice=indice.enlace;
        }
        return indice.enlace;
    }

    public List insertarUltimo(Nodo ultimo, int entrada){
        ultimo.enlace=new Nodo(entrada);
        ultimo = ultimo.enlace;
        return (List) this;
    }

    public Lista insertarCabeza(Nodo cabeza, int valor){
        cabeza.enlace = new Nodo(valor);
        cabeza = cabeza.enlace;
        return this;
    }

    public Nodo buscarLista(int destino){
        Nodo indice;
        for (indice=primero; indice!=null;indice=indice.enlace){
            if (destino==indice.dato){
                return indice;
            }
        }return null;
    }

    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;

        //inicializa los apuntadores de memoria
        actual =primero;
        anterior=null;
        encontrado=false;

        //busqueda nodo anterior
        while ((actual!=null)&&(!encontrado)){
            encontrado=(actual.dato == entrada);

            if (!encontrado){
                anterior = actual;
                actual = actual.enlace;
            }
        }//fin while

        //enlace del nodo anterior con el siguiente (puente)
        if (actual!=null){
            //distinguir entre el nodo inicial ocabeza o si es cualquiera de la lista
            if (actual==primero){
                primero= actual.enlace;
            }else {
                anterior.enlace=actual.enlace;

            }
            actual =null;
        }

    }

    public Lista insertarLista(int testigo, int entrada){
        Nodo nuevo, anterior;
        anterior = buscarLista(testigo);
        if (anterior!=null){
            nuevo = new Nodo(entrada);
            nuevo.enlace=anterior.enlace;
            anterior.enlace= nuevo.enlace;;
        }
        return this;
    }

    public void visualizar(){
        Nodo n;
        int k=0;
        n=primero;
        while (n!=null){
            System.out.print(n.dato);
            n=n.enlace;
            k++;
            System.out.println((k%15!=0?" ":"\n"));
        }

    }
}//FIN DE CLASE
