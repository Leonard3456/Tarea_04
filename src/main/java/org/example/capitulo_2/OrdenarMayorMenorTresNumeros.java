package org.example.capitulo_2;

public class OrdenarMayorMenorTresNumeros {
    private int numero1;
    private int numero2;
    private int numero3;

    private int numeroin1;
    private int numeroin2;
    private int numeroin3;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    public void darValores(){
        numeroin1 =getNumero1();
        numeroin2 =getNumero2();
        numeroin3 =getNumero3();
    }
    public void ordenarMayorMenor() {
        if (numeroin1 < numeroin2) {
            int temp = numeroin1;
            numeroin1 = numeroin2;
            numero2 = temp;
        }
        if (numeroin2 < numeroin3) {
            int temp = numeroin2;
            numeroin2 = numeroin3;
            numeroin3 = temp;
        }
        if (numeroin1 < numeroin2) {
            int temp = numeroin1;
            numeroin1 = numeroin2;
            numeroin2 = temp;
        }
    }

    public void mostrarNumerosOrdenados() {
        System.out.println("Números ordenados de mayor a menor: " + numeroin1 + ", " + numeroin2 + ", " + numeroin3);
    }
}
