package Archivos_Serealizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Leer_y_Escribir {

    public void escribir_archivo(String ruta_del_archivo,Persona persona) {
        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(ruta_del_archivo));
            ejemplo.writeObject(persona);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error"+e); 
        }
    }
    public static void main(String[] args) {
        Leer_y_Escribir objeto = new Leer_y_Escribir();
        Persona objecto1 = new Persona("Pablo", "Abrigo-Ochoa", 20, new Mascota("Oddy", 4));
//        objeto.escribir_archivo("C:\\Users\\Usuario\\Desktop\\PABLO.txt", objeto1);
//        objeto.LeerArchivo("C:\\Users\\Usuario\\Desktop\\PABLO.txt");

        Persona objecto2 = new Persona("Jhony", "Jaramillo", 28, new Mascota("Tigre", 4));
        Persona objecto3 = new Persona("Lolo", "Gonzales", 40, new Mascota("Rufo", 4));
        Persona objecto4 = new Persona("Genoveva", "Miranda", 18, new Mascota("Max", 4));
        List<Persona>lista = new ArrayList<>();
        lista.add(objecto1);
        lista.add(objecto2);
        lista.add(objecto3);
        lista.add(objecto4);
        objeto.escribir_lista("C:\\Users\\Usuario\\Desktop\\PABLO.txt", lista);
        objeto.LeerArchivo("C:\\Users\\Usuario\\Desktop\\PABLO.txt");
        List<Persona> lista1 = objeto.lista("C:\\Users\\Usuario\\Desktop\\PABLO.txt");
        for (Persona persona : lista1){
            System.out.println(persona.getNombre());
        }
 
    }
    
    public void LeerArchivo(String ruta_del_archivo){
        try {
             ObjectInputStream Leer = new ObjectInputStream(new FileInputStream(ruta_del_archivo));
             Object auxiliar = Leer.readObject();
         
             while (auxiliar!=null){
                 Persona persona = (Persona) auxiliar;
                 System.out.println(persona.getMascota().getNombre());
                 auxiliar=Leer.readObject();
                    
         
             }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
 
    }   
    public void escribir_lista(String direccion_del_archivo,List<Persona>listaPersona) {  
        try {
            ObjectOutputStream Leer = new ObjectOutputStream(new FileOutputStream(direccion_del_archivo));
            for(Persona ochoa :listaPersona){
            Leer.writeObject(ochoa);

             }
        } catch (Exception e) {
        }    
    }
   
    
    public List<Persona>lista(String direccion){
        List<Persona> lista = new ArrayList<Persona>();
        try {
            ObjectInputStream Leer = new ObjectInputStream(new FileInputStream(direccion));
             Object auxiliar = Leer.readObject();
         
             while (auxiliar!=null){
                 Persona persona = (Persona) auxiliar;
                 lista.add(persona);
                 auxiliar=Leer.readObject();
 
            }
     
        } catch (Exception e){
            
        }
        return lista;
        }
     
}
           
        

        

