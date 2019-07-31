
package Ejercicio_4;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean fechacorrecta(int dia, int mes, int año) {
        if (dia <= 31 && dia >= 1 && mes <= 12 && mes >= 1 && año <= 2019 && año >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean bisiesto(int año) {
        if (año % 4 == 0) {
            System.out.println("El año " + año + " es biciesto");
            return true;
        } else {
            System.out.println("El año " + año + " no es biciesto");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia=dato.nextInt();
        System.out.println("Ingrese el mes");
        int mes=dato.nextInt();
        System.out.println("Ingrese el año");
        int años = dato.nextInt();
        Fecha objeto = new Fecha();
        objeto.bisiesto(años);

    }

}
    
