package Database;
import java.sql.*;

// Conexión a MySql utilizando Singleton Pattern

public class Sql_Connection {
    
    // Encapsulando atributos a utilizar
   
    private String url;
    private String usuario;
    private String password;

    // Instancia de nuestra conexión
    
    private static Connection con = null;
    
    // Constructor privado que permite acceder a él solo desde un método
    
    private Sql_Connection(){
        
        url = "jdbc:mysql://localhost:3306/Programacion1";
        usuario = "brito";
        password = "Brito110406-";
 
        try{
            con = DriverManager.getConnection(url, usuario, password);
        }

        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    // Método para realizar la conexión
    
    public static Connection getConnection(){
        
        if(con == null){
            new Sql_Connection();
        }
        
        return con;
    }
    
    // Método para cerrar la conexión
    
    public static void closeConnection() throws SQLException{
        if(con != null){
            con.close();
        }
    }
}
