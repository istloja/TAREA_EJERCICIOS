
package EquipodeFutbol;

import java.io.Serializable;

public class Futbolista implements Serializable {
    private String nombre;
    private String apellido;
    private int posicion;
    private String numero;
    
    
    public Futbolista(String nombre, String apellido, int posicion, String numero, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
        this.sueldo = sueldo;
    }

    public Futbolista() {
    }

    Futbolista(String leonel, String messi, int i, String delantero, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    private double sueldo;

  
    
}
