import java.util.Scanner;

public class SwitchAvanzado {

    public void ejercicio1(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que calificacion has obtenido");
        double calificacion = scanner.nextDouble();

        if (calificacion<0 || calificacion>10){
            System.out.println("Valor no valido, debe estar entre 0 y 10");
        }

        int rango = (int) calificacion;
        char letra;


        switch (rango){
            case 0, 1, 2, 3 :
                letra = 'F';
                break;

            case 4 :
                letra = 'D';
                break;

            case 5, 6 :
                letra = 'C';
                break;

            case 7, 8 :
                letra = 'B';
                break;

            case 9, 10 :
                letra = 'A';
                break;

            default:
                System.out.println("Calificacion fuera de rango");
                return;

        }

        System.out.println("Tu calificacion numerica ha sido "+calificacion);
        System.out.println("Tu calificacion en letra es "+letra);

        scanner.close();


    }

    public void ejercicio2(){

        double euros = 33.0;

        Monedas moneda = Monedas.YEN;
        double tasa = 0.0;
        String nombreMoneda = "";

        switch (moneda){

            case USD :
                tasa = 1.16;
                nombreMoneda = "dolares";
                break;

            case YEN :
                tasa = 179.12;
                nombreMoneda = "yenes";
                break;

            case PESO :
                tasa = 21.17;
                nombreMoneda = "pesos";
                break;

            case LIBRA :
                tasa = 0.88;
                nombreMoneda = "libras";
                break;

            default:
                System.out.println("Esa moneda no esta contemplada");
                return;

        }

        double resultado = euros * tasa;
        System.out.printf("%.2f euros son %.2f %s.%n",euros, resultado, nombreMoneda);

    }

    public void ejercicio3(){

        //no funciona en java por pedir variable constante y nivel lenguaje

        /*int temperatura = 22; // puedes cambiar este valor para probar

        switch (true) {

            case (temperatura < 0):
                System.out.println("Categoría: ❄️ Helado");
                System.out.println("Recomendación: Usa abrigo grueso, bufanda y guantes.");
                break;

            case (temperatura >= 0 && temperatura <= 15):
                System.out.println("Categoría: 🧥 Frío");
                System.out.println("Recomendación: Lleva chaqueta o suéter.");
                break;

            case (temperatura >= 16 && temperatura <= 25):
                System.out.println("Categoría: 🙂 Templado");
                System.out.println("Recomendación: Ropa cómoda, camiseta o camisa ligera.");
                break;

            case (temperatura >= 26 && temperatura <= 35):
                System.out.println("Categoría: 🌞 Calor");
                System.out.println("Recomendación: Ropa fresca y agua.");
                break;

            default:
                System.out.println("Categoría: 🔥 Muy caliente");
                System.out.println("Recomendación: Mantente hidratado, evita el sol directo.");
        }*/

    }

    public void ejercicio4(){

        enum CategoriaPlato{

            ENTRADA, PRINCIPAL, POSTRE, BEBIDA
        }

        System.out.println("Elige categoria plato");
        System.out.println("1. Entrada");
        System.out.println("2. Principal");
        System.out.println("3. Postre");
        System.out.println("4. Bebida");
        System.out.println("Opcion: ");
        int opcion = 2;

        CategoriaPlato categoria;
        switch (opcion){
            case 1 -> categoria = CategoriaPlato.ENTRADA;
            case 2 -> categoria = CategoriaPlato.PRINCIPAL;
            case 3 -> categoria = CategoriaPlato.POSTRE;
            case 4 -> categoria = CategoriaPlato.BEBIDA;
            default -> {
                System.out.println("Opcion no valida");
                return;
            }
        }


        switch (categoria){
            case ENTRADA :
                System.out.println("Ensalada");
                System.out.println("Caracoles");
                System.out.println("Gazpacho");
                break;

            case PRINCIPAL :
                System.out.println("Hamburguesa");
                System.out.println("Lubina");
                System.out.println("Pollo");
                break;

            case POSTRE:
                System.out.println("Tarta");
                System.out.println("Fruta");
                System.out.println("Yogur");
                break;

            case BEBIDA:
                System.out.println("Agua");
                System.out.println("Vino");
                System.out.println("Refresco");
                break;

            default:
                System.out.println("No valido");
                return;
            }
    }

