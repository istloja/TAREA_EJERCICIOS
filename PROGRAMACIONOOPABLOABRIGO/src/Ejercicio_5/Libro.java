
package Ejercicio_5;


public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int Numero_de_paginas;
    
    public Libro(String ISBN, String Titulo, String Autor, int Numero_de_paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numero_de_paginas = Numero_de_paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumero_de_paginas() {
        return Numero_de_paginas;
    }

    public void setNumero_de_paginas(int Numero_de_paginas) {
        this.Numero_de_paginas = Numero_de_paginas;
    }
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Numero_de_paginas=" + Numero_de_paginas + '}';
    }

   
    boolean Mayor(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   