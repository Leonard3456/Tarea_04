package org.example.capitulo_1;

public class HipotenusaTrianguloRectangulo {
    public double cateto1;
    public double cateto2;

    double calcularHipotenusa() {
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }

    public void mostrarHipotenusa() {
        System.out.println("La hipotenusa del triángulo es: " + calcularHipotenusa());
    }
}
