
package boletin24;


public class Libros implements Comparable {
     private String autor;
    private String titulo;
    private String isbn;
    private float precio;
    private int numUnid;

   
    public Libros(String autor, String titulo, String isbn, float precio, int numUnid) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
        this.numUnid = numUnid;
    }
     public Libros() {
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumUnid() {
        return numUnid;
    }

    public void setNumUnid(int numUnid) {
        this.numUnid = numUnid;
    }

    @Override
    public String toString() {
        return  "autor=" + autor + ", titulo=" + titulo +
                ", isbn=" + isbn + ", precio=" + precio + ", numUnid=" + numUnid ;
    }
    @Override
          public int compareTo(Object o) {
     Libros x=(Libros)o;
     if(this.titulo.compareToIgnoreCase(x.titulo)>0)
         return 1;
     else if(this.titulo.compareToIgnoreCase(x.titulo)<0)
         return -1;
     else
         return 0;
       
    }  
}

