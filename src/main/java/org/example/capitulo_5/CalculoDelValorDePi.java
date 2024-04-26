package org.example.capitulo_5;

public class CalculoDelValorDePi {

    public void mostrarValorPi() {
        float i = 1, pi4 = 0, signo = -1;

        do {
            signo = -signo; // cambia el signo en cada iteración
            pi4 = pi4 + signo * (1 / i);
            i = i + 2;
        } while (1 / i > 0.000001);

        System.out.println("Pi vale : " + 4 * pi4);
    }
}
