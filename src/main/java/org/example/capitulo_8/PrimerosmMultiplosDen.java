package org.example.capitulo_8;

public class PrimerosmMultiplosDen {

    private int m; // primeros 5 múltiplos
    private int n; // del numero 7

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] primerosMultiplos(int m, int n) {
        int[] multiplos = new int[m];
        for (int i = 0; i < m; i++) {
            multiplos[i] = n * (i + 1);
        }
        return multiplos;
    }

    public void mostrarMultiplos() {

        int[] primerosMultiplosDeN = primerosMultiplos(getM(), getN());

        System.out.println("Los primeros " + getM() + " múltiplos de " + getN() + " son:");
        for (int i = 0; i < getM(); i++) {
            System.out.println(primerosMultiplosDeN[i]);
        }
    }
}
