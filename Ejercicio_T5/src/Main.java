import controller.GestionNotas;
import model.Alumno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("GESTIONADOR NOTAS");
        System.out.println("=========");
        System.out.println();

        GestionNotas gestionNotas = new GestionNotas();
        Alumno alumno = new Alumno("Paco", "Sanz", "033F", 2.4);
        Alumno alumno1 = new Alumno("Ana", "Efe", "033S", 6.4);
        Alumno alumno2 = new Alumno("Fran", "Sola", "033X", 3.4);
        Alumno alumno3 = new Alumno("Polen", "Lopez", "033R", 9.4);
        Alumno alumno4 = new Alumno("Maria", "Amor", "033Y", 3.3);
        gestionNotas.introducirAlumno(alumno);
        gestionNotas.introducirAlumno(alumno1);

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Introducir alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Ver mejores expedientes");
            System.out.println("4. Ver expedientes superiores a nota minima");
            System.out.println("5. Vaciar lista");
            System.out.println("6. Mostrar datos");
            System.out.println("7. Salir");
            System.out.println();

            System.out.println("Elige una opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1 -> {
                    System.out.println("Introduce el nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Introduce el apellido");
                    String apellido = scanner.nextLine();
                    System.out.println("DNI:");
                    String dni = scanner.nextLine();
                    System.out.println("Introduce nota:");
                    double nota = scanner.nextDouble();

                    Alumno nuevoAlumno = new Alumno(nombre,apellido,dni,nota);

                    if (gestionNotas.introducirAlumno(nuevoAlumno)){
                        System.out.println("Alumno introducido correctamente :)");
                    } else {
                        System.out.println("Error, no se ha podido introducir al alumno");
                    }
                }
                case 2 -> {
                    System.out.print("Introduce DNI del alumno a buscar: ");
                    String dniBuscar = scanner.nextLine();

                    double notaAlumno = gestionNotas.buscarAlumno(dniBuscar);
                    if (notaAlumno != -1) {
                        System.out.println("Nota del alumno: " + notaAlumno);
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.println("Introduce cuantos mejores expedientes quieres ver");
                    int limite = scanner.nextInt();
                    scanner.nextLine();

                    gestionNotas.verMejoresNotas(limite);
                }
                case 4 -> {
                    System.out.println("Introduce nota minima:");
                    double notaMinima = scanner.nextDouble();

                    gestionNotas.verNotasSuperiores(notaMinima);
                }
                case 5 -> {
                    gestionNotas.vaciarLista();
                    System.out.println("Lista reseteada");
                }
                case 6 -> gestionNotas.mostrarDatos();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida");

            }
        } while (opcion!=7);

    }
}
