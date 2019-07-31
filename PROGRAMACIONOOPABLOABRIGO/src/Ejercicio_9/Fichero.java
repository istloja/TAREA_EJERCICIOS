package Ejercicio_9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fichero {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\HOGAR\\Desktop\\tarea.txt");
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader re = new BufferedReader(lector);
            String linea = "";
            int valor = lector.read();
            while (valor != -1) { 
                if (valor != 32) {
                    System.out.print((char) valor);
                }
                valor = lector.read();
            }
            re.close();
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e);
        }
    }

}
