
package EquipodeFutbol;

import java.io.Serializable;

public class Auspiciante implements Serializable {
    private String nombre;
    private String apellido;
    private String marca;
    private String tipo_de_empresa;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_de_empresa() {
        return tipo_de_empresa;
    }

    public void setTipo_de_empresa(String tipo_de_empresa) {
        this.tipo_de_empresa = tipo_de_empresa;
    }

    public Auspiciante() {
    }
    
    
    
}
