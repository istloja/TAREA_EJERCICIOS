
package Ejercicio_7;

public class Empleados {
    private String Nombre;
 private int Edad;
 private double Salario;
 private int PLUS = 300;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        this.Salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    public void setPLUS(int PLUS) {
        this.PLUS = PLUS;
    }
    
    
    public double plus(){
        return 300;
        
    }
    
    public double comercial (){
        if(Edad > 30){
            Salario = Salario + 300;
        }
        return Salario;
    }
    public boolean repartidor(){
        if(Edad < 25){
            return true;
        } else {
            return false;
        }
    }
}
