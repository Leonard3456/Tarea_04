package org.example.capitulo_5;

public class CantidadNumerosPositivosNegativosParesImparesIngresados {
    // Definimos los números
    int numero1 = 12;
    int numero2 = -5;
    int numero3 = 8;
    int numero4 = -3;
    int numero5 = 10;
    public void contarNumeros(int... numeros) {
        int positivos = 0, negativos = 0, pares = 0, impares = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    public void MostrarNumeros() {
        contarNumeros(numero1, numero2, numero3, numero4, numero5);
    }
}
