package ListaPuntos;

public class Nodo {
    int dato;
    Nodo enlace;

    public Nodo(int x){
        dato=x;
        enlace = null;
    }

    public Nodo (int x, Nodo n){
        dato = x;
        enlace = n;
    }

    public int getDato(){
        return dato;
    }

    public Nodo getEnlace(){
        return  enlace;
    }

    public void setEnlace(Nodo enlace){
        this.enlace = enlace;
    }
}
