package org.example.capitulo_8;

public class NumeroPrimo {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void primo() {

        if (esPrimo(getNumero())) {
            System.out.println(getNumero() + " es un número primo.");
        } else {
            System.out.println(getNumero() + " no es un número primo.");
        }
    }
}
