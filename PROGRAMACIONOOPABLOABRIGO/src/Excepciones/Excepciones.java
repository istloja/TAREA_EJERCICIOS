package Excepciones;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Scanner Pablo = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int numero = 0;
        try { //Parte que se va a proteger
            numero = Pablo.nextInt();
        } catch (Exception e) { //Mensaje cuando la proteccion se incumpla
        System.out.println("Se ha generado la excepcion"+e);
       }
//        finally{ //Para ejecutar la accion que debio haberse realizado//El finally se ejecuta siempre que una excepcion ocurra y se ejecuta enseguida
////            System.out.println("Ingrese un numero correcto");
////            numero = Pablo.nextInt();
////        }
        System.out.println("El numero ingresado es:" + numero);
        try { 
            int resultado = numero/0;
        } catch (Exception e) {
        System.out.println("No se puede dovidir para cero");
        }
    }
}
