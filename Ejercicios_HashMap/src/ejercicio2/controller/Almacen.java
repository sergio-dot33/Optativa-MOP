package ejercicio2.controller;

import java.util.HashMap;

public class Almacen {

    private HashMap<String, Integer> listaProductos;

    public Almacen() {

        listaProductos = new HashMap<>();
    }

    public Almacen(HashMap<String, Integer> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public HashMap<String, Integer> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(HashMap<String, Integer> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregarProducto(String codigo, int cantidad){

        if (listaProductos.containsKey(codigo)){
            int cantidadActual = listaProductos.get(codigo);
            int nuevaCantidad = cantidadActual + cantidad;
            listaProductos.put(codigo,nuevaCantidad);
        } else {
            listaProductos.put(codigo, cantidad);
        }

    }

    public Integer consultarStock(String codigo){

        if (listaProductos.containsKey(codigo)){
            return listaProductos.get(codigo);
        }

        return null;
    }

    public boolean venderProducto(String codigo, int cantidad) {

        Integer stockActual = consultarStock(codigo);

        if (stockActual != null && stockActual >= cantidad) {
            int nuevoStock = stockActual - cantidad;
            listaProductos.put(codigo, nuevoStock);
            return true;
        }

        return false;
    }

    public void listaInventario(){

        for (String codigo : listaProductos.keySet()){
            int cantidad = listaProductos.get(codigo);
            System.out.println("- "+codigo+": "+cantidad+" unidades");

        }
    }

    public void listarProductosBajoStock(int minimo){

        for (String codigo : listaProductos.keySet()){
            int cantidad = listaProductos.get(codigo);
            if (cantidad < minimo){
                System.out.println("- "+codigo+": "+cantidad+" unidades");
            }
        }

    }

    public int calcularStockTotal(){

        int cantidad = 0;

        for (String codigo : listaProductos.keySet()){
            cantidad+= listaProductos.get(codigo);
        }

        return cantidad;

    }

    public String productoConMasStock(){

        int mayorCantidad = 0;
        String producto = null;

        for (String codigo : listaProductos.keySet()){
            int cantidad = listaProductos.get(codigo);

            if (cantidad > mayorCantidad){
                mayorCantidad = cantidad;
                producto = codigo;
            }

        }

        return producto;
    }
}
