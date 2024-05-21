package org.example.capitulo_5;

public class                                                                                                                                            RaizCuadradaPorMetodoNewton {
    private double numero;
    private double tolerancia = 0.0001;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(double tolerancia) {
        this.tolerancia = tolerancia;
    }

    public double calcularRaizCuadrada() {
        double x0 = getNumero() / 2; // Aproximación inicial
        double x1;

        // repetir hasta que la diferencia entre x1 y x0 sea menor que la tolerancia
        do {
            x1 = 0.5 * (x0 + getNumero() / x0); // formula de Newton
            x0 = x1;
        } while (Math.abs(x1 - x0) > getTolerancia());

        return x1;
    }

    public void mostrarRaizCuadrada() {

        double raizCuadrada = calcularRaizCuadrada();
        System.out.println("La raíz cuadrada de " + getNumero() + " es: " + raizCuadrada);
    }
}
