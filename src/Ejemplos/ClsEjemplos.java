package Ejemplos;

import java.util.*;

public class ClsEjemplos {

    public  void ejemplo1(){

        String[] array = {"Zacarias", "Maria", "Abel", "Betty", "Fabricio"};
        List<String> miLista = Arrays.asList(array);
        System.out.println("Lista antes orden: "+miLista);
        imprimirTodo(miLista);
        //miLista.add("Hola");
        Collections.sort(miLista);
        System.out.println("Lista ordenada: "+miLista);
        int donde = Collections.binarySearch(miLista,"Fabricio");
        System.out.println("Betty se encuentra en el index: "+donde);
        imprimirTodo(miLista);
        Collections.shuffle(miLista);
        System.out.println("Revuelto: "+miLista);
        imprimirTodo(miLista);
    }

    public void  imprimirTodo(Collection coll){

        Iterator iter = coll.iterator();
            while (iter.hasNext()){
                System.out.println("Elemento: "+iter.next());
        }
    }

    public void pruebaArreglo(){
        ArrayList<String > lista = new ArrayList<String>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        String[] a = new  String[20];
        lista.toArray(a);
    }
}
