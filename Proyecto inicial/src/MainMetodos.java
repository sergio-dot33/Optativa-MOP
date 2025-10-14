public class MainMetodos {
    public static void main(String[] args) {
        System.out.println("Main para probar metodos y variables");
        //saludar("Sergio");
        saludar("Sergio");
        despedir("Sergio");
        //despedir();

    }

    static void saludar(String data){
        System.out.println("Enhorabuena "+data+" has llamado a tu primer metodo");

    }

    static void despedir(String data){
        System.out.println("Hasta luego "+data+" hemos terminado");
    }

}
