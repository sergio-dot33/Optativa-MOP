import ejercicio1.controller.Agenda;
import ejercicio2.controller.Almacen;
import ejercicio3.controller.Diccionario;
import ejercicio4.controller.GestorCalificaciones;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println("Agenda de Contactos");
        System.out.println("==================");
        System.out.println();

        Agenda agenda = new Agenda();
        System.out.println("Agregando contactos...");

        String nombre = "Ana";
        String telefono = "666123456";
        agenda.agregarContacto(nombre,telefono);
        System.out.println("Contacto agregado: "+nombre+" - "+telefono);
        String nombre1 = "Carlos";
        String telefono1 = "666789012";
        agenda.agregarContacto(nombre1, telefono1);
        System.out.println("Contacto agregado: "+nombre1+" - "+telefono1);
        String nombre2 = "Maria";
        String telefono2 = "666345678";
        agenda.agregarContacto(nombre2, telefono2);
        System.out.println("Contacto agregado: "+nombre2+" - "+telefono2);

        System.out.println();

        System.out.println("Total de contactos: "+agenda.contarContactos());

        System.out.println();

        System.out.println("Buscando a "+nombre);
        System.out.println("Telefono de "+nombre+": "+agenda.buscarContacto(nombre));

        System.out.println();

        System.out.println("Listado de contactos:");
        agenda.mostrarContactos();

        System.out.println();

        agenda.eliminarContacto("Carlos");
        System.out.println("Eliminando contacto Carlos...");
        if (!agenda.existeContacto("Carlos")){
            System.out.println("Contacto eliminado correctamente");
        } else {
            System.out.println("No se ha podido eliminar contacto");
        }

        System.out.println("Total de contactos: "+agenda.contarContactos());

        System.out.println("Sistema de Inventario");
        System.out.println("==================");
        System.out.println();

        System.out.println("Agregando productos...");
        Almacen almacen = new Almacen();
        almacen.agregarProducto("PROD001", 50);
        almacen.agregarProducto("PROD002", 30);
        almacen.agregarProducto("PROD003", 15);
        almacen.listaInventario();
        System.out.println();
        System.out.println("Stock total: "+almacen.calcularStockTotal()+" unidades");

        System.out.println();

        System.out.println("Venta de 20 unidades de PROD001...");
        if (almacen.venderProducto("PROD001", 20)){
            System.out.println("Venta realizada. Stock restante "+almacen.consultarStock("PROD001"));
        } else {
            System.out.println("No tenemos suficiente stock");
        }

        System.out.println("Productos con stock bajo (menos de 20 unidades)");
        almacen.listarProductosBajoStock(20);

        System.out.println();

        String codigoMax = almacen.productoConMasStock();
        int stockMax = almacen.consultarStock(codigoMax);

        System.out.println("Producto con más stock: "+ codigoMax +" ("+ stockMax +" unidades)");


        System.out.println("Inventario completo");
        almacen.listaInventario();

        Diccionario diccionario = new Diccionario();

        System.out.println("Diccionario Espanol-Ingles");
        System.out.println("=================");
        System.out.println();
        System.out.println("Agregando traducciones");

        String[][] traducciones = {
                {"hola", "hello",},
                {"casa", "house"},
                {"gato", "cat"},
                {"perro", "dog"}
        };



        diccionario.agregarVariasTraducciones(traducciones);
        System.out.println();

        diccionario.agregarTraduccion("el", "the");
        diccionario.agregarTraduccion("esta", "is");
        diccionario.agregarTraduccion("en", "in");
        diccionario.agregarTraduccion("la", "the");


        System.out.println("Diccionario cargado con "+diccionario.tamanioDiccionario()+" palabras");

        diccionario.listarDiccionario();

        System.out.println();

        diccionario.traducirFrase("el gato esta en la casa");

        System.out.println();

        System.out.println("Total de palabras en el diccionario: "+diccionario.tamanioDiccionario());*/

        System.out.println("Sistema de calificaciones");
        System.out.println("=================");
        System.out.println();

        GestorCalificaciones gestorCalificaciones = new GestorCalificaciones();
        System.out.println("Agregando estudiantes...");
        String estudiante1 = "Ana";
        String estudiante2 = "Carlos";
        String estudiante3 = "Maria";

        gestorCalificaciones.agregarEstudiante(estudiante1);
        System.out.println("Estudiante agregado: "+estudiante1);
        gestorCalificaciones.agregarEstudiante(estudiante2);
        System.out.println("Estudiante agregado: "+estudiante2);
        gestorCalificaciones.agregarEstudiante(estudiante3);
        System.out.println("Estudiante agregado: "+estudiante3);

        System.out.println();

        System.out.println("Agregando calificaciones...");
        gestorCalificaciones.agregarCalificacion(estudiante1,8.5);
        gestorCalificaciones.agregarCalificacion(estudiante1,9.0);
        gestorCalificaciones.agregarCalificacion(estudiante1,7.5);
        gestorCalificaciones.mostrarCalificaciones(estudiante1);
        gestorCalificaciones.agregarCalificacion(estudiante2,6.0);
        gestorCalificaciones.agregarCalificacion(estudiante2,7.0);
        gestorCalificaciones.agregarCalificacion(estudiante2,6.5);
        gestorCalificaciones.mostrarCalificaciones(estudiante2);
        gestorCalificaciones.agregarCalificacion(estudiante3,9.5);
        gestorCalificaciones.agregarCalificacion(estudiante3,9.0);
        gestorCalificaciones.agregarCalificacion(estudiante3,10.0);
        gestorCalificaciones.mostrarCalificaciones(estudiante3);

        System.out.println();
        System.out.println("Promedios:");
        System.out.println("- " + estudiante1 + ": " + String.format("%.2f", gestorCalificaciones.calcularPromedio(estudiante1)));
        System.out.println("- " + estudiante2 + ": " + String.format("%.2f", gestorCalificaciones.calcularPromedio(estudiante2)));
        System.out.println("- " + estudiante3 + ": " + String.format("%.2f", gestorCalificaciones.calcularPromedio(estudiante3)));


        System.out.println();
        String mejor = gestorCalificaciones.mejorEstudiante();
        System.out.println("Mejor estudiante: " + mejor + " (" + String.format("%.2f", gestorCalificaciones.calcularPromedio(mejor)) + ")");


        System.out.println();
        double notaMinima = 7.0;
        System.out.println("Estudiantes aprobados (nota mínima " + String.format("%.2f", notaMinima) + "):");
        gestorCalificaciones.listarEstudiantesAprobados(notaMinima);



        System.out.println();
        System.out.println("Promedio general de la clase: " + String.format("%.2f", gestorCalificaciones.promedioGeneral()));


    }
}
