package ejercicio4;

public class Producto {

    private String codigo, nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    public boolean hayStock(){

        return getStock() > 0;

    }

    public boolean vender(int cantidad){

        if (getStock() >= cantidad && cantidad > 0){
            setStock(getStock() - cantidad);
            return true;
        }

        return false;
    }

    public void reabastecer(int cantidad){

        if (cantidad > 0){
            setStock(getStock() + cantidad);
        }
    }

    public double calcularValorInventario(){

        return getStock() * getPrecio();

    }

    public void mostrarInfo(){

        System.out.printf("Codigo: %s, Nombre: %s, Precio: %.2f€, Stock: %d, Valor total: %.2f€%n "
                ,getCodigo(),getNombre(),getPrecio(),getStock(),calcularValorInventario());
    }

    @Override
    public String toString() {
        return "Producto: =" + nombre + '\'' +
                '}';
    }
}
