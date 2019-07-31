package Metodos;

import java.util.Scanner;

public class Metodos {

    public double Calcular_Edad(int año, int FechaActual) {
        double edad = FechaActual - 2019;
        return edad;
    }

    public double CalcularHipotenusa(double catetoOpuesto, double catetoAdyacente) {
        double Calcularhipotenusa = Math.sqrt(Math.pow(catetoOpuesto, 2) + Math.pow(catetoAdyacente, 2));
        Scanner Pablo = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea calcular del cateto opuesto");
        catetoOpuesto = Pablo.nextDouble();
        System.out.println("Ingrese la cantidad que desea calcular del cateto adyacente");
        catetoAdyacente = Pablo.nextDouble();
        return Calcularhipotenusa;
    }

    public String edad(int edad) {
        if (edad >= 18) {
            return "Eres mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }

    public double calcularIva(boolean iva, double precio) {
        double totalapagar = precio;
        if (iva == true) {
            double iv = precio * 0.12;
            totalapagar = precio + iv;
        } else {
            System.out.println(totalapagar);
            return totalapagar;
        }
        return 0;

    }

    public boolean Aprobar(double nota, int porcentajefaltas) {
        if (nota >= 7 && porcentajefaltas < 20) {
            return true;
        } else {
            return false;
        }

    }
}
