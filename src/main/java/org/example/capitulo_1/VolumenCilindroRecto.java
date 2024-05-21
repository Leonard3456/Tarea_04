package org.example.capitulo_1;

public class VolumenCilindroRecto {
    private double radio;
    private double altura;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen() {
        double volumen = Math.PI * Math.pow(getRadio(), 2) * getAltura();
        return volumen;
    }

    public void mostrarVolumen() {
        System.out.println("El volumen del cilindro es: " + calcularVolumen());
    }
}
