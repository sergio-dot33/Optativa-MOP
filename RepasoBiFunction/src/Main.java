import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        /*


        BiFunction<Integer, Integer, Integer> suma = Integer::sum;
        System.out.println(suma.apply(3,5));

        BiFunction<String, Integer, String> textoRepetido = (texto, numero) -> {

            String resultado = "";

            for (int i = 0; i < numero; i++) {
                resultado += texto;
            }

            return resultado;

        };

        System.out.println(textoRepetido.apply("hola", 3));*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("---EJERCICIOS---");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");
        System.out.println("Elige un ejercicio (1-3)");
        int nEjercicio = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuantas repeticiones?");
        int repeticiones = scanner.nextInt();
        scanner.nextLine();

        switch (nEjercicio){

            case 1 -> System.out.println("Has elegido flexiones");
            case 2 -> System.out.println("Has elegido abdominales");
            case 3 -> System.out.println("Has elegido sentadillas");
        }

        int contador = 0;

        for (int i = 1; i <= repeticiones; i++) {

            System.out.println("Repeticion "+i+" completada");
            contador++;

        }

        System.out.println("Enhorabuena! Ejercicio completado, has hecho "+contador+" repeticiones");

    }
}
