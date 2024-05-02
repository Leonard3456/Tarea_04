package org.example.capitulo_5;

public class RaizCuadradaPorMetodoNewton {
    public double numero;
    public double tolerancia = 0.0001;

    public double calcularRaizCuadrada() {
        double x0 = numero / 2; // Aproximación inicial
        double x1;

        // repetir hasta que la diferencia entre x1 y x0 sea menor que la tolerancia
        do {
            x1 = 0.5 * (x0 + numero / x0); // formula de Newton
            x0 = x1;
        } while (Math.abs(x1 - x0) > tolerancia);

        return x1;
    }

    public void mostrarRaizCuadrada() {

        double raizCuadrada = calcularRaizCuadrada();
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}
