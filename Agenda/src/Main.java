import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Object[]> listaContactos = new ArrayList<>();

    public static void main(String[] args) {

        listaContactos.add(new Object[]{"Pepe","Perez","0315A","613"});


        int opcion = 0;
        while (opcion !=5){

            System.out.println("---MENU AGENDA---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar personas");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir: ");
            System.out.println("Seleccione una opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){

                case 1 -> {
                    System.out.println("1. Agregar persona");
                    agregarPersona();
                }

                case 2 -> {
                    System.out.println("2. Buscar persona");
                    buscarPersona();
                }

                case 3 -> {
                    System.out.println("3. Borrar personas");
                    borrarPersona();
                }

                case 4 -> {
                    System.out.println("4. Listar personas");
                    listarContactos();
                }

                case 5 -> {
                    System.out.println("5. Salir: ");
                }

                default -> System.out.println("Opcion no valida");

            }
        }

    }

    public static void agregarPersona(){


        String nombre;
        String apellido;
        String DNI;
        String telefono;


        System.out.println("Introduce nombre");
        nombre = scanner.nextLine();
        System.out.println("Introduce apellido");
        apellido = scanner.nextLine();
        System.out.println("Introduce DNI");
        DNI = scanner.next();
        System.out.println("Introduce telefono");
        telefono = scanner.next();

        Object[] persona = new Object[]{nombre,apellido,DNI,telefono};

        listaContactos.add(persona);

        System.out.printf("Persona agregada correctamente: Nombre: %s, Apellido: %s, DNI: %s, Telefono: %s\n",persona[0],persona[1],persona[2],persona[3]);


    }

    public static void buscarPersona(){


        System.out.println("Introduce el DNI para buscar:");
        String DNI = scanner.next();

        for (int i = 0; i < listaContactos.size(); i++) {

            Object[] persona = listaContactos.get(i);

            if (persona[2].toString().equals(DNI)){

                System.out.println("Persona encontrada:");
                System.out.println(Arrays.toString(persona));
                return;
            }

        }

        System.out.println("Usuario no encontrado");

    }

    public static void borrarPersona(){


        System.out.println("Introduce el DNI a borrar:");
        String DNI = scanner.next();

        for (int i = 0; i < listaContactos.size(); i++) {

            Object[] persona = listaContactos.get(i);

            if (persona[2].toString().equals(DNI)){

                listaContactos.remove(i);
                System.out.println("Persona borrada correctamente");
                return;
            }
        }

        System.out.println("No se ha podido borrar ese contacto");

    }

    public static void listarContactos(){

        System.out.println("Listar personas:");

        for (int i = 0; i < listaContactos.size(); i++) {

            Object[] persona = listaContactos.get(i);

            System.out.printf("Nombre: %s - Apellido: %s - Telefono: %s\n",persona[0],persona[1],persona[3]);

        }

    }

}
