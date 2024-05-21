package org.example.capitulo_5;

public class CantidadNumerosPositivosNegativosParesImparesIngresados {
    // Definimos los números
    private int numero1 = 12;
    private int numero2 = -5;
    private int numero3 = 8;
    private int numero4 = -3;
    private int numero5 = 10;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public int getNumero4() {
        return numero4;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }

    public int getNumero5() {
        return numero5;
    }

    public void setNumero5(int numero5) {
        this.numero5 = numero5;
    }

    public void contarNumeros(int... numeros) {
        int positivos = 0, negativos = 0, pares = 0, impares = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    public void MostrarNumeros() {
        contarNumeros(getNumero1(), getNumero2(), getNumero3(), getNumero4(),getNumero5());
    }
}
