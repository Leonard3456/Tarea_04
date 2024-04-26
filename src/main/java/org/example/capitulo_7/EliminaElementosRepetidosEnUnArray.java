package org.example.capitulo_7;

public class EliminaElementosRepetidosEnUnArray {

    public void mostrarElementos() {
        int[] lista = {1, 2, 3, 4, 2, 3, 5, 6, 7, 7, 8};

        int n = lista.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (lista[i] == lista[j]) {
                    for (int k = j; k < n - 1; k++) {
                        lista[k] = lista[k + 1];
                    }
                    n--;
                    j = i;
                }
            }
        }

        System.out.println("La nueva lista ahora tiene " + n + " elementos");

        // Mostrar la lista resultante
        for (int i = 0; i < n; i++) {
            System.out.println(lista[i]);
        }
    }
}
