package org.example.capitulo_3;

public class CalculadorDeCincoFunciones {
    private double numero1;
    private double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double calcularSuma() {
        return getNumero1() + getNumero2();
    }

    public double calcularResta() {
        return getNumero1() - getNumero2();
    }

    public double calcularMultiplicacion() {
        return getNumero1() * getNumero2();
    }

    public double calcularDivision() {
        if (getNumero2() == 0) {
            System.out.println("Error: división por cero.");
            return Double.NaN; // Retorna Not-a-Number en caso de división por cero
        }
        return getNumero1() / getNumero2();
    }

    public double calcularPotencia() {
        return Math.pow(getNumero1(), getNumero2());
    }

    public void mostrarResultados() {
        System.out.println("Suma: " + calcularSuma());
        System.out.println("Resta: " + calcularResta());
        System.out.println("Multiplicación: " + calcularMultiplicacion());
        System.out.println("División: " + calcularDivision());
        System.out.println("Potencia: " + calcularPotencia());
    }

}
