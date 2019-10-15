
package Base_de_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    public void Conexion (String usuario, String clave){
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            System.out.println(poo.getCatalog());
            Statement s = poo.createStatement(); //inicializamos la consulta
            ResultSet resultado = s.executeQuery("select * from persona");
            while (resultado.next()){          
                System.out.println(resultado.getInt("idpersona"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("cedula"));
                System.out.println(resultado.getInt("edad"));
                
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
          Conexion paao = new Conexion ();
//        paao.Conexion("root","ROOT");
//        paao.escribir("root","ROOT", 12345, "Lolo", "Vaca", "1133464797", 45);
//        paao.actualizar("root", "ROOT", 12345, "Pablo");
          paao.eliminar("root", "ROOT", 1);

    }
    
    public void escribir (String usuario, String clave, int idpersona,String nombre,String apellido, String cedula,int edad){
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            PreparedStatement s = poo.prepareStatement("Insert into persona values(?,?,?,?,?)");
            s.setInt(1, idpersona);
            s.setString(2, nombre);
            s.setString(3, apellido);
            s.setString(4, cedula);
            s.setInt(5, edad);
            s.executeUpdate();

        }
        catch (Exception e) {
            System.out.println(e);        
        }
    }
    
        public void actualizar (String usuario, String clave, int idpersona, String nombre ){
            
            try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            PreparedStatement s = poo.prepareStatement("UPDATE persona set persona=? where idpersona=? ");
            s.setString(1, nombre);
            s.setInt(2, idpersona);
            s.executeUpdate();
            
            } catch (Exception e) {
            System.out.println(e); 
            }
}            
        public void eliminar(String usuario, String clave, int idpersona){
            try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            PreparedStatement s = poo.prepareStatement("DELETE persona set idpersona where idpersona=? ");
            s.setInt(idpersona, 1);
                
            } catch (Exception e) {
                System.out.println(e);
            }
                
                
                
            }
                
      }      


