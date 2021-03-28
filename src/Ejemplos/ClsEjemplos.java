package Ejemplos;

import ConexionDB.ConexionMySQL;
import ConexionDB.clsDAO;
import ConexionDB.clsDatos;

import java.util.*;

public class ClsEjemplos {

    public void ejemplo1(){

       /* new ConexionMySQL();
        List<clsDatos> participantes = new clsDAO().participantes();
        clsDatos part = new clsDatos();
        clsDAO partt =new clsDAO();
        List<List<clsDatos>> list = new ArrayList();
        participantes.add(part);
        System.out.println(list);*/


        List<clsDatos> participantes = (new clsDAO()).participantes();
        List<String> nombres = new ArrayList();


        String[] array = {"Zacarias", "Maria", "Abel", "Betty", "Fabricio"};

       // String[] array = new String[100];
        //List<String> miLista = Arrays.asList(array);//////
        List<String> miLista = Arrays.asList();
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
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        String[] a = new  String[20];
        lista.toArray(a);
    }

    public void ganadores(){
        List<clsDatos> participantes = (new clsDAO()).participantes();
        List<String> nombres = new ArrayList();
        Iterator iterator = participantes.iterator();


        while (iterator.hasNext()){
            clsDatos particip = (clsDatos) iterator.next();
            nombres.add(particip.getNombre());
        }
        //Collections.sort(nombres); //ordenar
        List<String> ganadores = new ArrayList();
        Collections.shuffle(ganadores);//desordenar

        for (int i=0;i<10;i++){
            //Collections.shuffle(ganadores);//desordenar
            Random lot = new Random();

            int index = lot.nextInt(nombres.size());
            String ganador = nombres.get(index);
            ganadores.add(ganador);
            nombres.remove(index);

            //System.out.println(ganador);
            Collections.sort(ganadores);//ordenar
        }
        System.out.println("Ganadores\n");
        Iterator gan = ganadores.iterator();
        int i =0;
        while (gan.hasNext()){
            i++;
            String ganadorLot = (String) gan.next();
            System.out.println("Lugar "+i+": "+ganadorLot);
        }
    }
}
