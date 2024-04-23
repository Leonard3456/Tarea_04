package org.example.capitulo_1;

public class VolumenCilindroRecto {
    public double radio;
    public double altura;

    public double calcularVolumen() {
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }

    public void mostrarVolumen() {
        System.out.println("El volumen del cilindro es: " + calcularVolumen());
    }
}
