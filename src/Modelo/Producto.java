//BRYAN
package Modelo;

public class Producto {
    private int idproducto;
    private int idtipo_producto;
    private String nombre;
    private float precio;
    private float tiempo;

    public Producto() {
    }

    public Producto(int idproducto, int idtipo_producto, String nombre, float precio, float tiempo) {
        this.idproducto = idproducto;
        this.idtipo_producto = idtipo_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdtipo_producto() {
        return idtipo_producto;
    }

    public void setIdtipo_producto(int idtipo_producto) {
        this.idtipo_producto = idtipo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
