package ConexionDB;

import ListaPuntos.Lista;

import javax.print.DocFlavor;
import java.security.PublicKey;
import java.util.List;

public class clsDatos {

    private int id;
    private String nombre;

    //CONSTRUCTORES
    public clsDatos(){
    }

    public clsDatos(String nombre) {
        this.nombre = nombre;
    }

    //GETTER AND SETTER
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
