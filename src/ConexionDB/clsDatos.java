package ConexionDB;

public class clsDatos {

    int id;
    String nombre;

    //CONSTRUCTORES
    public clsDatos(){
    }

    public clsDatos(String nombre) {
        this.nombre = nombre;
    }

    //GETTER AND SETER
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
