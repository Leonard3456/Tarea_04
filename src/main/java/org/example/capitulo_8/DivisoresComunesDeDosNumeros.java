package org.example.capitulo_8;

public class DivisoresComunesDeDosNumeros {

    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

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
