package org.example.capitulo_8;

public class Primeros_m_MultiplosDe_n {

    public static int[] primerosMultiplos(int m, int n) {
        int[] multiplos = new int[m];
        for (int i = 0; i < m; i++) {
            multiplos[i] = n * (i + 1);
        }
        return multiplos;
    }

    public void mostrarMultiplos() {
        int m = 5; // primeros 5 múltiplos
        int n = 7; // del numero 7

        int[] primerosMultiplosDeN = primerosMultiplos(m, n);

        System.out.println("Los primeros " + m + " múltiplos de " + n + " son:");
        for (int i = 0; i < m; i++) {
            System.out.println(primerosMultiplosDeN[i]);
        }
    }
}
