
package Archivos_Cerealizable;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private Mascota mascota;

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Persona(String nombre, String apellido, int edad, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascota = mascota;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public static void main(String[] args) {
        Persona objeto = new Persona("Pablo", "Abrigo-Ochoa", 20, new Mascota("Oddi", 4));
        Persona objeto1 = new Persona("Jonathan", "Sarmiento", 20, new Mascota("Firulais", 4));
        Persona objeto2 = new Persona("Ale","Castro", 22, new Mascota("Betoven", 4));
        Mascota objeto3 = new Mascota("Lolo",4);
        System.out.println("La mascota de "+objeto.getNombre()+" se llama: "+objeto.getMascota().getNombre());
        System.out.println("La mascota de "+objeto.getApellido()+" se llama: "+objeto.getMascota().getNombre());
        
       
        
    }
    
    
}
