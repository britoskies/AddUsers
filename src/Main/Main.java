package Main;
import GUIs.LoginGUI;
import java.sql.*; 

public class Main {

    public static void main(String[] args) throws SQLException {
        LoginGUI login = new LoginGUI();
        login.setVisible(true);     
    } 
}
