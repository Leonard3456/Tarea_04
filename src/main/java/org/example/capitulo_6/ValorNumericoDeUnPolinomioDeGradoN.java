package org.example.capitulo_6;

import java.util.Scanner;

public class ValorNumericoDeUnPolinomioDeGradoN {

    public void mostrarValor() {
        //Scanner scanner = new Scanner(System.in);

        System.out.print("Grado del polinomio: ");
        int n = 4;

        System.out.print("Valor de x: ");
        float x = 2;

        float valor = 0;

        //System.out.println("Ingrese coeficientes:");
        for (int i = n; i >= 0; i--) {
            System.out.print("Coeficiente término grado " + i + ": ");
            float coef = x;
            valor = valor * x + coef;
        }

        System.out.println("Valor numérico: " + valor);

       // scanner.close();
    }
}
