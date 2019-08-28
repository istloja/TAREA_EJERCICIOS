
package Segundo_Bimestre;

public class Cadena {
    public static void main(String[] args) {
        String cadena = "HolaMundo";
        int numero = cadena.length();
        int comparar = cadena.compareTo("Chao");
        boolean Union = cadena.equals("Chao");
        System.out.println("El numero de caracteres es:"+numero);
        System.out.println(Union);
        System.out.println(+comparar);
        String hola="Hola";
        System.out.println(hola.contains("d"));
        Cadena objeto = new Cadena(); 
        Cadena.verificar_letra(hola,'d');
        

    } 
    public boolean verificar_letra(String cadena, char Letra){
        boolean bandera= false;
        for(int i = 0; i < cadena.length();i++){
            if(cadena.charAt(i)==letra){
                bandera==true;
            }
        }
    return bandera;
    }
}
