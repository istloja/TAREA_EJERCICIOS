
package Ejercicio_5;

public class Ejecutar {
    public static void main(String[] args) {
       Libro L1 = new Libro("12547","crepusculo","Stephenie Meyer", 590);
        Libro L2 = new Libro("23908", "el Señor de los Anillos","J. R. R. Tolkien", 300);
        System.out.println(L1.toString());
        System.out.println(L2.toString());
          System.out.println(L1.Mayor(0));
    }
}
