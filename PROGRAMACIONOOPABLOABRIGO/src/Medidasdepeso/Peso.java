
package Medidasdepeso;

 import java.util.Scanner;
    public class Peso {
   
    public static void main(String[] args) {
        /* Consideraciones 
        ° 1 kilogramo equivale a 10 Hectogramos
        ° 1 Decagramo equivale a 100 Decigramos 
        ° 1 Centigramo equivale a 10 miligramos 
        */
        Scanner lector = new Scanner (System.in);
        
        int opcion;
        double Kilogramos, Hectogramos, Decagramos, Decigramos, Centigramos, Miligramos;
        
        System.out.println("Ingrese la opcion que desee: ");
        System.out.println("1. Kilogramos a Hectogramos.");
        System.out.println("2. Decagramos a Decigramos. ");
        System.out.println("3. Centigramos a Miligramos. ");
        
        opcion = lector.nextInt();
        
        switch(opcion){
            
            case 1:
                System.out.println("Ingrese la cantidad de Kilogramos a convertir ");
                Kilogramos = lector.nextDouble();
                Hectogramos = Kilogramos * 10;
                System.out.println( Kilogramos+"Kilogramos equivalen a "+Hectogramos+"Hectogramos.");
                break;
                
            case 2:
                System.out.println("Ingrese la cantidad de Decagramos a convertir ");
                Decagramos = lector.nextDouble();
                Decigramos = Decagramos * 100;
                System.out.println( Decagramos+"Decagramos equivalen a "+Decigramos+"Decigramos.");
                break;
                
            case 3:
                System.out.println("Ingrese la cantidad de Centigramos a convertir ");
                Centigramos = lector.nextDouble();
                Miligramos= Centigramos * 10;
                System.out.println( Centigramos+"Centigramos equivalen a "+Miligramos+"Miligramos.");
                break;
                    
                
            default:
                System.out.println("La opcion seleccionada no es la correcta");
                
        }
    }
    
}

