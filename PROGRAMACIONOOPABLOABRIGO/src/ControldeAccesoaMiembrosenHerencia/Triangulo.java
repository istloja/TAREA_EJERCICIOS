
package ControldeAccesoaMiembrosenHerencia;


public class Triangulo extends DosDimensiones {
    String estilo;
    double area(){
        return base*altura/2; //Error! no se puede acceder
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }

    void setBase(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAltura(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
   