    public void ejercicio5(){

        Scanner scanner = new Scanner(System.in);

        double num1 = 5.5;
        double num2 = 3.7;

        System.out.println("Que operacion quieres hacer?");
        char operador = scanner.next().charAt(0);

        switch (operador){
            case '+' :
                System.out.println("Vas a realizar una suma");
                double suma = num1 + num2;
                System.out.println("El resultado de la suma es "+suma);
                break;

            case '-' :
                System.out.println("Vas a realizar una resta");
                double resta = num1 - num2;
                System.out.println("El resultado de la resta es "+resta);
                break;

            case '*' :
                System.out.println("Vas a realizar una multiplicacion");
                double multi = num1 * num2;
                System.out.println("El resultado de la multiplicacion es "+multi);
                break;

            case '/' :
                System.out.println("Vas a realizar una division");
                double division = num1 / num2;
                System.out.println("El resultado de la division es "+division);
                break;

            default:
                System.out.println("Operacion no contemplada");
        }

    }

    public void obtenerHoraActual(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Solicitando numero de 0 a 23");
        int numero = scanner.nextInt();

        String momentoDia = "";

        switch (numero){
            case 0, 1, 2, 3, 4, 5:
                momentoDia = "Madrugada";
                break;

            case 6, 7, 8, 9, 10, 11:
                momentoDia = "Manana";
                break;

            case 12, 13, 14, 15, 16, 17, 18, 19:
                momentoDia = "Tarde";
                break;

            case 20, 21, 22, 23:
                momentoDia = "Noche";
                break;

            default:
                System.out.println("Hora no valida");
                return;
        }

        scanner.close();

        System.out.println("Hola Paki! Estamos en horario de "+momentoDia);

    }

    public void ejercicio8(){

    /*
    **Objetivo:** Crear un programa que identifique el tipo de archivo según su extensión.

    **Requisitos:**

    1. Declara una variable `String extension` (por ejemplo: "jpg", "pdf", "txt", "mp3").
    2. Usa un `switch` para agrupar extensiones similares: Imágenes (jpg, png, gif), Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
    3. Muestra el tipo de archivo y el programa recomendado para abrirlo.


     */

        //declarar variable
        //usar switch - agrupar extensiones
        //mostrar archivo y programa

        Scanner scanner = new Scanner(System.in);

        String grupoExtension = "";
        String programa = "";
        System.out.println("Que formato de archivo quieres abrir?");
        String extension = scanner.next().toLowerCase();

        switch (extension){

            case "jpg", "png", "gif" ->{
                grupoExtension = "Imagenes";
                programa = "Google Fotos";
            }
            case "pdf", "doc", "txt" ->{
                grupoExtension = "Documentos";
                programa = "Adobe";
            }
            case "mp3", "wav" ->{
                grupoExtension = "Audio";
                programa = "Spotify";
            }
            case "mp4", "avi" ->{
                grupoExtension = "Video";
                programa = "VLC player";
            }
            default -> {
                System.out.println("Formato no valido");
                return;
            }

        }

        scanner.close();

        System.out.println("La extension seleccionada pertence a la categoria de "+grupoExtension+ " y se puede abrir con "+programa);

    }

    public void ejercicio10(){

        /*
        1 crear enum
        2crear metodo obtenerEstadoActual() que devuelva valor aleatorio
        3 en el main usar switch para mostrar
        4 indicar siguiente paso del pedido MENOS en estado entregado y cancelado

         */







    }

}

