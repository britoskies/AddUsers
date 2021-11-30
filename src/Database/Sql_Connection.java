package Database;
import java.sql.*;

// SQL connection using Singleton Pattern

public class Sql_Connection {
    
    // Encapsulating atributes
   
    private String url;
    private String usuario;
    private String password;

    // Private & Static instance of connection
    
    private static Connection con = null;
    
    // Private constructor to be able to access on to our connection
    
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
    
    // To establish SQL connection
    
    public static Connection getConnection(){
        
        if(con == null){
            new Sql_Connection();
        }
        
        return con;
    }
    
    // To close connection
    
    public static void closeConnection() throws SQLException{
        if(con != null){
            con.close();
        }
    }
}
