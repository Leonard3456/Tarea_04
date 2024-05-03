package org.example.capitulo_8;

public class DivisoresComunesDeDosNumeros {

    int num1 = 12;
    int num2 = 18;
    public void encontrarDivisoresComunes(int num1, int num2) {
        int menor = Math.min(this.num1, this.num2);
        for (int i = 1; i <= menor; i++) {
            if (this.num1 % i == 0 && this.num2 % i == 0) {
                System.out.println(i);
            }
        }
    }

    public void mostrarDivisores() {
        System.out.println("Divisores comunes de " + num1 + " y " + num2 + ":");
        encontrarDivisoresComunes(num1, num2);
    }


}
