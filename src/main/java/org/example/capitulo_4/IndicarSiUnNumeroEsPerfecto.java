package org.example.capitulo_4;

public class IndicarSiUnNumeroEsPerfecto {
    public int numero;

    public boolean esPerfecto() {
        int sumaDivisores = 0;
        // Comenzamos desde la mitad del número
        for (int i = numero / 2; i > 0; i--) {
            if (numero % i == 0) {
                sumaDivisores += i; // Acumulamos el divisor
            }
        }
        // revisamos si es igual los numeros divisores que el numero
        return sumaDivisores == numero;
    }

    public void mostrarSiEsPerfecto() {
        if (esPerfecto()) {
            System.out.println("El número " + numero + " es perfecto.");
        } else {
            System.out.println("El número " + numero + " no es perfecto.");
        }
    }

}
