package org.example.capitulo_4;

public class LeerNumero_e_InvertirSusCifras {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int invertirCifras() {
        int numeroOriginal = getNumero(); // Guardamos el número original
        int invertido = 0;
        while (numeroOriginal != 0) {
            int digito = numeroOriginal % 10; // Obtener el último dígito
            invertido = invertido * 10 + digito; // Agregar el dígito al número invertido
            numeroOriginal /= 10; // Eliminar el último dígito del número original
        }
        return invertido;
    }

    public void mostrarNumeroInvertido() {
        int numeroInvertido = invertirCifras();
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
