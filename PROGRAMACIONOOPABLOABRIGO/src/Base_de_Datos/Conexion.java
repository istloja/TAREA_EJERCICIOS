
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
        paao.Conexion("root","ROOT");
        paao.escribir("root","ROOT", 12345, "Lolo", "Vaca", "1133464797", 45);
        

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
    
   
}
