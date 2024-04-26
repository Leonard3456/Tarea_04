package org.example.capitulo_6;

public class MayorDe_n_Numeros {

    public int encontrarMayor(int... numeros) {

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public void mostrarMayor() {
        int mayor = encontrarMayor(10, 5, 23, 17, 8, 30);
        System.out.println("El mayor de los números es: " + mayor);
    }
}
