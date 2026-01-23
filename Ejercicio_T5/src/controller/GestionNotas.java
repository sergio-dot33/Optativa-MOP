package controller;

import model.Alumno;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionNotas {

    private HashMap<String, Alumno> listaAlumnos;

    public GestionNotas() {

        listaAlumnos = new HashMap<>();
    }

    public HashMap<String, Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    private void setListaAlumnos(HashMap<String, Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }


    public boolean introducirAlumno(Alumno alumno) {

        String dni = alumno.getDNI();

        if (listaAlumnos.containsKey(dni)) {
            return false;
        }

        listaAlumnos.put(dni, alumno);

        return true;

    }

    public double buscarAlumno(String dni) {

        Alumno alumno;

        if (listaAlumnos.containsKey(dni)){
            alumno = listaAlumnos.get(dni);
            return alumno.getNota();
        }

        return -1;

    }

    public void verMejoresNotas(int limite) {

        ArrayList<Alumno> listaTemporal = new ArrayList<>();

        for (Alumno alumno : listaAlumnos.values()){

            listaTemporal.add(alumno);

        }

        for (int i = 0; i < listaTemporal.size(); i++) {

            int indiceMejor = i;

            for (int j = i + 1; j < listaTemporal.size(); j++) {

                if (listaTemporal.get(j).getNota() > listaTemporal.get(indiceMejor).getNota()){
                    indiceMejor = j;
                }
            }

            Alumno temporal = listaTemporal.get(i);
            listaTemporal.set(i,listaTemporal.get(indiceMejor));
            listaTemporal.set(indiceMejor, temporal);

        }

        System.out.println("Mejores expedientes:");

        for (int i = 0; i < limite && i < listaTemporal.size(); i++) {

            System.out.println(listaTemporal.get(i));

        }

    }

    public void verNotasSuperiores(double notaMinima) {

        for (Alumno alumno : listaAlumnos.values()){

            if (alumno.getNota() > notaMinima){

                System.out.println(alumno);
            }

        }

    }

    public void vaciarLista() {

        listaAlumnos.clear();
    }

    public void mostrarDatos(){

        for (String dni : listaAlumnos.keySet()){
            System.out.println(listaAlumnos.get(dni));
        }
    }
}
