package ejercicio2;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaMatematicas, notaProgramacion, notaIngles;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double notaMatematicas, double notaProgramacion, double notaIngles) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMatematicas = notaMatematicas;
        this.notaProgramacion = notaProgramacion;
        this.notaIngles = notaIngles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double calcularPromedio(){

        return (getNotaMatematicas() + getNotaProgramacion() + getNotaIngles()) / 3;

    }

    public boolean estaAprobado(){

        return calcularPromedio() >=5;

    }

    public String obtenerCalificacion(){

        double promedio = calcularPromedio();

        if (promedio >= 9 && promedio <= 10){
            return "Sobresaliente";
        } else if (promedio >= 7){
            return "Notable";
        } else if (promedio >= 6){
            return "Bien";
        } else if (promedio >= 5){
            return "Suficiente";
        } else {
            return "Insuficiente";
        }

    }

    public void mostrarInforme(){

        System.out.printf(
                """
                Nombre: %s
                Edad: %d
                Matemáticas: %.2f
                Programación: %.2f
                Inglés: %.2f
                Promedio: %.2f
                Calificación: %s
                
                -------------------------
                """,
                getNombre(),
                getEdad(),
                getNotaMatematicas(),
                getNotaProgramacion(),
                getNotaIngles(),
                calcularPromedio(),
                obtenerCalificacion()

        );
    }
}
