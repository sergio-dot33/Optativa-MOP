import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica de que tamaño vamos a hacer el cuadrado");
        int tamano = scanner.nextInt();

        CuadradoMagico cuadradoMagico = new CuadradoMagico(tamano);

        int intentos = 0;

        do {

            cuadradoMagico.rellenarCuadrado();
            intentos++;


        } while (!cuadradoMagico.esMagico());

        System.out.println("---CUADRADO MÁGICO ENCONTRADO");

        cuadradoMagico.mostrarCuadrado();

        System.out.println("Constante mágica: "+cuadradoMagico.calcularConstante());
        System.out.println("Intentos realizados: "+intentos);

    }
}

