package org.example.capitulo_7;

public class LeerNumerosDeUnArrayEImprimirlos {

    // Definimos un arreglo de números
    private int[] numeros = {1, 2, 3, 4, 5};

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void imprimirNumeros(int[] numeros) {
        System.out.println("Números en el arreglo:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public void mostrarArray() {

        imprimirNumeros(numeros);
    }
}
