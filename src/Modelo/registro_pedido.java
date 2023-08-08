//WILMER
package Modelo;
import java.util.Date;

public class registro_pedido {
    int idEmpleado_chef;
    int idPedido;
    int idEmpleado_mesero;
    int idCliente;
    Date Fecha;
    String mesa;
    int cantidad;
    String Estado;
    String producto;
    String descripcion;
    String cliente;

    public registro_pedido() {
    }

    public registro_pedido(int idEmpleado_chef, int idPedido, int idEmpleado_mesero, int idCliente, Date Fecha, String mesa, int cantidad, String Estado, String producto, String descripcion, String cliente) {
        this.idEmpleado_chef = idEmpleado_chef;
        this.idPedido = idPedido;
        this.idEmpleado_mesero = idEmpleado_mesero;
        this.idCliente = idCliente;
        this.Fecha = Fecha;
        this.mesa = mesa;
        this.cantidad = cantidad;
        this.Estado = Estado;
        this.producto = producto;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public int getIdEmpleado_chef() {
        return idEmpleado_chef;
    }

    public void setIdEmpleado_chef(int idEmpleado_chef) {
        this.idEmpleado_chef = idEmpleado_chef;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdEmpleado_mesero() {
        return idEmpleado_mesero;
    }

    public void setIdEmpleado_mesero(int idEmpleado_mesero) {
        this.idEmpleado_mesero = idEmpleado_mesero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    
    
}
