public class Entrada {

    public static void main (String[] args){

        System.out.println("Ejecucion de metodos");
        saludar("Borja");
        despedir();
        Operaciones operacionesMath = new Operaciones();
        operacionesMath.sumar(4,7);
        operacionesMath.sumar(9,4);
        operacionesMath.restar(5,8);
        operacionesMath.restar(5,1);
        operacionesMath.multi(5,6);
        System.out.println("El numero es valido " +operacionesMath.validarNumero(20));


    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Buenos dias");
        System.out.println("Que tal estas");
        System.out.println("Quieres un cafe");
        System.out.println("Este metodo se va a repetir en el saludo");

    }

    public static void despedir(){
        System.out.println("Hasta luego");
        System.out.println("Por hoy ya hemos terminado");
        System.out.println("Vamos a cerrar la clase");
    }

}
