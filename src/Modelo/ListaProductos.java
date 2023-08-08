
//BRYAN
package Modelo;

import Controlador.ConexionMysql;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class ListaProductos extends ConexionMysql{
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.getconexion();
    
    Statement statement;
    private PreparedStatement ps;
    ResultSet rs;
    
    public void MostrarTable(JTable Tabla){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("tipo_producto");
        modelo.addColumn("tiempo");
        Tabla.setModel(modelo);
        String querry="SELECT * FROM producto JOIN tipo_producto ON producto.idTipo_Producto=tipo_producto.idTipo_Producto";
        
        
    }
     public void listarestado(JComboBox combo) {
        conectarBDD();

        try {
            statement = conexion.createStatement();
            String query = "select * from tipo_producto";
            rs = statement.executeQuery(query);
            while (rs.next()) {
                combo.addItem(rs.getString(1)+" - "+rs.getString(2));
            }
        } catch (SQLException e) {
        }
    }
     public void registroproducto (int IDproducto,int tipoproducto,String nombre,double precio,double tiempo){
         conectarBDD();
         try {
             statement=conexion.createStatement();
             String query="insert into producto values('"+IDproducto+"','"+tipoproducto+"','"+nombre+"','"+precio+"','"+tiempo+"')";
             statement.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "registro exitoso");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "error"+e);
         }
     }
 
    public int consultarIdProducto (int idpedido) {
        conectarBDD();
        int cant = -1;
        try {
            st = conexion.createStatement();
            String query = "Select COUNT(idProducto) from producto where idProducto='" + idpedido + "'";
            rs = st.executeQuery(query);
            if (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return cant;
    }
  
    public int generarIdProducto (){
        conectarBDD();
        int idpedido=0;
        try {
            st=conexion.createStatement();
            String querry = "SELECT MAX(producto.idProducto) FROM producto";
            rs=st.executeQuery(querry);
            if (rs.next()) {
                idpedido=rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        idpedido+=1;
        while (consultarIdProducto(idpedido)!=0) {
            idpedido+=1;
        } 
        return idpedido;
    }
    
    public void ActualizarRegistroP(registro_Producto p ){
        conectarBDD();
        String sql="update producto set Nombre=?,Precio=?,Tiempo_Preparacion=? where idProducto=?";        
        try {
            
           ps = conexion.prepareStatement(sql);                        
            
            ps.setString(1,p.getNombre());
            ps.setDouble(2,p.getPrecio());
            ps.setDouble(3,p.getTiempo());
            ps.setInt(4,p.getID());
            
            
            ps.executeUpdate(); 
            
        }catch (Exception e) {
            
        }
    }
        public void EliminarRegistroP(int id) {
        conectarBDD();
        try {

            String SQL = "delete from producto where idProducto=" + id;

            Statement st = conexion.createStatement();
            st.executeUpdate(SQL);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro" + e.getMessage());
        }
    }
    }
   
