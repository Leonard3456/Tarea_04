package org.example.capitulo_2;

public class OrdenarMayorMenorTresNumeros {
    public int numero1;
    public int numero2;
    public int numero3;

    public void ordenarMayorMenor() {
        if (numero1 < numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        if (numero2 < numero3) {
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        if (numero1 < numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
    }

    public void mostrarNumerosOrdenados() {
        System.out.println("Números ordenados de mayor a menor: " + numero1 + ", " + numero2 + ", " + numero3);
    }
}
