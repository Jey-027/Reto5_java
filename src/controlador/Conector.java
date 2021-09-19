package controlador;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

//Metodo conector con la BD.
public class Conector {
    private static Connection conn;
    
    public static void conectar(){
        String dbURL = "jdbc:mysql://localhost:3306/MisionTicFY_2";
        String username = "root";
        String password = "A12345";
        try{
            conn = DriverManager.getConnection(dbURL, username, password);
            if(conn != null){
                System.out.println("Conexion exitosa");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }           
    }

    public static Connection getConn() {
        return conn;
    }

  
    
    
}



