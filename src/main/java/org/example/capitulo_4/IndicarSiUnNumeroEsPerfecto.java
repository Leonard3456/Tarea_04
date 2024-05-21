package org.example.capitulo_4;

public class IndicarSiUnNumeroEsPerfecto {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esPerfecto() {
        int sumaDivisores = 0;
        // Comenzamos desde la mitad del número
        for (int i = getNumero() / 2; i > 0; i--) {
            if (getNumero() % i == 0) {
                sumaDivisores += i; // Acumulamos el divisor
            }
        }
        // revisamos si es igual los numeros divisores que el numero
        return sumaDivisores == getNumero();
    }

    public void mostrarSiEsPerfecto() {
        if (esPerfecto()) {
            System.out.println("El número " + getNumero() + " es perfecto.");
        } else {
            System.out.println("El número " + getNumero() + " no es perfecto.");
        }
    }

}
