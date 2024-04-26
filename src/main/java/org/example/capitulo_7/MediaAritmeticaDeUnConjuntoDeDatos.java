package org.example.capitulo_7;

public class MediaAritmeticaDeUnConjuntoDeDatos {
    public double calcularMedia(double[] datos) {
        double suma = 0;

        // Sumamos todos los datos
        for (double dato : datos) {
            suma += dato;
        }

        double media = suma / datos.length;
        return media;
    }

    public void mostrarMedia() {
        double[] datos = {10, 20, 30, 40, 50};

        double media = calcularMedia(datos);

        System.out.println("La media aritmética de los datos es: " + media);
    }
}
