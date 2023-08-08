//RENATO
package Modelo;

import Controlador.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class tipo_producto_querry {
    int id;
    String tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return this.tipo;
    }
    
       public Vector<tipo_producto_querry> mostrarTipo() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionMysql conn = new ConexionMysql();
        Connection con = conn.getconexion();

        Vector<tipo_producto_querry> datos = new Vector<tipo_producto_querry>();
        tipo_producto_querry tip = null;
        try {

            String sql = "SELECT * FROM tipo_producto";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            tip = new tipo_producto_querry();
            tip.setId(0);
            tip.setTipo("Selecciona Producto");
            datos.add(tip);

            while (rs.next()) {
                tip = new tipo_producto_querry();
                tip.setId(rs.getInt("idTipo_Producto"));
                tip.setTipo(rs.getString("Nombre"));
                datos.add(tip);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
}
