package ejercicio6;

public class Pelicula {

    private String titulo, director;
    private int duracion, anio;
    private double calificacion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int anio, double calificacion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.anio = anio;
        setCalificacion(calificacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {

        if (calificacion >=0 && calificacion <=10){
            this.calificacion = calificacion;
        }
    }

    public String obtenerDuracionFormateada(){

        int horas = getDuracion() / 60;
        int minutos = getDuracion() % 60;

        return horas+"h"+minutos+"min";
    }

    public boolean esClasica(){

        int anioActual = 2026;

        return (anioActual - anio) > 25;
    }

    public boolean esRecomendable(){

        return calificacion >=7;
    }

    public void mostrarInfo(){

        System.out.println("Titulo: "  + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duracion: " + obtenerDuracionFormateada());
        System.out.println("Anio: " + anio);
        System.out.println("Calificacion: "+ calificacion);
        System.out.println("Clasica?: " + esClasica());
    }


}
