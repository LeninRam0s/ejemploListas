package objListaOrdenada;

import ListaPuntos.Lista;
import ListaPuntos.Nodo;

import java.awt.*;

public class ListaOrdenada extends Lista {

    public ListaOrdenada(){
        super();
    }

    public ListaOrdenada insertaOrden(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (primero==null){
            primero= nuevo;

        }else if(entrada<primero.getDato()){  //al cambiar el signo para invertir el ingreso
            nuevo.setEnlace(primero);
            primero=nuevo;
        }else {
            //busca el nodo anterior a partir de aca
            //se ejecuta la insercion
            Nodo anterior, p;
            anterior = p =primero;
            while ((p.getEnlace() != null)&&(entrada>p.getDato())){  //al cambiar el signo para invertir el ingreso
                anterior=p;
                p=p.getEnlace();
            }if (entrada>p.getDato())//se inserta despies del ultimo nodo
            {
                anterior = p;
            }
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }

    //metodos pendientes de la lista ordenar
    //ELIMINAR
    //BUSCAR LISTA


}
