package ConexionDB;

import Ejemplos.ClsEjemplos;
import ListaPuntos.Lista;
import com.sun.source.tree.CatchTree;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.sql.*;
import java.util.*;

public class clsDAO {
    public clsDAO(){

    }
   /* public static void inserDatos(clsDatos dato){
    ConexionMySQL cn = new ConexionMySQL();

        try
            (Connection conexion=cn.conectarDB()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO tb_listas (id, nombre) VALUES (?,?);";
                ps=conexion.prepareStatement(query);
                new ClsEjemplos().pruebaArreglo();
                Lista lst = new Lista().crearLista();

                ps.setString(1, dato.getNombre());
                ps.executeUpdate();
                System.out.println("Guardado Exitoso!");
            }catch (SQLException e){}


        }catch (SQLException e){}
    }
    public static void leerDatos(){

        new ConexionMySQL().conectar();

        String sql = "SELECT * FROM tb_listas";
        PreparedStatement ps = null;
        Statement st;

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("monbre");


    }
*/
    public List <clsDatos> participantes(){
        ConexionMySQL cn = new ConexionMySQL();
        clsDatos part = new clsDatos();
        List<clsDatos> list = new ArrayList();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet= null;

        try {
            Connection connect = cn.conectarDB();
            try {
                String sql = "SELECT * FROM tb_listas";
                preparedStatement = connect.prepareStatement(sql);

                for (resultSet = preparedStatement.executeQuery();
                     resultSet.next(); part = new clsDatos() ){

                    part.setId(resultSet.getInt("id"));
                    part.setNombre(resultSet.getString("nombre"));
                    list.add(part);
                   // System.out.println(part.getNombre());
                }
            }catch (Throwable gan){
                if (connect !=null){
                    try {
                            connect.close();
                    }catch (Throwable gan1){
                        gan.addSuppressed(gan1);
                    }
                }
                throw gan;

            }
            if (connect!=null){
                connect.close();
            }


        }catch (SQLException e){
            System.out.println("Error de consulta DB");
        }
        return list;
    }
    public static void borrarDatos(int id){

    }
    public static void actualizarDatos(clsDatos dato){

    }



}
