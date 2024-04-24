package org.example.capitulo_2;

public class MayorValorTresNumeros {
    public int numero1;
    public int numero2;
    public int numero3;

    public int encontrarMayor() {
        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        return mayor;
    }

    public void mostrarMayor() {
        System.out.println("El mayor valor de los tres números es: " + encontrarMayor());
    }
}
