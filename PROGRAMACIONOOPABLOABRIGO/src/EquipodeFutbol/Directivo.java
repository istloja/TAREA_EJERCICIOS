
package EquipodeFutbol;

import java.io.Serializable;

public class Directivo implements Serializable {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String tipo_de_club;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo_de_club() {
        return tipo_de_club;
    }

    public void setTipo_de_club(String tipo_de_club) {
        this.tipo_de_club = tipo_de_club;
    }

    public Directivo() {
    }
   
    
    
}
