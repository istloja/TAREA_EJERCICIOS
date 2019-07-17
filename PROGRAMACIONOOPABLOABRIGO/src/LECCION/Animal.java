
package LECCION;

public class Animal {
    private String especie;
    private String nombre;
    private String color;
    private double peso;
    private double tamaño;
    
    public void alimentarse(){
        System.out.println("Soy" +nombre+ " y me alimento");
    }    
    public String informacionAnimal(){
        String cadena= "Soy un" +nombre+ "Mi peso es:" +peso+color;
        return cadena;
    }

    public Animal(String especie, String nombre, String color, double peso, double tamaño) {
        this.especie = especie;
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
  
}



     
    
    
    

