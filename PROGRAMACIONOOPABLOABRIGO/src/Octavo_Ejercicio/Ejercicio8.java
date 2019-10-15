package Octavo_Ejercicio;

public class Ejercicio8 {

    public int numerodepalabras(String cadena) {
        String caracter = "a";
        int numeroveces = 0;
        String palabras[] = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].contains(caracter)) {
                numeroveces++;
            }
        }
        return numeroveces;
    }

    public static void main(String[] args) {
        Ejercicio8 obj = new Ejercicio8();

        System.out.println(obj.numerodepalabras("pro gra mar r"));
    }
}
