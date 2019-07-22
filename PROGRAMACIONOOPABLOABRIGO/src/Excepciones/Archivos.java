
package Excepciones;

import java.io.File;

public class Archivos {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Usuario\\Desktop\\Ejemplo.txt");
        //Para saber si el archivo o una carpeta no existe, devuelve true o false
        System.out.println(archivo.exists());
        //Para saber si una carpeta existe o no, devuelve true o flase
        System.out.println(archivo.isDirectory());
        //Para saber la fecha de modificacion del archivo
        System.out.println(archivo.lastModified());
        //Para obtener el nombre del archivo
        System.out.println(archivo.getName());
       //Para borrar el archivo
       //System.out.println(archivo.delete());
       File carpeta = new File("C:\\Users\\Usuario\\Desktop\\");
       String[] archivos=carpeta.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
               
    }
    
}
