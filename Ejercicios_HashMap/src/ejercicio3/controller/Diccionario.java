package ejercicio3.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Diccionario {

    private HashMap<String,String> diccionario;

    public Diccionario() {

        diccionario = new HashMap<>();
    }

    public Diccionario(HashMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public HashMap<String, String> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap<String, String> diccionario) {
        this.diccionario = diccionario;
    }

    public void agregarTraduccion(String espanol, String ingles){

        diccionario.put(espanol,ingles);
    }

    public String traducir(String palabra){

        if (diccionario.containsKey(palabra)){
            return diccionario.get(palabra);
        }

        return palabra+" no existe";
    }

    public void listarDiccionario(){

        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.sort(palabras);

        for (String item : palabras){
            System.out.println("Traduccion de "+item+": "+diccionario.get(item));
        }
    }

    public int tamanioDiccionario(){

        return diccionario.size();
    }

    public void traducirFrase(String frase){

        String[] palabras = frase.split(" ");


        System.out.println("Traduciendo frase: "+frase);

        String traduccionFinal = "";

        for (String item : palabras){
            traduccionFinal += traducir(item) + " ";
        }

        System.out.println("Traduccion: "+traduccionFinal);

    }

    public void agregarVariasTraducciones(String[][] traducciones){

        for (String[] palabra : traducciones){
            agregarTraduccion(palabra[0], palabra[1]);
        }
    }
}
