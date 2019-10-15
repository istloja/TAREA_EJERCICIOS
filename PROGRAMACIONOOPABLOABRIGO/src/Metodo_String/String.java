
package Metodo_String;

import java.util.Arrays;
import java.util.Scanner;

public class String {
    
     public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String persona="Maria";
        String nombre= "Juan";
        System.out.println(persona.lastIndexOf("a"));
        System.out.println(persona.toUpperCase());
        System.out.println(persona.toLowerCase());
        System.out.println(persona.concat(nombre));
        System.out.println(persona.equalsIgnoreCase(nombre));
        System.out.println(Arrays.toString(persona.toCharArray()));
        
    
   } 
}
