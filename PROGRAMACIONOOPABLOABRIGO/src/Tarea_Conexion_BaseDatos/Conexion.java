package Tarea_Conexion_BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Conexion {

    public static void main(String[] args) {

        Scanner Pablo = new Scanner(System.in);

        System.out.println("Digite sus nombres completos:");

        String nombre = Pablo.nextLine();

        System.out.println("Hola " + nombre);

        Conexion paao = new Conexion();
        paao.Conexion("root", "ROOT");
        paao.escribir("root", "ROOT", 29656, "Anthony", "Ochoa", "1106049925", 20);
    }

    public void escribir(String usuario, String clave, int idfamilia, String nombre, String apellido, String cedula, int edad) {
        
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/familia", usuario, clave);
            PreparedStatement s = poo.prepareStatement("Insert into familia values(?,?,?,?,?)");
            s.setInt(1, idfamilia);
            s.setString(2, nombre);
            s.setString(3, apellido);
            s.setString(4, cedula);
            s.setInt(5, edad);
            s.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void Conexion(String usuario, String clave) {

        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo;
            poo = DriverManager.getConnection("jdbc:mysql://localhost/familia", usuario, clave);
            System.out.println(poo.getCatalog());
            Statement s = poo.createStatement(); //inicializamos la consulta
            ResultSet resultado = s.executeQuery("select * from familia");
            while (resultado.next()) {
                System.out.println(resultado.getInt("idfamilia"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("cedula"));
                System.out.println(resultado.getInt("edad"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
