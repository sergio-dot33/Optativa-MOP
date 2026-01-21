package ejercicio10;

import ejercicio1.Libro;

public class Biblioteca {

    private String nombre;
    private Libro[] libros;
    private int numLibros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[50];
        this.numLibros = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getNumLibros() {
        return numLibros;
    }

    public void setNumLibros(int numLibros) {
        this.numLibros = numLibros;
    }

    public boolean agregarLibro(Libro libro){

        if (numLibros >= libros.length){
            return false;
        }

        libros[numLibros] = libro;
        numLibros++;
        return true;

    }

    public Libro buscarLibroPorIsbn(String isbn){

        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)){
                return libros[i];
            }
        }

        return null;

    }

    public boolean prestarLibro(String isbn){

        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)){
                return libros[i].prestar();
            }
        }

        return false;


    }

    public boolean devolverLibro(String isbn){

        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)){
                return libros[i].devolver();
            }
        }

        return false;


    }

    public void listarLibrosDisponibles(){

        for (int i = 0; i < numLibros; i++) {

            if (!libros[i].isPrestado()){
                libros[i].mostrarInfo();
            }

        }

    }

    public void listarLibrosPrestados(){

        for (int i = 0; i < numLibros; i++) {

            if (libros[i].isPrestado()){
                libros[i].mostrarInfo();
            }

        }

    }
}
