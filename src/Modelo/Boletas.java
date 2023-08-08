//KEVIN
package Modelo;

import java.sql.Date;

/**
 *
 * @author Kevin C.
 */
public class Boletas {
    
    int idBoleta, idPedido,idCliente;
    Double total;
    String dirección;
    String fecha;

    public Boletas(int idBoleta, int idPedido, int idCliente, Double total, String dirección, String fecha) {
        this.idBoleta = idBoleta;
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.total = total;
        this.dirección = dirección;
        this.fecha = fecha;
    }
    
    public Boletas(){
        
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
