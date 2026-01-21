package ejercicio7;

public class Empleado {

    private String nombre, DNI;
    private double salarioBase;
    private int horasExtras;

    public Empleado() {
    }

    public Empleado(String nombre, String DNI, double salarioBase) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.salarioBase = salarioBase;
        this.horasExtras = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void agregarHorasExtra(int horas){

        if (horas > 0){
            setHorasExtras(getHorasExtras() + horas);
        }
    }

    public double calcularSalarioTotal(){

        return salarioBase + 20 * getHorasExtras();
    }

    public void aplicarAumento(double porcentaje){

        if (porcentaje > 0){
            setSalarioBase(salarioBase + (salarioBase * porcentaje / 100));
        }
    }

    public void resetearHorasExtra(){

        setHorasExtras(0);
    }

    public void mostrarInforme(){

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Salario base: " + salarioBase+"€");
        System.out.println("Horas extras: " + horasExtras);
        System.out.printf("Salario total: %.2f€%n", calcularSalarioTotal());

    }


}
