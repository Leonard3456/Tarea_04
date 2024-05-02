package org.example.capitulo_7;

import java.util.Arrays;

public class OrdenamientoPorBurbuja {
    public void ordenarArreglo(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];    // intercambia los elementos si están en el orden incorrecto
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public void mostrarArreglo() {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        ordenarArreglo(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
}
