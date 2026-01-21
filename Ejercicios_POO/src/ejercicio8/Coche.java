package ejercicio8;

public class Coche {

    private String marca, modelo;
    private int anio;
    private double kilometraje, combustible;

    public Coche() {
    }

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = 0;
        this.combustible = 50;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        if (kilometraje >= 0){
            this.kilometraje = kilometraje;
        }
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <=60){
            this.combustible = combustible;
        }
    }

    public void conducir(double km){

        if (km <= 0){
            System.out.println("Error, kms deben ser positivos");
            return;
        }

        double litrosNecesarios = km / 15;

        if (getCombustible() >= litrosNecesarios){
            setKilometraje(getKilometraje() + km);
            setCombustible(getCombustible() - litrosNecesarios);
        } else {
            System.out.println("Error, no hay suficiente gasolina");
        }


    }

    public void repostar(double litros){

        if (litros <= 0) {
            System.out.println("Litros no pueden ser negativos");
            return;
        }

        double nuevoCombustible = getCombustible() + litros;

        if (nuevoCombustible > 60){
            setCombustible(60);
        } else {
            setCombustible(nuevoCombustible);
        }

    }


    public int calcularAntiguedad(){

        int anioActual = 2025;

        return anioActual - getAnio();

    }

    public boolean necesitaMantenimiento(){

        return getKilometraje() > 10000;
    }

    public void mostrarInfo(){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
        System.out.println("Kilometraje: " + kilometraje+" kms");
        System.out.printf("Combustible: %.2f litros%n",combustible);
        System.out.println("Necesita mantenimiento?: "+necesitaMantenimiento());
        System.out.println("Cuantos anios tiene? "+calcularAntiguedad()+" anios");

    }
}
