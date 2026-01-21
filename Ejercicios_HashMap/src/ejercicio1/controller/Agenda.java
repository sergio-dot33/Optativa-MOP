package ejercicio1.controller;

import ejercicio1.model.Persona;

import java.util.HashMap;

public class Agenda {

    private HashMap<String, String> contactos;

    public Agenda() {
        contactos = new HashMap<>();
    }

    public Agenda(HashMap<String, String> contactos) {
        this.contactos = contactos;
    }

    public HashMap<String, String> getContactos() {
        return contactos;
    }

    public void setContactos(HashMap<String, String> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(String nombre, String telefono){

        contactos.put(nombre,telefono);

    }

    public String buscarContacto(String nombre){

        if (contactos.containsKey(nombre)){
            return contactos.get(nombre);
        } else {
            return "Contacto no encontrado";
        }
    }

    public boolean eliminarContacto(String nombre){

        boolean existeContacto = false;

        if (contactos.containsKey(nombre)){
            contactos.remove(nombre);
            return true;
        }

        return existeContacto;
    }

    public void mostrarContactos(){

        for (String item : contactos.keySet()){
            String telefono = contactos.get(item);
            System.out.println("- "+item+": "+telefono);
        }

    }

    public int contarContactos(){

        return contactos.size();
    }


    public boolean existeContacto(String nombre){

        return contactos.containsKey(nombre);

    }

}
