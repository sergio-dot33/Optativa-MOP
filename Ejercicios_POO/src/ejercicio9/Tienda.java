package ejercicio9;

import ejercicio4.Producto;

import java.util.ArrayList;

public class Tienda {

    private String nombre;
    private ArrayList<Producto> listaProductos;
    private int numProductos;

    public Tienda() {
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
        listaProductos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public boolean agregarProducto(Producto producto){

        if (listaProductos.size() < 50){
            listaProductos.add(producto);
            return true;
        }

        return false;
    }

    public Producto buscarProducto(String codigo){

        for (Producto producto : listaProductos){
            if (producto.getCodigo().equals(codigo)){
                return producto;
            }
        }

        return null;
    }

    public void listarProductos(){

        for (Producto producto : listaProductos){
            producto.mostrarInfo();
        }
    }

    public void listarProductosSinStock(){

        for (Producto producto : listaProductos){
            if (producto.getStock() <= 0){
                producto.mostrarInfo();
            }
        }
    }

    public double calcularValorTotalInventario(){

        double valorInventario = 0;
        double valorProducto = 0;

        for (Producto producto : listaProductos){
            valorProducto = producto.getStock() * producto.getPrecio();
            valorInventario += valorProducto;
        }

        return valorInventario;
    }
}
