package ejercicio1;

public class Libro {

    private String titulo, autor, isbn;
    private int numPaginas;
    private double precio;
    private boolean prestado;

    public Libro() {
    }

    public Libro(String titulo, String isbn){

        this.titulo = titulo;
        this.isbn = isbn;
        this.prestado = false;

    }

    public Libro(String titulo, String autor, String isbn, int numPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.precio = precio;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void mostrarInfo(){

        System.out.printf("Título: %s (ISBN: %s)", getTitulo(), getIsbn());

    }

    public boolean esLibroLargo(){

        return getNumPaginas() > 300;
    }

    public void aplicarDescuento(double porcentaje){

        double formulaDescuento = getPrecio() * (porcentaje / 100);

        setPrecio(getPrecio() - formulaDescuento);

    }

    public boolean prestar(){

        if (prestado) {
            return false;
        }

        prestado = true;
        return true;
    }

    public boolean devolver(){

        if (!prestado){
            return false;
        }

        prestado = false;
        return true;

    }
}
