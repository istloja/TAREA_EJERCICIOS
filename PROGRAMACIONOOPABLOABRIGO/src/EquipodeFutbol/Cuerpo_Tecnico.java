
package EquipodeFutbol;

import java.io.Serializable;

public class Cuerpo_Tecnico implements Serializable {
    private String nombre_de_entrenador;
    private String tipo_de_cargo;
    private int numero_de_personas;
    private String nombre_del_club;

    public String getNombre_de_entrenador() {
        return nombre_de_entrenador;
    }

    public void setNombre_de_entrenador(String nombre_de_entrenador) {
        this.nombre_de_entrenador = nombre_de_entrenador;
    }

    public String getTipo_de_cargo() {
        return tipo_de_cargo;
    }

    public void setTipo_de_cargo(String tipo_de_cargo) {
        this.tipo_de_cargo = tipo_de_cargo;
    }

    public int getNumero_de_personas() {
        return numero_de_personas;
    }

    public void setNumero_de_personas(int numero_de_personas) {
        this.numero_de_personas = numero_de_personas;
    }

    public String getNombre_del_club() {
        return nombre_del_club;
    }

    public void setNombre_del_club(String nombre_del_club) {
        this.nombre_del_club = nombre_del_club;
    }

    public Cuerpo_Tecnico() {
    }
    
    
}
