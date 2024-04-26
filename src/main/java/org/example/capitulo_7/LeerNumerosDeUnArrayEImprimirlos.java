package org.example.capitulo_7;

public class LeerNumerosDeUnArrayEImprimirlos {

    public void imprimirNumeros(int[] numeros) {
        System.out.println("Números en el arreglo:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public  void mostrarArray() {
        // Definimos un arreglo de números
        int[] numeros = {1, 2, 3, 4, 5};

        imprimirNumeros(numeros);
    }
}
