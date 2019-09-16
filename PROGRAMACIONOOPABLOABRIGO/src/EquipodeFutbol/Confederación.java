
package EquipodeFutbol;

import java.io.Serializable;

public class Confederación implements Serializable {
    private String nombre;
    private String tipo_de_confederacion;
    private String pais;

    public Confederación(String nombre, String tipo_de_confederacion, String pais) {
        this.nombre = nombre;
        this.tipo_de_confederacion = tipo_de_confederacion;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_de_confederacion() {
        return tipo_de_confederacion;
    }

    public void setTipo_de_confederacion(String tipo_de_confederacion) {
        this.tipo_de_confederacion = tipo_de_confederacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Confederación() {
    }
    
}
