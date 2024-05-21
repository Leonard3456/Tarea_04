package org.example.capitulo_1;

public class HipotenusaTrianguloRectangulo {
    private double cateto1;
    private double cateto2;

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    double calcularHipotenusa() {
        double hipotenusa = Math.sqrt(Math.pow(getCateto1(), 2) + Math.pow(getCateto2(), 2));
        return hipotenusa;
    }

    public void mostrarHipotenusa() {
        System.out.println("La hipotenusa del triángulo es: " + calcularHipotenusa());
    }
}
