
package EquipodeFutbol;

import java.io.Serializable;
import java.util.List;

public class Futbolista implements Serializable {
    private String nombre;
    private String apellido;
    private int posicion;
    private int sueldo;
    private int pases;
    private int asistencias;
    private int perdidas;
    private double kilometros_recorridos;
    
    
    Futbolista(String leonel, String messi, int i, String delantero, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Futbolista() {
    }

    public Futbolista(String nombre, String apellido, int posicion, int sueldo, int pases, int asistencias, int perdidas, double kilometros_recorridos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.pases = pases;
        this.asistencias = asistencias;
        this.perdidas = perdidas;
        this.kilometros_recorridos = kilometros_recorridos;
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
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public double getKilometros_recorridos() {
        return kilometros_recorridos;
    }

    public void setKilometros_recorridos(double kilometros_recorridos) {
        this.kilometros_recorridos = kilometros_recorridos;
    }
    
    public Futbolista Porcentaje_aciertos (){
        return null;
        
    }
    public static void main(String[] args) {
        Futbolista objeto = new Futbolista("Antonio","Valencia", 25, 5000, 6, 10, 4, 43);
        List<Futbolista> lista = null;
        System.out.println(objeto);
        
        
        
    }
  
}