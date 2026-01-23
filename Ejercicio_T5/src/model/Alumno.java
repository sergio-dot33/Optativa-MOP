package model;

public class Alumno {

    private String nombre, apellido, DNI;
    private double nota;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String DNI, double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        setNota(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {

        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", nota=" + nota +
                '}';
    }
}
