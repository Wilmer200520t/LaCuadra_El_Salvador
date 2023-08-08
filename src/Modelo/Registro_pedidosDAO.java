//WILMER
package Modelo;

import Controlador.ConexionMysql;
import Modelo.registro_pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Registro_pedidosDAO {
    java.sql.Statement st;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    //clases usadas
    ConexionMysql conectar = new ConexionMysql();
    registro_pedido Pedido = new registro_pedido();
    
        public List listar() {
        List<registro_pedido> datos = new ArrayList<>();
        try {
            con = conectar.getconexion();
            ps = con.prepareStatement("SELECT p.idPedido,l.Cantidad,c.Nombre,p.mesa FROM pedido p INNER JOIN cliente AS c ON c.idCliente = p.idCliente INNER JOIN lista AS l ON l.idLista = p.idLista;");
            rs = ps.executeQuery();
            while (rs.next()) {
                registro_pedido Pedido = new registro_pedido();
                Pedido.setIdPedido(rs.getInt(1));
                Pedido.setCantidad(rs.getInt(2));
                Pedido.setProducto(rs.getString(3));
                Pedido.setCliente(rs.getString(4));
                Pedido.setMesa(rs.getString(5));
                datos.add(Pedido);
            }
        } catch (Exception e) {
        }
        return datos;
        
    }
    public int agregar(registro_pedido ped) {  
        int r=0;
        String sql="Insert into pedido (idPedido, Mesa) value (?, ?)\n"
                + "Insert into cliente (Nombre) value (?)\n"
                + "Insert into lista (Cantidad) value (?)\n";
        try {
            con = conectar.getconexion();
            ps = con.prepareStatement(sql);            
            ps.setInt(1,ped.getIdPedido());
            ps.setInt(2,ped.getCantidad());
            ps.setString(3,ped.getProducto());
            ps.setString(4,ped.getCliente());
            ps.setString(5,ped.getMesa());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
        public int Eliminar(int idPedido){
        int r=0;
        String sql="delete * from pedido where idPedido="+idPedido+
                "delete * from lista where idPedido="+idPedido+
                "delete * from cliente where idPedido="+idPedido;
        try {
            con=conectar.getconexion();
            ps=con.prepareStatement(sql);
            r= ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
