
package EquipodeFutbol;

import java.io.Serializable;

public class Equipo implements Serializable {
    private String nombre;
    private String posicion_jugador;
    private String color;
    private int numero_jugador;
    private Futbolista futbolista;
    
    public Equipo(Futbolista futbolista) {
        this.futbolista = futbolista;
    }
    public Equipo(String Liga_de_Quito, String blanco, int par, String Antonio_Valencia) {
    }

    public Equipo(String nombre, String posicion_jugador, String color, int numero_jugador ) {
        this.nombre = nombre;
        this.color = color;
        this.numero_jugador = numero_jugador;
    }

    Equipo(String ganadores, String azul, int i, String carlos_Silva, Futbolista futbolista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion_jugador() {
        return posicion_jugador;
    }

    public void setPosicion_jugador(String posicion_jugador) {
        this.posicion_jugador = posicion_jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero_jugador() {
        return numero_jugador;
    }

    public void setNumero_jugador(int numero_jugador) {
        this.numero_jugador = numero_jugador;
    }
    
    public Futbolista getFutbolista() {
        return futbolista;
    }

    public void setFutbolista(Futbolista futbolista) {
        this.futbolista = futbolista;
    }
    public static void main(String[] args) {
        Equipo objeto = new Equipo ("Liga de Quito", "Volante de contencion", "blanco", 25);
        
    }
    
}
