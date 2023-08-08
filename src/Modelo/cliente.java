//BRYAN
package Modelo;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class cliente {
    private int ID;
    private String Nombre;
    private String Apellido;
    private int dni;
    
    public cliente (int ID,String Nombre,String Apellido, int dni){
        this.ID=ID;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.dni=dni;
        
    }
    public cliente(){     
    }
    
    //getter
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDni() {
        return dni;
    }
    
    
    //setter
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
}
