package org.example.capitulo_2;

public class MayorValorTresNumeros {
    private int numero1;
    private int numero2;
    private int numero3;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int encontrarMayor() {
        int mayor = getNumero1();

        if (getNumero2() > mayor) {
            mayor = getNumero2();
        }
        if (getNumero3() > mayor) {
            mayor = getNumero3();
        }
        return mayor;
    }

    public void mostrarMayor() {
        System.out.println("El mayor valor de los tres números es: " + encontrarMayor());
    }
}
