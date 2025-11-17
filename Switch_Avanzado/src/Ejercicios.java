public class Ejercicios {

    public class ejercicio10{

        enum EstadoPedido {
            PENDIENTE,
            PROCESANDO,
            ENVIADO,
            EN_TRANSITO,
            ENTREGADO,
            CANCELADO
        }

        public static EstadoPedido obtenerEstadoActual(){

            int numeroAleatorio = (int) (Math.random()*6);

            switch (numeroAleatorio){

                case 0: return EstadoPedido.PENDIENTE;
                case 1: return EstadoPedido.PROCESANDO;
                case 2: return EstadoPedido.ENVIADO;
                case 3: return EstadoPedido.EN_TRANSITO;
                case 4: return EstadoPedido.ENTREGADO;
                case 5: return EstadoPedido.CANCELADO;
                default: return EstadoPedido.PENDIENTE;

            }
        }
    }

    public static void main(String[] args) {

        ejercicio10.EstadoPedido estado = ejercicio10.obtenerEstadoActual();

        System.out.println("Estado actual del pedido "+estado);

        switch (estado){

            case PENDIENTE :
                System.out.println("Pedido recibido");
                System.out.println("Siguiente paso XXX");
                break;
            case PROCESANDO:
                System.out.println("Pedido procesando");
                System.out.println("Siguiente paso XXX");
                break;
            case ENVIADO:
                System.out.println("Pedido enviado");
                System.out.println("Siguiente paso XXX");
                break;
            case EN_TRANSITO:
                System.out.println("Pedido en transito");
                System.out.println("Siguiente paso XXX");
                break;
            case ENTREGADO:
                System.out.println("Pedido cancelado");
                System.out.println("Siguiente paso XXX");
                break;
            case CANCELADO:
                System.out.println("Pedido cancelado");
                System.out.println("Siguiente paso XXX");
                break;


        }
















       SwitchAvanzado switchAvanzado = new SwitchAvanzado();
       //switchAvanzado.ejercicio1();
        // switchAvanzado.ejercicio2();
        //switchAvanzado.ejercicio3();
        //switchAvanzado.ejercicio4();
        //switchAvanzado.ejercicio5();
        //switchAvanzado.obtenerHoraActual();
        //switchAvanzado.ejercicio8();

    }
}
