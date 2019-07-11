
package ControldeAccesoaMiembrosenHerencia;

public class Trianguloo {
     String estilo;
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }

    private int getBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   
 

