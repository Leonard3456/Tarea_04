package org.example.capitulo_1;

public class AreaCilindroRecto {
    public double radio;
    public double altura;

    double calcularArea() {
        double areaBases = 2 * Math.PI * Math.pow(radio, 2); // Área de las bases y el pow es para las potencias
        double areaLateral = 2 * Math.PI * radio * altura; // Área lateral
        return areaBases + areaLateral;
    }

    public void mostrarArea() {
        System.out.println("El área del cilindro es: " + calcularArea());
    }
}
