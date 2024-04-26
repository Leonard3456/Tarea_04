package org.example.capitulo_6;

public class PromedioDe_n_Numeros {
    public double calcularPromedio(int... numeros) {
        int suma = 0;
        for (int numero : numeros) { //es un arreglo de números enteros y numero es una variable que
                                    //representa cada elemento del arreglo en cada iteración del bucle.
            suma += numero;
        }
        return (double) suma / numeros.length;
    }

    public void mostrarPromedio() {
        double promedio = calcularPromedio(10, 5, 20, 17, 8, 20);
        System.out.println("El promedio de los números es: " + promedio);
    }
}
