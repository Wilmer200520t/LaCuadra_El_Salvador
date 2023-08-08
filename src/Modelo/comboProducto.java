//WILMER
package Modelo;

import Controlador.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class comboProducto {
    int id_producto;
    String producto;
    
   java.sql.Statement st;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ConexionMysql conectar = new ConexionMysql();

    public comboProducto(int id_producto, String producto) {
        this.id_producto = id_producto;
        this.producto = producto;
    }

    public comboProducto() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public void combo_producto(JComboBox<comboProducto> itemproducto){
        try{
            String sql="SELECT idProducto, Nombre FROM producto;";
            con = conectar.getconexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            itemproducto.removeAllItems();
            while (rs.next()){
                itemproducto.addItem(new comboProducto(
                rs.getInt("idProducto"),
                rs.getString("Nombre")
                
                ));
            }
        } catch (SQLException ex){
            Logger.getLogger(comboProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString(){
     return producto;
    }
}
