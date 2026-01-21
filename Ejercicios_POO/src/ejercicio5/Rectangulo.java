package ejercicio5;

public class Rectangulo {

    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0){
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0){
            this.altura = altura;
        }
    }

    public double calcularArea(){

        return base * altura;

    }

    public double calcularPerimetro(){

        return 2 * (base + altura);
    }

    public boolean esCuadrado(){

        return base == altura;
    }

    public void escalar(double factor){

        if (factor > 0){
            double baseEscalada = base * factor;
            double alturaEscalada = altura * factor;

            setBase(baseEscalada);
            setAltura(alturaEscalada);
        }
    }

    public void mostrarInfo(){

        System.out.printf("Base: %.2f, Altura: %.2f, Area: %.2f, Perimetro: %.2f, Es cuadrado?: %b%n",
                getBase(),getAltura(),calcularArea(),calcularPerimetro(),esCuadrado());
    }
}
