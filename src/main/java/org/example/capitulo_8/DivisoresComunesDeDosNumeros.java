package org.example.capitulo_8;

public class DivisoresComunesDeDosNumeros {
    public void mostrarDivisores() {
        int num1 = 12;
        int num2 = 18;

        System.out.println("Divisores comunes de " + num1 + " y " + num2 + ":");
        encontrarDivisoresComunes(num1, num2);
    }

    public void encontrarDivisoresComunes(int num1, int num2) {
        int menor = Math.min(num1, num2);
        for (int i = 1; i <= menor; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
            }
        }
    }
}
