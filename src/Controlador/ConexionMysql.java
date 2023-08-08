//WILMER
package Controlador;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ConexionMysql {
    public String url ;
    public String driver;
    public String Usuario;
    public String Contraseña;
    public Connection conexion;
    public Statement st;
    
  
    public ConexionMysql(){
        url="jdbc:mysql://localhost:3306/restaurante";
        driver="com.mysql.cj.jdbc.Driver";
        Usuario="root";
        Contraseña="admin";
    }
    
    public Connection getconexion(){
        conectarBDD();
    return conexion;
    }
    
   public void conectarBDD()  {
        try {
            Class.forName(driver);
            conexion =DriverManager.getConnection(url, Usuario, Contraseña);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Conectar ala base de datos: " +e);
        }
    }

    public void cerrarDB() {
        try {
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Cerrar ala base de datos: " +e);
        }
    }
   
}

