import ejercicio1.Ejer1;
import ejercicio2.Ejer2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        /*Ejer1 operacion = (numero) -> numero * numero;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println(operacion.ejercicio1(i));
        }

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        Predicate<Integer> esPar = numero -> numero %2 == 0;

        for (Integer numero : numeros){
            if (esPar.test(numero)){
                System.out.println(numero);
            }
        }

        BiFunction<Integer, Integer, Integer> suma = Integer::sum;
        BiFunction<Integer, Integer, Integer> resta = (num1, num2) -> num1 - num2;
        BiFunction<Integer, Integer, Integer> multi = (num1, num2) -> num1 * num2;
        BiFunction<Integer, Integer, Integer> division = (num1, num2) -> num1 / num2;

        BiPredicate<String, String> palabras = (palabra1, palabra2) -> palabra1.length() == palabra2.length();
        System.out.println(palabras.test("hola", "casas"));

        BiConsumer<String, Integer> estudiante = (nombre, edad) -> System.out.println("Nombre: "+nombre+", Edad: "+edad);
        estudiante.accept("Pepe", 33);
        BiConsumer<String, Integer> estudiante1 = (nombre, edad) -> System.out.println("Nombre: "+nombre+", Edad: "+edad);
        estudiante1.accept("Lola", 18);
        BiConsumer<String, Integer> estudiante2 = (nombre, edad) -> System.out.println("Nombre: "+nombre+", Edad: "+edad);
        estudiante2.accept("Merche", 15);
        BiConsumer<String, Integer> estudiante3 = (nombre, edad) -> System.out.println("Nombre: "+nombre+", Edad: "+edad);
        estudiante3.accept("Juan", 92);

        Function<Integer, Integer> suma = (numero) -> numero + 10;
        Function<Integer, Integer> multi = (numero) -> numero * 2;
        Function<Integer, String> convertir = (numero) -> numero.toString();
        Function<Integer, String> operacionFinal = suma.andThen(multi).andThen(convertir);

        int[] numeros = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros.length ; i++) {

            String resultado = operacionFinal.apply(numeros[i]);
            System.out.println(resultado);

        Producto producto1 = new Producto("lampara", 33);
        Producto producto2 = new Producto("lavadora", 543);
        Producto producto3 = new Producto("secador", 23);
        Producto producto4 = new Producto("peine", 3);
        Producto producto5 = new Producto("nevera", 345);

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);


        BiFunction<Producto, Producto, Producto> mayorPrecio = (p1, p2) -> p1.getPrecio() > p2.getPrecio() ? p1 : p2;

        Producto masCaro = productos.get(0);

        for (int i = 1; i < productos.size(); i++) {

            masCaro = mayorPrecio.apply(masCaro, productos.get(i));

        }

        System.out.println("Producto más caro: " + masCaro.getNombre()
                + " - " + masCaro.getPrecio());*/

        int[] numeros = {7, 23, 45, 19, 68, 54, 92, 31, 76, 10};

        Predicate<Integer> mayores50 = (num) -> num > 50;
        Predicate<Integer> esPar = (num) ->  num %2 == 0;
        Predicate<Integer> divisible3 = (num) ->  num %3 == 0;

        for (int num : numeros){
            if (mayores50.test(num)){
                System.out.println("Mayor que 50: "+num);
            }
        }

        Predicate<Integer> mayores50YPar = mayores50.and(esPar);

        for (int num : numeros) {
            if (mayores50YPar.test(num)) {
                System.out.println("Mayor de 50 y par: " + num);
            }
        }


        Predicate<Integer> parODivisible3 = esPar.or(divisible3);

        for (int num : numeros){
            if (parODivisible3.test(num)){
                System.out.println("Par o divisible por 3: "+num);
            }
        }


        Predicate<Integer> noPar = esPar.negate();


        for (int num : numeros) {
            if (noPar.test(num)) {
                System.out.println("Impar: " + num);
            }
        }

    }
}

