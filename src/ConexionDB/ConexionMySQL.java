package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    public Connection get_conection(){

        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/listasdb","root","");
            /*if (connection!=null){
                System.out.println("Conectado con Exito!");
            }*/
        } catch (SQLException e) {
            System.out.println("Error de conexion: "+e);
        }
        return connection;
    }

    public void conectar(){

        ConexionMySQL conect = new ConexionMySQL();
        try (Connection conec = conect.get_conection()){

        }catch (Exception e){
            System.out.println(e);
        }
    }




}
