public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        //ejercicio1
        // controller.validarContrasena("Marialuisa11");

        //ejercicio2
        //controller.buscarNumero(new int[]{1,3,5,7},2);

        /*ejercicio3
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i +1;
        }
        controller.mostrarPares(numeros);*/

        //ejercicio4
        //controller.calcularPromedio(new double[]{3.12,4.77,7.33,14.33,11.74,9.38});

        //ejercicio5 con scanner
        //controller.intentarLogin("pepitogrillo","pepito1234");

        //ejercicio5.1 con array
        //controller.intentarLogin2("pepitogrillo","pepito1234");

        //ejercicio6
        //imprimido
        /*System.out.println(
                controller.procesarTareas(
                        new String[]{"deberes","limpiar","trabajar"}
                )
        );*/
        //(sin imprimir) controller.procesarTareas(new String[]{"deberes","limpiar","trabajar"});

        //ejercicio7
        //controller.generarFibonacci(10);

        //ejercicio8
        //controller.contarEdadesValidas(new int[]{2,5,33,63,154,-65,79});
        //con impresion
        /*System.out.println(controller.contarEdadesValidas(
                new int[]{2,5,33,63,154,-65,79}
            )
        );*/

        //ejercicio9
        /*controller.contarVocales("vaca");
        controller.contienePalabrasProhibidas("hola que tal estas baby", new String[]{"baby"});
        System.out.println("Contiene palabra prohibida? "+controller.contienePalabrasProhibidas("hola que tal estas baby", new String[]{"baby"}));
        controller.primeraPalabraLarga("hola buenas tardes todo bien?",4);
         */


        /*impreso
        System.out.println(controller.contarVocales("animal"));
        System.out.println("Contiene palabra prohibida? "+controller.contienePalabrasProhibidas("hola que tal estas baby", new String[]{"baby"}));
        System.out.println(controller.primeraPalabraLarga("hola buenas tardes que tal?",4)); */

        //System.out.println(controller.verificarStock(6,5));



        String[] productos = {"pan","leche","huevos"};
        int[] cantidades = {3,0,12};
        double[] precios = {2.33,3.55,1.45};

        controller.procesarPedidos(productos,cantidades,precios);












    }
}
