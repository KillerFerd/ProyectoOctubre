package ProyectoRestaurante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author KillerFerd
 */
public class Conexion {
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433;"
                +"database=Restaurante;"
                +"user=sa;"
                +"password=1234;"
                +"loginTimeout=30;";    //Limite de tiempo de conexión
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}