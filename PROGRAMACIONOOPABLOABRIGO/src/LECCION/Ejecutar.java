
package LECCION;

public class Ejecutar {
    public static void main(String[] args) {
        Animal objetoanimal=new Animal("invertebrados", "gato", "verde", 5.5, 12.4);
        Mamiferos objeto2 = new Mamiferos (4, "carne", "nativa", "zorro", "amarillo", 56.7, 69.9);
        Aves objeto3 = new Aves (true, 5, "voladora", "colibri", "rojo", 3.4, 18.9);
     
        objetoanimal.alimentarse();
        objeto2.alimentarse();
        objeto3.alimentarse();
        System.out.println(objetoanimal.informacionAnimal());
        
        
    }
    
}
