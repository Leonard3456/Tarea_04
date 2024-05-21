package org.example.capitulo_7;

public class MediaAritmeticaDeUnConjuntoDeDatos {
    private double[] datos;

    public double[] getDatos() {
        return datos;
    }

    public void setDatos(double[] datos) {
        this.datos = datos;
    }

    public double calcularMedia() {
        double suma = 0;

        // Sumamos todos los datos
        for (double dato : getDatos()) {
            suma += dato;
        }

        double media = suma / getDatos().length;
        return media;
    }

    public void mostrarMedia() {
        double media = calcularMedia();
        System.out.println("La media aritmética de los datos es: " + media);
    }
}
