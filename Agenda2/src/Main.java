import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //static Contacto[] agenda = new Contacto[5];

    //static int totalContactos = 0;

    static ArrayList<Contacto> agenda = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        int opcion = 0;

        do {
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
                    agregarPersona();
                }
                case 2 -> {
                    buscarPersonas();
                }
                case 3 -> {
                    borrarPersona();
                }
                case 4 -> {
                    listarPersonas();
                }
                case 5 -> {
                    System.out.println("Saliendo");
                }
                default -> System.out.println("Opcion no valida");
            }

        } while (opcion != 5);

    }

    public static void agregarPersona(){

        String nombre;
        String apellido;
        String dni;
        int telefono;
        String email;


        System.out.println("Introduce nombre");
        nombre = scanner.nextLine();
        System.out.println("Introduce apellido");
        apellido = scanner.nextLine();
        System.out.println("Introduce DNI");
        dni = scanner.next();
        System.out.println("Introduce telefono");
        telefono = scanner.nextInt();
        System.out.println("Introduce tu email");
        email = scanner.next();

        if (existeEmail(email)){
            return;
        }

        agenda.add(new Contacto(nombre,apellido,telefono,dni,email));

        System.out.println("Persona agregada correctamente");

    }

    public static boolean existeEmail(String email){

        for (Contacto contacto : agenda){
            if (contacto.getEmail().equals(email)){
                System.out.println("ERROR. Ya existe contacto con este mail");
                return true;
            }
        }

        return false;

    }

    public static void buscarPersonas(){

        System.out.println("Introduce el DNI a buscar:");
        String dniBuscar = scanner.next();

        for (Contacto contacto : agenda){
            if (contacto.getDni().equals(dniBuscar)){
                System.out.println("Persona encontrada: ");
                System.out.println(contacto.toString());
                return;
            }
        }

        System.out.println("Usuario no encontrado");

    }

    public static void listarPersonas(){

        System.out.println("Lista de personas:");

        if (agenda.isEmpty()){
            System.out.println("No hay contactos existentes para mostrar");
            return;
        }

        for (Contacto contacto : agenda){
            System.out.println(contacto.toString());
        }
    }

    public static void borrarPersona(){

        System.out.println("Introduce el DNI de quien quieres borrar:");
        String dniBorrar = scanner.next();

        for (int i = 0; i < agenda.size(); i++) {

            Contacto contacto = agenda.get(i);

            if (contacto.getDni().equals(dniBorrar)){
                System.out.println("Persona encontrada y eliminada");
                agenda.remove(i);
                return;
            }
        }

        System.out.println("Contacto no encontrado");

    }
}
