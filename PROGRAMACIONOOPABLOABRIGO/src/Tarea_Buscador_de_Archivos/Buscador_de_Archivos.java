
package Tarea_Buscador_de_Archivos;

import java.io.File;
import java.util.Scanner;

public class Buscador_de_Archivos {
    public static void main(String[] args) {
        int op = 0;
        Scanner Pablo = new Scanner(System.in);
        try {
            System.out.println("Escoga la opcion:");
            System.out.println("Ingrese 1 para en listar los archivos del escritorio");
            System.out.println("Ingrese 2 para en listar los documentos");
            System.out.println("Ingrese 3 para en listar las imagenes");
            System.out.println("Ingrese 4 para en listar los videos");
            System.out.println("Ingrese 5 para en listar la musica");
            op = Pablo.nextInt();
            if (op > 0) {
                switch (op) {
                    case 1:
                        File carpeta = new File("C:\\Users\\Usuario\\Desktop");
                        String[] archivos = carpeta.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 2:
                        File carpeta1 = new File("C:\\Users\\Usuario\\Documents");
                        archivos = carpeta1.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 3:
                        File carpeta2 = new File("C:\\Users\\Usuario\\Pictures");
                        archivos = carpeta2.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 4:
                        File carpeta3 = new File("C:\\Users\\Usuario\\Videos");
                        archivos = carpeta3.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    case 5:
                        File carpeta4 = new File("C:\\Users\\Usuario\\Music");
                        archivos = carpeta4.list();
                        for (int i = 0; i < archivos.length; i++) {
                            System.out.println(archivos[i]);
                        }
                        break;
                    default:
                        System.out.println("digite un numero del 1 al 5: ");
                        break;
                }
            } else {
                System.out.println("Digite un numero mayor a 0:");
            }
        } catch (Exception e) {
            System.out.println("Se ha generado la excepcion" + e);
        }
        System.out.println("El numero que digito es:" + op);
    }

    
    
}
