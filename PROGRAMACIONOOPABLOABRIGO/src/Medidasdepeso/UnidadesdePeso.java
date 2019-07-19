
package Medidasdepeso;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UnidadesdePeso {
public class gamequestion{
    public void Pregunta1(){
       Scanner entrada= new Scanner (System.in);
       JOptionPane.showMessageDialog(null,"Unidades del Peso");
       JOptionPane.showMessageDialog(null,"En 5 Kilogramos cuantos Hectogramos tengo ? \n50 \n65 \n55 \n51 " );

      String Pregunta = entrada.next();
      String a = "50";
        
     if(Pregunta.equals(a)){
          
          JOptionPane.showMessageDialog(null,"Es correcto");
          System.out.println("Es correcto");
          
    } else
            System.out.println("Es incorrecto");
             
         
          
        }
     public void Pregunta2(){
        Scanner entrada= new Scanner (System.in);
       JOptionPane.showMessageDialog(null,"En 15 Decagramos cuantos decigramos tengo ? \n1000 \n1300 \n1400 \n1500 " );

      String Pregunta2 = entrada.next();
      String b = "1500";
        
     if(Pregunta2.equals(b)){
          
          JOptionPane.showMessageDialog(null,"Es correcto");
          System.out.println("Es correcto");
          
    } else
             System.out.println("Es incorrecto");
        
}
      public void Pregunta3(){
        Scanner entrada= new Scanner (System.in);
       JOptionPane.showMessageDialog(null," En 80 Centigramos cuantos Miligramos tengo ? \n8 \n800 \n200 \n100" );

      String Pregunta3 = entrada.next();
      String c = "800";
        
     if(Pregunta3.equals(c)){
          
          JOptionPane.showMessageDialog(null,"Es correcto");
          System.out.println("Es correcto");
          
    } else
              System.out.println("Es incorrecto");

    
      
     }
}

    
    
}
