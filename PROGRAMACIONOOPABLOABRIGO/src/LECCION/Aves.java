
package LECCION;

public class Aves extends Animal {
    private boolean volador;
    private int numerodehuevos;

    public Aves(boolean volador, int numerodehuevos, String especie, String nombre, String color, double peso, double tamaño) {
        super(especie, nombre, color, peso, tamaño);
        this.volador = volador;
        this.numerodehuevos = numerodehuevos;
    }

    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public int getNumerodehuevos() {
        return numerodehuevos;
    }

    public void setNumerodehuevos(int numerodehuevos) {
        this.numerodehuevos = numerodehuevos;
    }

}
    
