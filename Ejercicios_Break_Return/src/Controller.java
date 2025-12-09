import java.util.Scanner;

public class Controller {

    public boolean validarContrasena(String password){

        //ejercicio1
        
        //metodo con if
        /*
        if (password.length()<8){
            System.out.println("La contrasena debe tener al menos 8 caracteres");
            return false;
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("La contrasena debe contener al menos una mayuscula");
            return false;
        } else if (!password.matches(".*\\d.*")){
            System.out.println("La contrasena debe contener al menos un numero");
            return false;
        }
        System.out.println("La contrasena es correcta");
        return true;*/

        //ejercicio1

        //metodo con for
        /*



        if (password.length()<8) {
            System.out.println("La contrasena debe tener al menos 8 caracteres");
            return false;
        }

        boolean tieneMayus = false;
        boolean tieneNum = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)){
                tieneMayus = true;
            }

            if (Character.isDigit(c)){
                tieneNum = true;
            }

            if (tieneMayus && tieneNum) {
                break;
            }
        }

        if (!tieneMayus){
            System.out.println("Error, debe tener una mayus");
            return false;
        }

        if (!tieneNum){
            System.out.println("Error, debe tener un num");
            return false;
        }

        System.out.println("Contrasena correcta");*/
        return true;


    }

    public int buscarNumero(int[] numeros, int objetivo){


        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == objetivo){
                System.out.println("Numero encontrado en posicion: "+i);
                return i;
            }
        }

        System.out.println("Numero no encontrado en el array");
        return -1;


    }

    public void mostrarPares(int[] numeros){


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 !=0){
                continue;
            }
            System.out.println(numeros[i]);
        }

    }

    public double calcularPromedio(double[] notas){

        int notaValida = 0;
        double sumaNotas = 0;


        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10){
                continue;
            }
            sumaNotas += notas[i];
            notaValida++;

        }

        if (notaValida == 0){
            System.out.println("No hay notas validas");
            return -1;
        }
        double promedio = sumaNotas / notaValida;
        System.out.println("El total de notas validas es "+notaValida);
        System.out.println("El promedio de notas validas es "+promedio);
        return promedio;

    }

    public boolean intentarLogin(String usuarioCorrecto, String passwordCorrecta){

        Scanner scanner = new Scanner(System.in);

        boolean loginCorrecto = false;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Introduce tu usuario: ");
            String usuarioIngresado = scanner.next();
            System.out.println("Introduce tu contrasena: ");
            String passwordIngresada = scanner.next();

            if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresada.equals(passwordCorrecta)){
                loginCorrecto = true;
                System.out.println("Login correcto");
                break;
            }

            System.out.println("Datos incorrecto. Intentos restantes "+(3-i));

            if (!loginCorrecto){
                System.out.println("Intento agotados");
            }

        }

        return loginCorrecto;

    }

    public boolean intentarLogin2(String usuarioCorrecto, String passwordCorrecta){

        boolean loginCorrecto = false;
        String[] usuariosIngresados = new String[]{"pacojuan","pedroporras","pepitogrillo"};
        String[] passIngresadas = new String[]{"pepito", "perez", "pepito1234"};

        for (int i = 0; i < usuariosIngresados.length; i++) {

            if (usuariosIngresados[i].equals(usuarioCorrecto) && passIngresadas[i].equals(passwordCorrecta)){
                loginCorrecto = true;
                System.out.println("Login correcto");
                break;

            }
        }
            if (!loginCorrecto){
                System.out.println("Intentos agotados");
            }

            return loginCorrecto;

    }

    public String procesarTareas(String[] tareas){

        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].toLowerCase().contains("urgente")){
                System.out.println("Existe tarea urgente prioritaria");
                return tareas[i];
            }
        }

        return "No hay tareas urgentes";


    }

    public void generarFibonacci(int limite){

        int numero1 = 0;
        int numero2 = 1;

        while (true){
            System.out.print(numero1+ ", ");
            int siguiente = numero1 + numero2;
            if (siguiente > limite){
                break;
            }

            numero1 = numero2;
            numero2 = siguiente;
        }

        System.out.println();



    }

    public int contarEdadesValidas(int[] edades){

        int edadValida = 0;

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 0 || edades[i] > 120){
                continue;
            }
            edadValida++;
        }

        return edadValida;
    }

    public int contarVocales(String texto){

        int vocales = 0;

        for (int i = 0; i < texto.length(); i++) {

            char c = Character.toLowerCase(texto.charAt(i));


            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                continue;
            }
            vocales++;
            }

        return vocales;


    }

    public boolean contienePalabrasProhibidas(String texto, String[] palabrasProhibidas){

        for ( String palabra : palabrasProhibidas){

            if (texto.toLowerCase().contains(palabra.toLowerCase())){
                return true;
            }
        }

        return false;

    }

    public String primeraPalabraLarga(String texto, int longitudMinima){

        String[] palabras = texto.split(" ");

        for (String item : palabras){
            if (item.length() > longitudMinima){
                return item;
            }
        }

        return null;


    }

}




