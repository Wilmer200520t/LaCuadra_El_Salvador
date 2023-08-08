//KEVIN
package Modelo;

import java.sql.Date;


public class Factura {
    
    String dir,obs;
    int idFac,idPed,idCliente,telef;
    float ruc;
    double total,igv,sub;
    String fecha;

    public Factura(String dir, String obs, int idFac, int idPed, int idCliente, int telef, double sub, double igv, double total, float ruc, String fecha) {
        this.dir = dir;
        this.obs = obs;
        this.idFac = idFac;
        this.idPed = idPed;
        this.idCliente = idCliente;
        this.telef = telef;
        this.sub = sub;
        this.igv = igv;
        this.total = total;
        this.ruc = ruc;
        this.fecha = fecha;
    }
    
    public Factura(){
        
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getIdFac() {
        return idFac;
    }

    public void setIdFac(int idFac) {
        this.idFac = idFac;
    }

    public int getIdPed() {
        return idPed;
    }

    public void setIdPed(int idPed) {
        this.idPed = idPed;
    }

    public int getTelef() {
        return telef;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public float getRuc() {
        return ruc;
    }

    public void setRuc(float ruc) {
        this.ruc = ruc;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
