//WILMER
package Modelo;

public class Pedido {
   private int idpedido,cantidad,mesa;
   private String Descripcion,estado,producto,cliente,encargado,mozo;

    public Pedido(int idpedido, int cantidad, int mesa, String Descripcion, String estado, String producto, String cliente, String encargado, String mozo) {
        this.idpedido = idpedido;
        this.cantidad = cantidad;
        this.mesa = mesa;
        this.Descripcion = Descripcion;
        this.estado = estado;
        this.producto = producto;
        this.cliente = cliente;
        this.encargado = encargado;
        this.mozo = mozo;
    }

    public Pedido() {
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }
   
   
   
}
