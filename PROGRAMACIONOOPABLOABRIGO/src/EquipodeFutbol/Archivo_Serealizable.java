
package EquipodeFutbol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo_Serealizable {
    public void escribirarchivo (String rutaArchivo,Equipo equipo) throws IOException{
    Archivo_Serealizable obj = new Archivo_Serealizable () ;
    
    try (ObjectOutputStream escribir = new ObjectOutputStream (new FileOutputStream(rutaArchivo))) {
        escribir.writeObject(equipo);
        escribir.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Archivo_Serealizable.class.getName()).log(Level.SEVERE, null, ex);
    }
                  
}
    public void leerarchivo (String rutaArchivo){
        try {
            ObjectInputStream leer = new ObjectInputStream (new FileInputStream   (rutaArchivo));
       // leer la linea codificada, creamos un auxiliar con las lineas de codigo         
           Object auxiliar = leer.readObject();
           Equipo equipo = (Equipo)auxiliar;

           System.out.println(equipo.getNombre());
           System.out.println(equipo.getFutbolista().getNombre());
    } catch (Exception e){
           System.out.println("Ocurrio un error"+e);
}

}   
    public static void main(String[] args) throws IOException {
           Archivo_Serealizable obj= new Archivo_Serealizable ();
           Equipo objeto = new Equipo ("Liga de Quito","blancol", 25, "Antonio Valencia", new Futbolista("Leonel", "Messi", 10, "Delantero", 45,54));
           obj.escribirarchivo("C:\\Users\\Usuario\\Desktop\\PABLO.txt", objeto);
           obj.leerarchivo("C:\\Users\\Usuario\\Desktop\\PABLO.txt");
    }
   
    
}
