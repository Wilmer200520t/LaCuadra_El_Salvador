
package Modelo;

//KEVIN COCHACHIN
public class Empleados {
    
    private int tipo_empleado;
    private String nombre;
    private String apellido;
    private int dni;
    private String coreo;
    private String contraseña;
    private int id;
    

    public Empleados(int tipo_empleado, String nombre, String apellido, int dni, String coreo, String contraseña) {
        this.tipo_empleado = tipo_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.coreo = coreo;
        this.contraseña = contraseña;
    }

   
    public Empleados() {
    }
    
    //getter
    public int getTipo_empleado() {
        return tipo_empleado;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getCoreo() {
        return coreo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getId() {
        return id;
    }
    
    
    //setter

    public void setTipo_empleado(int tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCoreo(String coreo) {
        this.coreo = coreo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setId(int id) {
        this.id = id;
    }

    
   
    
    
    //Ejecutar codigo de Registro
  
    public void RegistarEmpleado(){   
        Querry sql_query=new Querry();
        //querry para registrar empleado
        String query = "insert into Empleados values (" + this.dni + ",'" + this.tipo_empleado + "'," + "'" + this.nombre + "'," + "'" + this.apellido + "'," + "'" + this.dni + "'," + "'" + this.coreo + "'," + "'" + this.contraseña + "'" + " )";
        sql_query.consultaBD(query);
    }
    
    

}
