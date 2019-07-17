
package LECCION;

public class Mamiferos extends Animal {
    private double tiempo_de_gestacion;
    private String tipo_de_alimentacion;

    public Mamiferos(double tiempo_de_gestacion, String tipo_de_alimentacion, String especie, String nombre, String color, double peso, double tamaño) {
        super(especie, nombre, color, peso, tamaño);
        this.tiempo_de_gestacion = tiempo_de_gestacion;
        this.tipo_de_alimentacion = tipo_de_alimentacion;
    }
    
          
    public double getTiempo_de_gestacion() {
        return tiempo_de_gestacion;
    }

    public void setTiempo_de_gestacion(double tiempo_de_gestacion) {
        this.tiempo_de_gestacion = tiempo_de_gestacion;
    }

    public String getTipo_de_alimentacion() {
        return tipo_de_alimentacion;
    }

    public void setTipo_de_alimentacion(String tipo_de_alimentacion) {
        this.tipo_de_alimentacion = tipo_de_alimentacion;
    }
   
}
    

    

    
   