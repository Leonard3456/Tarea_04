package org.example.capitulo_1;

public class DistanciaEntreDosPuntos {
    public double x1, y1;
    public double x2, y2;
    double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

    public void mostrarDistancia() {
        System.out.println("La distancia entre los puntos es: " + calcularDistancia());
    }
}
