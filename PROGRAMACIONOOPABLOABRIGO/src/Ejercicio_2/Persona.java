
package Ejercicio_2;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private String sexo;
    private double peso;
    private double altura;
    final int PESO_BAJO = -1;
    final int PESO_IDEAL = 0;
    final int SOBREPESO = 1;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

   

    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return PESO_BAJO;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
}

    

