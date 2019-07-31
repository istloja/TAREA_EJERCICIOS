
package Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Tarea_Leer_Archivos {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Usuario\\Desktop\\EJEMPLO.txt");
        try {
            FileReader lector = new FileReader(archivo);//me srive para pasar el archivo a un objeto
            BufferedReader re = new BufferedReader(lector);//me va a servir para recorrer el archivo
            String Linea = "";
            while ((Linea = re.readLine()) != null) {//para leer linea por linea lo del archivo
                System.out.println(Linea);
            }
            re.close();//para cerrar el archivo
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e);
        }

    }
}
