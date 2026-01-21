import ejercicio1.Libro;
import ejercicio10.Biblioteca;
import ejercicio2.Estudiante;
import ejercicio3.CuentaBancaria;
import ejercicio4.Producto;
import ejercicio5.Rectangulo;
import ejercicio6.Pelicula;
import ejercicio7.Empleado;
import ejercicio8.Coche;
import ejercicio9.Tienda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*Libro libro1 = new Libro("El Quijote", "Cervantes", 863, 25.5);
        Libro libro2 = new Libro("Pocahontas", "Maduro", 456, 23.45);
        Libro libro3 = new Libro("Padre rico padre pobre", "Kiyosaki", 233, 33.3);

        libro1.mostrarInfo();
        System.out.println();
        System.out.println("Es un libro largo? "+libro1.esLibroLargo());
        System.out.println();
        double descuento = 10;
        System.out.println("Aplicando descuento del "+descuento+"%");
        libro3.aplicarDescuento(10);
        System.out.println("Nuevo precio: "+libro1.getPrecio()+"€");
        System.out.println();

        libro3.mostrarInfo();
        System.out.println();
        System.out.println("Es un libro largo? "+libro3.esLibroLargo());
        System.out.println();
        System.out.println("Aplicando descuento del "+descuento+"%");
        libro3.aplicarDescuento(10);
        System.out.println("Nuevo precio: "+libro3.getPrecio()+"€");

        Estudiante paco = new Estudiante("Paco", 33, 4.5,6.7,7.5);
        Estudiante juan = new Estudiante("Juan", 45, 3.3, 5.7, 8.2);

        System.out.println("Boletin estudiantes");
        System.out.println("============");
        System.out.println();

        paco.mostrarInforme();
        System.out.println();
        juan.mostrarInforme();

        System.out.println("CUENTA BANCARIA SANTANDER");
        System.out.println("==============");

        CuentaBancaria cuentaBancaria = new CuentaBancaria("Ana Lopez", "ES1234567890");
        System.out.println("Cuenta creada: ");
        cuentaBancaria.mostrarInfo();
        System.out.println();

        cuentaBancaria.ingresar(1000);
        System.out.println("Saldo actual "+cuentaBancaria.getSaldo()+"€");
        System.out.println();

        double cantidadRetiro = 300;
        System.out.println("Retirando "+cantidadRetiro+"€...");
        boolean reitradaExitosa = cuentaBancaria.retirar(cantidadRetiro);
        if (reitradaExitosa){
            System.out.println("Operacion exitosa. Saldo actual: "+cuentaBancaria.getSaldo()+"€");
        } else {
            System.out.println("No hemos podido realizar el retiro");
        }
        System.out.println();

        double cantidadRetiro1 = 1000;
        System.out.println("Retirando "+cantidadRetiro1+"€...");
        boolean retiradaFallida = cuentaBancaria.retirar(cantidadRetiro1);
        if (retiradaFallida){
            System.out.println("Operacion exitosa. Saldo actual: "+cuentaBancaria.getSaldo()+"€");
        } else {
            System.out.println("No hemos podido realizar el retiro");
        }
        System.out.println();

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Pedro Juan", "ES1233456789");
        double cantidadTransfer = 200;
        System.out.println("Transfiriendo "+cantidadTransfer+"€ a otra cuenta...");

        boolean transferenciaExitosa = cuentaBancaria.transferir(cuentaBancaria1, cantidadTransfer);


        if (transferenciaExitosa){
            System.out.println("Transferencia exitosa. Saldo actual "+cuentaBancaria.getSaldo()+"€");
        } else {
            System.out.println("No se ha podido realizar la transferencia");
        }

        System.out.println("TIENDA PC ONLINE");
        System.out.println("=============");
        System.out.println();

        Producto producto = new Producto("123", "Teclado", 33.3, 5);
        producto.mostrarInfo();
        System.out.println();

        System.out.println("Hay stock de "+producto.getNombre()+"?");
        if (producto.hayStock()){
            System.out.println("Si, tenemos stock de "+producto.getStock()+" unidades");
        } else {
            System.out.println("Producto agotado");
        }
        System.out.println();

        producto.vender(5);
        System.out.println("Hay stock de "+producto.getNombre()+"?");
        if (producto.hayStock()){
            System.out.println("Si, tenemos stock de "+producto.getStock()+" unidades");
        } else {
            System.out.println("Producto agotado");
        }
        System.out.println();

        producto.reabastecer(7);
        System.out.printf("%.2f€%n",producto.calcularValorInventario());
        producto.mostrarInfo();

        System.out.println("CALCULADORA AREA/PERIMETRO");
        System.out.println("============");
        System.out.println();

        Rectangulo rectangulo = new Rectangulo(16, 8);
        System.out.print("Rectangulo creado: ");
        rectangulo.mostrarInfo();
        System.out.println("Escalando por factor 2....");
        rectangulo.escalar(2);
        rectangulo.mostrarInfo();
        System.out.println();

        Rectangulo rectangulo1 = new Rectangulo(12,12);
        System.out.print("Rectangulo creado: ");
        rectangulo1.mostrarInfo();
        System.out.println("Escalando por factor 2....");
        rectangulo1.escalar(2);
        rectangulo1.mostrarInfo();

        Pelicula p1 = new Pelicula("Collateral", "Mann", 154, 2005, 10);
        Pelicula p2 = new Pelicula("John Wick", "Chad", 123, 2014, 6.5);
        Pelicula p3 = new Pelicula("Interstellar", "Nolan", 155, 2014, 10);

        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);

        System.out.println("COLECCIÓN DE PELÍCULAS");
        System.out.println("=====================");
        System.out.println();

        for (Pelicula pelicula : peliculas) {
            pelicula.mostrarInfo();
            System.out.println();

            if (pelicula.esRecomendable()) {
                System.out.println("Recomendación: ¡Muy recomendable!");
            } else {
                System.out.println("Recomendación: No recomendable");
            }
            System.out.println("-----------------------------");
        }

        Empleado empleado = new Empleado("Juan", "043232923d", 23000);
        Empleado empleado1 = new Empleado("Paula", "0349324s", 43000);

        System.out.println("INFORMES TRABAJO");
        System.out.println("============");
        System.out.println();

        empleado.mostrarInforme();
        System.out.println();

        System.out.println("Anadiendo 10 horas extras");
        empleado.agregarHorasExtra(10);
        System.out.println();

        System.out.println("Nuevo empleado del mes, por el mas currante, enhorabuena: "+empleado.getNombre());
        System.out.println("Aplicando aumento del 10%");
        empleado.aplicarAumento(10);
        empleado.mostrarInforme();
        System.out.println();

        System.out.println("CERRAMOS FACTURACION Y RESET HORAS");
        empleado.resetearHorasExtra();
        empleado.mostrarInforme();
        System.out.println();
        System.out.println("FIN DE ANIO, CERRAMOS INFORMES");

        System.out.println("COCHE");
        System.out.println("=========");
        System.out.println();

        Coche coche = new Coche("Seat", "Leon", 2018);
        coche.mostrarInfo();
        System.out.println();

        coche.conducir(20);
        coche.conducir(233);
        coche.conducir(33);
        System.out.printf("%.2f litros%n",coche.getCombustible());
        System.out.println("Repostando 40L...");
        coche.repostar(40);
        coche.conducir(744);
        System.out.println();
        coche.mostrarInfo();

        System.out.println("TIENDA ONLINE PACO");
        System.out.println("============");
        System.out.println();

        Tienda tienda = new Tienda("Tienda Paco");
        Producto producto = new Producto("12223F", "Paraguas", 44.53, 4);
        System.out.println("Agregando productos...");
        if (tienda.agregarProducto(producto)){
            System.out.println("Producto agregado correctamente");
        } else {
            System.out.println("No se ha podido agregar el producto");
        }

        System.out.println();

        tienda.listarProductos();
        System.out.println();

        System.out.println("Buscando producto...");
        System.out.println(tienda.buscarProducto("12223F"));*/

        Biblioteca biblioteca = new Biblioteca("Biblioteca municipal");
        System.out.println("Biblioteca creada: "+biblioteca.getNombre());
        System.out.println();
        System.out.println("Agregando libros...");
        Libro libro1 = new Libro("El Quijote", "Cervantes", "978-1234567890", 863, 25.5);
        if (biblioteca.agregarLibro(libro1)) {
            System.out.println("Libro agregado: " + libro1.getTitulo() + " (ISBN: " + libro1.getIsbn() + ")");
        }

        Libro libro2 = new Libro("Cien Años de Soledad", "García Márquez", "978-0987654321", 417, 22.0);
        if (biblioteca.agregarLibro(libro2)) {
            System.out.println("Libro agregado: " + libro2.getTitulo() + " (ISBN: " + libro2.getIsbn() + ")");
        }

        System.out.println("Prestamo del libro " + libro1.getIsbn() + "...");
        if (biblioteca.prestarLibro(libro1.getIsbn())) {
            System.out.println("Libro prestado exitosamente.");
        } else {
            System.out.println("No se ha podido prestar el libro.");
        }

        System.out.println("Libros disponibles:");
        biblioteca.listarLibrosDisponibles();
        System.out.println();
        System.out.println();

        System.out.println("Libros prestados:");
        biblioteca.listarLibrosPrestados();
        System.out.println();
        System.out.println();

        System.out.println("Devolucion del libro "+libro1.getIsbn()+"...");

        if (biblioteca.devolverLibro(libro1.getIsbn())){
            System.out.println("Libro devuelto exitosamente");
        } else {
            System.out.println("No se ha podido devolver");
        }
    }
}
