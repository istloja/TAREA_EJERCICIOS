package Primer_Ejercicio;

import java.util.Scanner;

public class Ejercicio1 {

//    SERIE 7,6,8,4,9,2,10,0,11,-2
    
    public static int[] serie(int limite) {
        int[] arreglo = new int[limite];
        int par = 6;
        int impar = 7;
        for (int i = 0; i < limite; i++) {

            if (i % 2 == 0) {
                arreglo[i] = impar;
                impar++;
            } else {
                arreglo[i] = par;
                par = par - 2;

            }
        }
        return arreglo;

    }

    public int suma(int x, int y, int[] arreglo) {
        int valor = -1;
        if (x > 0 && x < 255 && y > 0 && y < 255) {
            valor = arreglo[x] + arreglo[y];
        }

        return valor;
    }

    public static void main(String[] args) {
        Ejercicio1 obj = new Ejercicio1();
        Scanner dato = new Scanner(System.in);
        int serie[] = new int[10];
//        System.out.println("Ingrese un numero");
//   int x= dato.nextInt();
//        System.out.println("Ingrese un numero");
//    int y = dato.nextInt();
//        
        int[] arreglo = serie(255);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
        System.out.println(obj.suma(3, 5, arreglo));

    }

}
