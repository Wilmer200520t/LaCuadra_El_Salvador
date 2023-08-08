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

public class comboCliente {
    int id_cliente;
    String cliente;
    
    java.sql.Statement st;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ConexionMysql conectar = new ConexionMysql();

    public comboCliente(int id_cliente, String cliente) {
        this.id_cliente = id_cliente;
        this.cliente = cliente;
    }

    public comboCliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
        public void combo_cliente(JComboBox<comboCliente> itemcliente){
        try{
            String sql="SELECT idCliente, Nombre FROM cliente;";
            con = conectar.getconexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            itemcliente.removeAllItems();
            while (rs.next()){
                itemcliente.addItem(new comboCliente(
                rs.getInt("idCliente"),
                rs.getString("Nombre")
                
                ));
            }
        } catch (SQLException ex){
            Logger.getLogger(comboProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    @Override
    public String toString(){
        return cliente;
    }
}
