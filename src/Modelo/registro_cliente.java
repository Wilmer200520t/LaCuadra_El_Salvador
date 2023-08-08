//RENATO
package Modelo;

import Controlador.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class registro_cliente {
    int idcliente;
    String nombre;
    String apellido;
    int dni;
    Date fechallegada;
    Date fechapedido;
    
    java.sql.Statement st;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ConexionMysql conectar = new ConexionMysql();

    public registro_cliente(int idcliente, String nombre, String apellido, int dni, Date fechallegada, Date fechapedido) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechallegada = fechallegada;
        this.fechapedido = fechapedido;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(Date fechallegada) {
        this.fechallegada = fechallegada;
    }

    public Date getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(Date fechapedido) {
        this.fechapedido = fechapedido;
    }
    
    public void registrar_cliente(){

    
    }
    
    
}
