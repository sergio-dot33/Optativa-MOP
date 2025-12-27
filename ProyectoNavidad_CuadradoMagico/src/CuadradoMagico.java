public class CuadradoMagico {

    private int[][] matriz;

    public CuadradoMagico(int tamano){

       this.matriz = new int[tamano][tamano];
    }

    public void rellenarCuadrado(){

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                int aleatorio;

                do {
                    aleatorio = (int)(Math.random() * (matriz.length * matriz.length)) + 1;
                } while (numeroRepetido(aleatorio, i, j));

                matriz[i][j] = aleatorio;
            }
        }
    }

    private boolean numeroRepetido(int numero, int filaActual, int columnaActual){

        for (int i = 0; i < filaActual; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == numero) return true;
            }
        }

        for (int j = 0; j < columnaActual; j++){
            if (matriz[filaActual][j] == numero) return true;
        }
        return false;
    }


    public void mostrarCuadrado(){

        for (int [] fila : matriz){
            for (int  item : fila){
                System.out.print(item+"\t");
            }
            System.out.println();
        }
    }

    private int sumarColumnas(int nColumna){

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

             suma += matriz[i][nColumna];

        }

        return suma;
    }

    private int sumarFilas(int nFila){

        int suma = 0;

        for (int i = 0; i < matriz[nFila].length; i++) {

            suma += matriz[nFila][i];

        }

        return suma;
    }

    public int calcularConstante(){

        return sumarFilas(0);

    }

    private boolean filasCorrectas(){

        int constante = calcularConstante();

        for (int i = 0; i < matriz.length; i++) {

            if (sumarFilas(i)!=constante){
                return false;
            }

        }

        return true;
    }

    private boolean columnasCorrectas(){

        int constante = calcularConstante();

        for (int i = 0; i < matriz.length; i++) {

            if (sumarColumnas(i)!=constante){
                return false;
            }
        }

        return true;
    }

    private int sumarDiagonalPrincipal(){

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            suma += matriz[i][i];

        }

        return suma;

    }

    private int sumarDiagonalSecundaria(){

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            suma += matriz[i][(matriz.length-1)-i];

        }

        return suma;
    }

    public boolean esMagico(){

        int constante = calcularConstante();

        if (!filasCorrectas()){
            return false;
        }
        if (!columnasCorrectas()){
            return false;
        }
        if (sumarDiagonalPrincipal()!=constante){
            return false;
        }
        if (sumarDiagonalSecundaria()!=constante){
            return false;
        }
        return true;
    }

}












