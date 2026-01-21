package ejercicio4.controller;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorCalificaciones {

    private HashMap<String, ArrayList<Double>> listaEstudiante;

    public GestorCalificaciones() {

        listaEstudiante = new HashMap<>();

    }

    public GestorCalificaciones(HashMap<String, ArrayList<Double>> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public HashMap<String, ArrayList<Double>> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(HashMap<String, ArrayList<Double>> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public void agregarEstudiante(String nombre){

        if (listaEstudiante.containsKey(nombre)){
            System.out.println("Estudiante ya existe");
        } else {
            listaEstudiante.put(nombre, new ArrayList<Double>());
        }
    }

    public void agregarCalificacion(String nombre, double calificacion){

        if (listaEstudiante.containsKey(nombre)){
            listaEstudiante.get(nombre).add(calificacion);
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }

    public double calcularPromedio(String nombre){

        if (listaEstudiante.containsKey(nombre)){
            double totalNotas = 0;

            for (Double nota : listaEstudiante.get(nombre)){
                totalNotas+= nota;
            }

            if (listaEstudiante.isEmpty()){
                return 0;

            } else {
                double promedio = totalNotas / listaEstudiante.get(nombre).size();

                return promedio;

            }

        }

        return 0;

    }

    public void mostrarCalificaciones(String nombre){
        if (listaEstudiante.containsKey(nombre)){
            System.out.println(nombre + ": " + listaEstudiante.get(nombre));
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }

    public String mejorEstudiante(){

        String mejorEstudiante = "";
        double mejorPromedio = 0;

        for (String item : listaEstudiante.keySet()){

            double promedioActual = calcularPromedio(item);

            if (promedioActual > mejorPromedio){
                mejorPromedio = promedioActual;
                mejorEstudiante = item;
            }

        }

        return mejorEstudiante;

    }

    public void listarEstudiantesAprobados(double notaMinima){

        for (String item : listaEstudiante.keySet()){

            double promedioActual = calcularPromedio(item);

            if (promedioActual >= notaMinima){
                System.out.println("- "+item+": "+promedioActual);

            }
        }

    }

    public double promedioGeneral(){

        if (listaEstudiante.isEmpty()){
            return 0;
        }

        double promedioGeneral = 0;
        double promedioActual = 0;

        for (String nombre : listaEstudiante.keySet()){
            promedioActual +=  calcularPromedio(nombre);
        }

        promedioGeneral = promedioActual / listaEstudiante.size();

        return promedioGeneral;

    }


}
