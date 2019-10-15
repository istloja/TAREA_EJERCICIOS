package Tercer_Ejercicio;

import java.util.Scanner;

public class Ejercicio3 {

//    SERIE 60, 30, 20, 15, 12...
    public static int[] serie3(int limite) {
        int[] numero = new int[limite];
        int n = 60, d = 2, m = 60;
        for (int i = 0; i < limite; i++) {
            numero[i] = n;
            numero[i] = m;
            m = n / d;
            d++;
            if (d >= 7) {
                d = 1;
            }
        }
        return numero;

    }

    public int generado(int numero[]) {
        Scanner Pablo = new Scanner(System.in);
        System.out.println("\nDigite un numero");
        int x = Pablo.nextInt();
        System.out.println("Digite un numero");
        int y = Pablo.nextInt();
        if (x <= 0 && x > 255 && y <= 0 && y > 255) {
            return -1;
        } else {
            x = x + y;
            x = numero[x];
            return x;
        }

    }

    public static void main(String[] args) {
        Scanner Pablo = new Scanner(System.in);
        int[] numero = serie3(35);
        Ejercicio3 obj = new Ejercicio3();
        for (int i = 0; i < numero.length; i++) {
            System.out.println(obj.serie3(i));
        }
//        for (int i = 0; i < numero.length; i++) {
//            System.out.print(numero[i]+",");    
//        } 

    }

}
