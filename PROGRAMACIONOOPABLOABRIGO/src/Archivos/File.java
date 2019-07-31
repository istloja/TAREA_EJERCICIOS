
package Archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class File {
//        public static void main(String[] args) throws IOException {
//        FileWriter archivo = null; //Escribimos variables de tipo FileWriter con el nombre archivo
//        PrintWriter deejay = null; //Es la escritura que nos permite dar texto al bloc de notas
//        
//        try {
//            archivo = new FileWriter ("C:\\Users\\Usuario\\Desktop\\NOTAS.txt");
//            deejay = new PrintWriter (archivo);
//            deejay.println("Meta#1 : Yo quiero ser un muy buen profesional");
//            deejay.println("Meta#2 : Aspiro tener dinero");
//            deejay.println("Meta#3 : Quiero ser un buen ingeniero");
//            deejay.println("Meta#4 : Quiero tomar agua");
//            deejay.println("Meta#5 : Quiero tenerla viva a mi mama de por vida");
//            deejay.println("Meta#6 : Que viva el Ecuador");
//            deejay.println("Meta#7 : Quisiera tener muchos años mas de vida");
//            deejay.println("Meta#8 : Que viva Loja");
//            deejay.println("Meta#9 : Aspiro que mi felicidad sea eterna");
//            deejay.println("Meta#10 : Aspiro tener dinero");
//            
//        }catch (Exception e){
//            System.out.println("Error i :" +e.getMessage());
//            archivo.close();
//          }  
//         archivo.close();
//        }
    
    public static void main(String[] args){
        Scanner Pablo = new Scanner (System.in);
        System.out.println("Ingrese la direcion del archivo");
        String Direccion = Pablo.nextLine();
        System.out.println("Ingrese el texto a escribir en el archivo");
        String Texto = Pablo.nextLine();
        System.out.println(Texto);
        File objeto = new File();
        objeto.Escribir(Direccion, Texto);
        
       
    }
    public void Escribir (String Direccion_del_Archivo, String Mensaje_Escribir){
       try {
           FileWriter archivo = new FileWriter(Direccion_del_Archivo);
           PrintWriter Escribir = new PrintWriter (archivo);
           Escribir.println(Mensaje_Escribir);
           archivo.close();
           
       }catch (Exception e){
           System.out.println(e);
           
       }
    }       
}   
  