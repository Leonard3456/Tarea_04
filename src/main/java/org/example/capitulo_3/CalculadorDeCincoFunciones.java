package org.example.capitulo_3;

public class CalculadorDeCincoFunciones {
    public double numero1;
    public double numero2;

    public double calcularSuma() {
        return numero1 + numero2;
    }

    public double calcularResta() {
        return numero1 - numero2;
    }

    public double calcularMultiplicacion() {
        return numero1 * numero2;
    }

    public double calcularDivision() {
        if (numero2 == 0) {
            System.out.println("Error: división por cero.");
            return Double.NaN; // Retorna Not-a-Number en caso de división por cero
        }
        return numero1 / numero2;
    }

    public double calcularPotencia() {
        return Math.pow(numero1, numero2);
    }

    public void mostrarResultados() {
        System.out.println("Suma: " + calcularSuma());
        System.out.println("Resta: " + calcularResta());
        System.out.println("Multiplicación: " + calcularMultiplicacion());
        System.out.println("División: " + calcularDivision());
        System.out.println("Potencia: " + calcularPotencia());
    }

}
