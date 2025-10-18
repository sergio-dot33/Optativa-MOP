import java.util.Scanner;

public class Ejercicio {

    private Scanner lectorTeclado;
    /*
    Enunciado
     */

    public void ejercicio1(){
        //1 -> pedir cosas por teclado
        //2 -> guardar cosas en variables
        //3 -> realizar calculos
        //4 -> mostrar informacion

        lectorTeclado = new Scanner(System.in);
        //1 y 2

        System.out.println("Cuantas bebidas vas a comprar");
        int bebidas = lectorTeclado.nextInt();
        System.out.println("Cuantos bocadillos vas a comprar");
        int bocadillos = lectorTeclado.nextInt();
        System.out.println("Cuanto vale cada bebida");
        double precioBebida = lectorTeclado.nextDouble();
        System.out.println("Cuanto vale cada bocadillo");
        double precioBocadillo = lectorTeclado.nextDouble();
        System.out.println("Cuantas personas han realizado la comrpa");
        int numeroPersonas = lectorTeclado.nextInt();

        //3

        double costeBocadillos = bocadillos*precioBocadillo;
        double costeBebidas = bebidas*precioBebida;
        double costeTotal = costeBebidas+costeBocadillos;
        double precioPersona = costeTotal/numeroPersonas;

        //4

        System.out.printf("El precio total de la compra es %. 2f%n",costeTotal);
        System.out.printf("El precio total de los bocatas es %. 2f%n",costeBocadillos);
        System.out.printf("El precio total de las bebidas es %. 2f%n",costeBebidas);
        System.out.printf("El precio a pagar por persona es %. 2f%n",precioPersona);


        lectorTeclado.close();
    }

    public void ejercicio4(){

        /*
        Enunciado
         */

        //1 pedir datos
        //2 realizar calculos
        //3 mostrar datos

        //1

        lectorTeclado = new Scanner(System.in);
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int segundos = lectorTeclado.nextInt();

        //2
        //segundos en horas -> 3600
        //minutos en horas -> 60
        //segundos en horas -> 60

        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        int segudos = segundos%60;




        lectorTeclado.close();



    }


}
