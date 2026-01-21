package ejercicio3;

public class CuentaBancaria {

    private String titular, numCuenta;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, String numCuenta) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad){

        if (cantidad > 0){
            setSaldo(getSaldo() + cantidad);
        }
    }

    public boolean retirar(double cantidad){

        if (cantidad <= getSaldo() && cantidad > 0){
            setSaldo(getSaldo() - cantidad);
            return true;
        }

        return false;

    }

    public boolean transferir(CuentaBancaria destino, double cantidad){

        if (destino != null && cantidad > 0){
            if (retirar(cantidad)){
                destino.ingresar(cantidad);
                return true;
            }
        }

        return false;
    }

    public void mostrarInfo(){

        System.out.println("Titular: "+getTitular()+", Numero de cuenta: "+getNumCuenta()+", Saldo actual: "+getSaldo()+"€");
    }


}
