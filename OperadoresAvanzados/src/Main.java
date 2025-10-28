//package controller
//import nombrePaquete.NombreClase
//import controller.GestorDocumentos
//import controller.GestorUsuarios
//import controller.* para importar todas

import controller.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando la clase");
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.validarUsuario("Pedro", 41, "");
        GestorDocumentos gestorDocumentos = new GestorDocumentos();
        gestorDocumentos.validarDocumento("documento test", 444);

    }






}
