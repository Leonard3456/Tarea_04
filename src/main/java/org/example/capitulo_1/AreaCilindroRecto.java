package org.example.capitulo_1;

public class AreaCilindroRecto {
    private double radio;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

/*    public AreaCilindroRecto(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }*/

    double calcularArea() {
        double areaBases = 2 * Math.PI * Math.pow(radio, 2); // Área de las bases y el pow es para las potencias
        double areaLateral = 2 * Math.PI * getRadio() * getAltura(); // Área lateral
        return areaBases + areaLateral;
    }

    public void mostrarArea() {
        System.out.println("El área del cilindro es: " + calcularArea());
    }
}
