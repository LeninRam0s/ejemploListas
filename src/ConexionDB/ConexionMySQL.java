package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    public Connection conectarDB(){

        Connection conexion = null;

        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/listasdb","root","");
            if (conexion!=null){
                System.out.println("Conectado con Exito!");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexion: "+e);
        }
        return conexion;
    }

    public void conectar(){

        ConexionMySQL conect = new ConexionMySQL();
        try (Connection conec = conect.conectarDB()){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
