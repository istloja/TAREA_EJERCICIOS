
package EquipodeFutbol;

import java.io.Serializable;

public class Estadio implements Serializable {
    private int numero_ascientos;
    private String tipo_de_estadio;
    private String nombre;
    private String ubicacion;
    private int horas_de_apertura;

    public int getNumero_ascientos() {
        return numero_ascientos;
    }

    public void setNumero_ascientos(int numero_ascientos) {
        this.numero_ascientos = numero_ascientos;
    }

    public String getTipo_de_estadio() {
        return tipo_de_estadio;
    }

    public void setTipo_de_estadio(String tipo_de_estadio) {
        this.tipo_de_estadio = tipo_de_estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getHoras_de_apertura() {
        return horas_de_apertura;
    }

    public void setHoras_de_apertura(int horas_de_apertura) {
        this.horas_de_apertura = horas_de_apertura;
    }

    public Estadio() {
    }
    
}
